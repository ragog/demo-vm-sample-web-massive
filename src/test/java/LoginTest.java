import data.Credentials;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.LoginPage;
import page.StorePage;

import java.lang.reflect.Method;
import java.net.MalformedURLException;

public class LoginTest extends AbstractTest {

    @Test(dataProvider = "hardCodedBrowsers")
    public void loginWithValidCredentials(String browserName, String browserVersion, String platformName, Method method) throws MalformedURLException {

        this.setup(browserName, browserVersion, platformName, method);

        LoginPage loginPage = new LoginPage(getWebDriver());
        loginPage.load();
        loginPage.performLogin(Credentials.USER_VALID);

        StorePage storePage = new StorePage(getWebDriver());
        Assert.assertTrue(storePage.isActive());

    }

    @Test(dataProvider = "hardCodedBrowsers")
    public void loginWithLockedCredentials(String browserName, String browserVersion, String platformName, Method method) throws MalformedURLException {

        this.setup(browserName, browserVersion, platformName, method);

        LoginPage loginPage = new LoginPage(getWebDriver());
        loginPage.load();
        loginPage.performLogin(Credentials.USER_LOCKEDOUT);

        Assert.assertTrue(loginPage.isActive());

    }

    @Test(dataProvider = "hardCodedBrowsers")
    public void loginWithEmptyCredentials(String browserName, String browserVersion, String platformName, Method method) throws MalformedURLException {

        this.setup(browserName, browserVersion, platformName, method);

        LoginPage loginPage = new LoginPage(getWebDriver());
        loginPage.load();
        loginPage.performLogin(Credentials.EMPTY);

        Assert.assertTrue(loginPage.isActive());

    }

    @Test(dataProvider = "hardCodedBrowsers")
    public void loginWithEmptyUsername(String browserName, String browserVersion, String platformName, Method method) throws MalformedURLException {

        this.setup(browserName, browserVersion, platformName, method);

        LoginPage loginPage = new LoginPage(getWebDriver());
        loginPage.load();
        loginPage.performLogin(Credentials.EMPTY_USERNAME);

        Assert.assertTrue(loginPage.isActive());

    }

    @Test(dataProvider = "hardCodedBrowsers")
    public void loginWithEmptyPassword(String browserName, String browserVersion, String platformName, Method method) throws MalformedURLException {

        this.setup(browserName, browserVersion, platformName, method);

        LoginPage loginPage = new LoginPage(getWebDriver());
        loginPage.load();
        loginPage.performLogin(Credentials.EMPTY_PASSWORD);

        Assert.assertTrue(loginPage.isActive());

    }

    @Test(dataProvider = "hardCodedBrowsers")
    public void loginWithInvalidCredentials(String browserName, String browserVersion, String platformName, Method method) throws MalformedURLException {

        this.setup(browserName, browserVersion, platformName, method);

        LoginPage loginPage = new LoginPage(getWebDriver());
        loginPage.load();
        loginPage.performLogin(Credentials.USER_INVALID_ALL);
        Assert.assertTrue(loginPage.errorMessageIsShown());

    }

    @Test(dataProvider = "hardCodedBrowsers")
    public void loginWithInvalidUsername(String browserName, String browserVersion, String platformName, Method method) throws MalformedURLException {

        this.setup(browserName, browserVersion, platformName, method);

        LoginPage loginPage = new LoginPage(getWebDriver());
        loginPage.load();
        loginPage.performLogin(Credentials.USER_INVALID_USER);

        Assert.assertTrue(loginPage.isActive());

    }

    @Test(dataProvider = "hardCodedBrowsers")
    public void loginWithInvalidPassword(String browserName, String browserVersion, String platformName, Method method) throws MalformedURLException {

        this.setup(browserName, browserVersion, platformName, method);

        LoginPage loginPage = new LoginPage(getWebDriver());
        loginPage.load();
        loginPage.performLogin(Credentials.USER_INVALID_PASSWORD);

        Assert.assertTrue(loginPage.isActive());

    }

}
