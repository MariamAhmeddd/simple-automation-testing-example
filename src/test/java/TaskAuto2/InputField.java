package TaskAuto2;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputField {

    WebDriver driver;

    @BeforeTest

    void open ()
    {

        System.setProperty("webdriver.edge.driver","C:\\Program Files\\Edge_Driver\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/inputs");

    }

    @Test

    void goToInput()
    {

        WebElement inputField = driver.findElement(By.cssSelector("input[type=\"number\"]"));
        Assert.assertEquals(true,inputField.isEnabled());

    }

    @AfterTest

    void close()
    {

        driver.quit();

    }
}
