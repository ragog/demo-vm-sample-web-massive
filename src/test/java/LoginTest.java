import data.Credentials;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.LoginPage;
import page.StorePage;

import java.lang.reflect.Method;
import java.net.MalformedURLException;

public class LoginTest extends AbstractTest {

    @Test(dataProvider = "hardCodedBrowsers")
    public void loginWithValidCredentials(String platformName, String platformVersion,
                                          String deviceName, String browserName, Method method) throws MalformedURLException {

        this.setup(platformName, platformVersion, deviceName, browserName, method);

        LoginPage loginPage = new LoginPage(getWebDriver());
        loginPage.load();
        loginPage.performLogin(Credentials.USER_VALID);

        StorePage storePage = new StorePage(getWebDriver());
        Assert.assertTrue(storePage.isActive());

    }

    @Test(dataProvider = "hardCodedBrowsers")
    public void loginWithLockedCredentials(String platformName, String platformVersion,
                                           String deviceName, String browserName, Method method) throws MalformedURLException {

        this.setup(platformName, platformVersion, deviceName, browserName, method);

        LoginPage loginPage = new LoginPage(getWebDriver());
        loginPage.load();
        loginPage.performLogin(Credentials.USER_LOCKEDOUT);

        Assert.assertTrue(loginPage.isActive());

    }

    @Test(dataProvider = "hardCodedBrowsers")
    public void loginWithEmptyCredentials(String platformName, String platformVersion,
                                          String deviceName, String browserName, Method method) throws MalformedURLException {

        this.setup(platformName, platformVersion, deviceName, browserName, method);

        LoginPage loginPage = new LoginPage(getWebDriver());
        loginPage.load();
        loginPage.performLogin(Credentials.EMPTY);

        Assert.assertTrue(loginPage.isActive());

    }

    @Test(dataProvider = "hardCodedBrowsers")
    public void loginWithEmptyUsername(String platformName, String platformVersion,
                                       String deviceName, String browserName, Method method) throws MalformedURLException {

        this.setup(platformName, platformVersion, deviceName, browserName, method);

        LoginPage loginPage = new LoginPage(getWebDriver());
        loginPage.load();
        loginPage.performLogin(Credentials.EMPTY_USERNAME);

        Assert.assertTrue(loginPage.isActive());

    }

    @Test(dataProvider = "hardCodedBrowsers")
    public void loginWithEmptyPassword(String platformName, String platformVersion,
                                       String deviceName, String browserName, Method method) throws MalformedURLException {

        this.setup(platformName, platformVersion, deviceName, browserName, method);

        LoginPage loginPage = new LoginPage(getWebDriver());
        loginPage.load();
        loginPage.performLogin(Credentials.EMPTY_PASSWORD);

        Assert.assertTrue(loginPage.isActive());

    }

    @Test(dataProvider = "hardCodedBrowsers")
    public void loginWithInvalidCredentials(String platformName, String platformVersion,
                                            String deviceName, String browserName, Method method) throws MalformedURLException {

        this.setup(platformName, platformVersion, deviceName, browserName, method);

        LoginPage loginPage = new LoginPage(getWebDriver());
        loginPage.load();
        loginPage.performLogin(Credentials.USER_INVALID_ALL);
        Assert.assertTrue(loginPage.errorMessageIsShown());

    }

    @Test(dataProvider = "hardCodedBrowsers")
    public void loginWithInvalidUsername(String platformName, String platformVersion,
                                         String deviceName, String browserName, Method method) throws MalformedURLException {

        this.setup(platformName, platformVersion, deviceName, browserName, method);

        LoginPage loginPage = new LoginPage(getWebDriver());
        loginPage.load();
        loginPage.performLogin(Credentials.USER_INVALID_USER);

        Assert.assertTrue(loginPage.isActive());

    }

    @Test(dataProvider = "hardCodedBrowsers")
    public void loginWithInvalidPassword(String platformName, String platformVersion,
                                         String deviceName, String browserName, Method method) throws MalformedURLException {

        this.setup(platformName, platformVersion, deviceName, browserName, method);

        LoginPage loginPage = new LoginPage(getWebDriver());
        loginPage.load();
        loginPage.performLogin(Credentials.USER_INVALID_PASSWORD);

        Assert.assertTrue(loginPage.isActive());

    }

}
