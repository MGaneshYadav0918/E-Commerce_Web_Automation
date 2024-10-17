package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pomRepo.HomePage;
import pomRepo.ProductPage;
import utilityMethods.BaseTest;

import java.time.Duration;

public class TC01_IdentifyProductTest extends BaseTest {

    @Test
    public void testAddCart() {
        HomePage homePage = new HomePage(driver);
        String actul_AppText="ul-web-playground";
        Assert.assertEquals(homePage.getHomePageTitleText().getText(), actul_AppText,"ul-web-playground is not displayed");
        homePage.clickProduct("16 Ti Skis");
        String actual_ProductTitle="16 Ti Skis";
        ProductPage productPage = new ProductPage(driver);
        Assert.assertEquals(actual_ProductTitle,(productPage.getProductTitle().getText()),"Selected product is not displayed");
    }
}
