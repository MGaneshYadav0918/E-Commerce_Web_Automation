package pomRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilityMethods.BaseTest;

public class HomePage extends BaseTest {
    //public WebDriver driver;
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//span[@class='h2']")
    private WebElement HomePageTitleText;

    public WebElement getHomePageTitleText() {
        return HomePageTitleText;
    }

    public void clickProduct(String productName) {
        WebElement product = driver.findElement(By.xpath("//slider-component[@class='slider-mobile-gutter']//h3/a[contains(text(),'"+ productName +"')]"));
        product.click();
    }
}
