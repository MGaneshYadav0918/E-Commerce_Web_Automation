package utilityMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {
    public  WebDriver driver;
    @BeforeClass
    public void BaseTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://web-playground.ultralesson.com/");
    }

   @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
