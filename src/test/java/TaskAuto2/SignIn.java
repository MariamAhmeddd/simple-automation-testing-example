package TaskAuto2;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class SignIn {

    WebDriver driver;
    @BeforeTest
    public void open()
    {
        System.setProperty("webdriver.edge.driver","C:\\Program Files\\Edge_Driver\\msedgedriver.exe");
        driver= new EdgeDriver();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    @Test
    public void test()
    {
        WebElement username = driver.findElement(By.cssSelector("input[Id='email']"));
        username.sendKeys("TestNG@Framework.com");

        WebElement password = driver.findElement(By.cssSelector("input[Id='passwd']"));
        password.sendKeys("TestNG1234");

        WebElement buttton = driver.findElement(By.cssSelector("button[Id='SubmitLogin']"));
        buttton.click();

        String expr = "http://automationpractice.com/index.php?controller=my-account";
        String actr = driver.getCurrentUrl();
        Assert.assertEquals(expr,actr);
        //System.out.println("sing in successfully");
    }

    @AfterTest
    public void close()
    {
        driver.quit();
    }
}
