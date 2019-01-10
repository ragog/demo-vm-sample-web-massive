import data.Credentials;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.CheckoutPage;
import page.LoginPage;
import page.StorePage;

import java.lang.reflect.Method;
import java.net.MalformedURLException;

public class CheckoutTest extends AbstractTest {

    @Test(dataProvider = "hardCodedBrowsers")
    public void addItemToBasket(String browserName, String browserVersion, String platformName, Method method) throws MalformedURLException {

        this.setup(browserName, browserVersion, platformName, method);

        LoginPage loginPage = new LoginPage(getWebDriver());
        loginPage.load();
        loginPage.performLogin(Credentials.USER_VALID);

        StorePage storePage = new StorePage(getWebDriver());
        storePage.addFirstProductToBasket();
        storePage.navigateToCart();

        Assert.assertEquals(new CheckoutPage(getWebDriver()).basketCount(), 1);
    }

}
