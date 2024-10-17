package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends HomePage {

    public ProductPage (WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1[@class='product__title']")
    private WebElement productTitle;

    public WebElement getProductTitle() {
        return productTitle;
    }
    @FindBy(xpath="//button[@type='submit']/span")
    private WebElement addToCartButton;
    public WebElement getAddToCartButton() {
        return addToCartButton;
    }
    public void clickOnAddToCartButton() {
        addToCartButton.click();
    }
}
