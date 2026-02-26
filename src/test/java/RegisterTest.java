import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class RegisterTest {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testRegisterSuccess() throws InterruptedException {

        driver.get("https://demoqa.com/automation-practice-form");
        Thread.sleep(2000);

        driver.findElement(By.id("firstName")).sendKeys("Tran");
        driver.findElement(By.id("lastName")).sendKeys("Quyen");
        driver.findElement(By.id("userEmail")).sendKeys("quyen@gmail.com");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();",
                driver.findElement(By.xpath("//label[text()='Male']")));

        driver.findElement(By.id("userNumber")).sendKeys("0123456789");

        js.executeScript("arguments[0].click();",
                driver.findElement(By.id("submit")));

        Thread.sleep(2000);

        Assert.assertTrue(
                driver.findElement(By.id("example-modal-sizes-title-lg"))
                        .getText().contains("Thanks")
        );

        System.out.println("Dang ky thanh cong");
    }



    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
