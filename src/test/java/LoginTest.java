import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;
    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();

        driver.manage().window().maximize();

    }

    @Test
    public void testLo() throws InterruptedException{

        driver.get("https://practicetestautomation.com/practice-test-login/");
        Thread.sleep(2000);
        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("submit")).click();
        Thread.sleep(2000);
//        Assert.assertTrue(driver.getPageSource().contains("Login Successful"));
//        Assert.assertTrue(driver.getPageSource().contains("Congratulations"));
        Assert.assertTrue(driver.getPageSource().contains("Logged In Successfully"));


        System.out.println("Dang nhap thanh cong");


    }
    @AfterClass
    public void tearDown(){

        driver.quit();
    }

}
