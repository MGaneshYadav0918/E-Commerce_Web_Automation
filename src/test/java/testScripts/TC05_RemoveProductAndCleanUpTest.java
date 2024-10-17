package testScripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import pomRepo.AddToCartPage;
import pomRepo.HomePage;
import pomRepo.ProductPage;
import utilityMethods.BaseTest;

public class TC05_RemoveProductAndCleanUpTest extends BaseTest {
    @Test
    public void testRemoveProductAndCleanUp() throws InterruptedException {
        String productName="15mm Combo Wrench";
        HomePage homePage = new HomePage(driver);
        homePage.clickProduct(productName);
        ProductPage productPage = new ProductPage(driver);
        Assert.assertEquals(productName,productPage.getProductTitle().getText(),"Product Title does not match");
        productPage.clickOnAddToCartButton();
        Thread.sleep(2000);
        //WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        AddToCartPage addToCartPage = new AddToCartPage(driver);
        String actual_ItemAddedText="Item added to your cart";
        String expected_ItemAddedText=addToCartPage.getItemAddedText().getText();
        Assert.assertEquals(actual_ItemAddedText,expected_ItemAddedText,"Item is not added to your cart");
        String actual_viewMyCartText="View my cart";
        String expected_viewMyCartText=addToCartPage.getViewMyCartBtn().getText();
        Assert.assertTrue(expected_viewMyCartText.contains(actual_viewMyCartText),"View my cart is not displayed");
        addToCartPage.clickViewMyCartBtn();
        Assert.assertEquals(productName,addToCartPage.getProductTitle().getText(),"Product Title does not match");
        addToCartPage.clickRemoveButton();
        Thread.sleep(2000);
        String actual_emptyText="Your cart is empty";
        String expected_emptyText=addToCartPage.getEmptyText().getText();
        Assert.assertEquals(actual_emptyText,expected_emptyText,"Empty text is not displayed");
    }
}
