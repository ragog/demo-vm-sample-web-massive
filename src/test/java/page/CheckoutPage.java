package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckoutPage extends AbstractPage {

    @FindBy(css = "div.cart_item")
    private List<WebElement> cartItems;

    public CheckoutPage(RemoteWebDriver driver) {
        super(driver);
    }

    public int basketCount() {
        return cartItems.size();
    }

    @Override
    boolean isActive() {
        return false;
    }

}
