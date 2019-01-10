package page;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by grago on 27.09.17.
 */
public abstract class AbstractPage {

    protected RemoteWebDriver driver;
    protected final int STANDARD_TIMEOUT= 10;

    private boolean isRDC;

    public AbstractPage(RemoteWebDriver driver) {
        this.driver = driver;
//        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofMillis(10000)), this);
        isRDC = (driver.getCapabilities().getCapability("testobject_api_key") != null);
    }

    public void takeScreenshot() {
        if (isRDC) { driver.getScreenshotAs(OutputType.BASE64); };
    }

    public boolean isElementShown(By elementBy) {
        try {
            new WebDriverWait(driver, STANDARD_TIMEOUT)
                    .until(ExpectedConditions.visibilityOfElementLocated(elementBy));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    abstract boolean isActive();

}
