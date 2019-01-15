package page;

import data.Credentials;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends AbstractPage {

    @FindBy(css = "input[type='text']")
    private WebElement usernameField;

    @FindBy(css = "input[type='password']")
    private WebElement passwordField;

    @FindBy(css = "input[type='submit']")
    private WebElement loginButton;

    private By errorMessageBy = By.cssSelector("h3[data-test='error']");

    private final String url = "https://www.saucedemo.com";

    public LoginPage(RemoteWebDriver driver) {
        super(driver);
    }

    public void load(){
        driver.get(url);
    }

    public void performLogin(Credentials credentials) {
        takeScreenshot();
        usernameField.sendKeys(credentials.username);
        takeScreenshot();
        passwordField.sendKeys(credentials.password);
        takeScreenshot();
        passwordField.sendKeys("\n"); // TODO remove after app has been optimised for mobile
        if (isActive()) {
            loginButton.click();
        }

        takeScreenshot();
    }

    public boolean errorMessageIsShown() {
        try {
            new WebDriverWait(driver, STANDARD_TIMEOUT)
                    .until(ExpectedConditions.visibilityOfElementLocated(errorMessageBy));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }

    }

    @Override
    public boolean isActive () {
        return isElementShown(By.cssSelector("input[type='text']"));
    }

}
