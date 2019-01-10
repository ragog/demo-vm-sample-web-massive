package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class StorePage extends AbstractPage {

    @FindBy(css = "img.inventory_item_img")
    private List<WebElement> productImages;

    @FindBy(css = "button.add-to-cart-button")
    private List<WebElement> addToCartButtons;

    @FindBy(css = ".shopping_cart_link")
    private WebElement cartButton;

    private By priceTagElementBy = By.cssSelector("div.inventory_details_price");
    private By anchorElementBy = By.cssSelector(".product_label");

    public StorePage(RemoteWebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isActive() {
        return isElementShown(anchorElementBy);
    }

    public void selectFirstProduct() {
        productImages.get(0).click();
    }

    public void addFirstProductToBasket() {
        addToCartButtons.get(0).click();
    }

    public boolean isPriceShown() {
        return isElementShown(priceTagElementBy);
    }

    public void navigateToCart() {
        cartButton.click();;
    }

}
