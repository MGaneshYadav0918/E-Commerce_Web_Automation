package testScripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import pomRepo.HomePage;
import pomRepo.ProductPage;
import utilityMethods.BaseTest;

public class TC02_ProductAvailabilityTest extends BaseTest {

    @Test
    public void testProductAvailability() {
        String productName="12 Ti Xelium Skis";
        HomePage homePage = new HomePage(driver);
        homePage.clickProduct(productName);
        ProductPage productPage = new ProductPage(driver);

        Assert.assertEquals(productName,productPage.getProductTitle().getText(),"Product Title does not match");
        if(productPage.getAddToCartButton().getText().contains("Sold out")) {
            System.out.println("Product is sold out. Exiting the test.");
        } else if (productPage.getAddToCartButton().getText().contains("Add to cart")) {
            productPage.clickOnAddToCartButton();
            System.out.println("Product is added to cart. Exiting the test.");
        }
    }

}
