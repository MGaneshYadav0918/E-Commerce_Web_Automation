package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartPage extends HomePage {

    public AddToCartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h2[contains(text(),'Item added to your cart')]")
    public WebElement itemAddedText;
    public WebElement getItemAddedText() {
        return itemAddedText;
    }

    @FindBy(xpath = "//a[contains(text(),'View my cart')]")
    private WebElement viewMyCartBtn;
    public WebElement getViewMyCartBtn() {
        return viewMyCartBtn;
    }
    public void clickViewMyCartBtn() {
        viewMyCartBtn.click();
    }
    @FindBy(xpath = "//a[@class='cart-item__name h4 break']")
    private WebElement productTitle;
    public WebElement getProductTitle() {
        return productTitle;
    }
    @FindBy(xpath = "//p[@class='totals__subtotal-value']")
    private WebElement subTotalText;
    public WebElement getSubTotalText() {
        return subTotalText;
    }

    @FindBy(id="Remove-1")
    private WebElement removeButton;
    public WebElement getRemoveButton() {
        return removeButton;
    }
    public void clickRemoveButton() {
        removeButton.click();
    }
    @FindBy(xpath = "//h1[@class='cart__empty-text']")
    private WebElement emptyText;
    public WebElement getEmptyText() {
        return emptyText;
    }



}
