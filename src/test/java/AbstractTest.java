import com.saucelabs.saucerest.SauceREST;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by grago on 27.09.17.
 */
public class AbstractTest {

    private ThreadLocal<RemoteWebDriver> webDriver = new ThreadLocal<>();
    private ThreadLocal<String> sessionId = new ThreadLocal<>();

    private String sauceURI = "@ondemand.saucelabs.com";
    private String buildTag = System.getenv("BUILD_TAG");
    private String username = System.getenv("SAUCE_USERNAME");
    private String accesskey = System.getenv("SAUCE_ACCESS_KEY");
    private String extendedDebugging = System.getenv("EXT_DEBUGGING");
    private SauceREST sauceRESTClient = new SauceREST(username, accesskey);

    @DataProvider(name = "hardCodedBrowsers", parallel = true)
    public static Object[][] sauceBrowserDataProvider(Method testMethod) {
        return TestTarget.mixedWithoutWindows;
    }

    public RemoteWebDriver getWebDriver() {
            return webDriver.get();
    }

    public String getSessionId() {
        return sessionId.get();
    }

    public void setup(String browserName, String browserVersion, String platformName,
                      Method method) throws MalformedURLException {

        // Silence Selenium logger
        Logger.getLogger("org.openqa.selenium.remote").setLevel(Level.OFF);

        String testName = method.getName();

        String testId = UUID.randomUUID().toString();

        DesiredCapabilities capabilities = new DesiredCapabilities();
        String gridEndpoint = "";

        if (buildTag != null) {
            capabilities.setCapability("build", buildTag);
        }

        capabilities.setCapability("browserName", browserName);
        capabilities.setCapability("extendedDebugging", extendedDebugging);
        capabilities.setCapability("platform", platformName);
        capabilities.setCapability("version", browserVersion);
        capabilities.setCapability("name", testName);
        capabilities.setCapability("uuid", testId);

        gridEndpoint = "https://" + username + ":" + accesskey + sauceURI + "/wd/hub";

        webDriver.set(new RemoteWebDriver(new URL(gridEndpoint), capabilities));

        // set current sessionId
        String id = getWebDriver().getSessionId().toString();
        sessionId.set(id);

    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(ITestResult result) {
        if (webDriver != null) {
            String sessionId = getWebDriver().getSessionId().toString();
            boolean status = result.isSuccess();

            // Sauce REST API (updateJob)
            Map<String, Object> updates = new HashMap<String, Object>();
            updates.put("passed", status);
            sauceRESTClient.updateJobInfo(sessionId, updates);

            getWebDriver().quit();
        }

    }

}
