package TaskAuto2;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ShiftingContent {
    WebDriver driver;

    @BeforeTest

    void open()
    {
        System.setProperty("webdriver.edge.driver","C:\\Program Files\\Edge_Driver\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/shifting_content/menu");
    }

    @Test

    void count()
    {
        int numberOfElement= driver.findElements(By.xpath("//ul/*")).size();
        //System.out.println(numberOfElement);
        Assert.assertEquals(6,numberOfElement);
    }

    @AfterTest

    void close()
    {
        driver.quit();
    }
}
