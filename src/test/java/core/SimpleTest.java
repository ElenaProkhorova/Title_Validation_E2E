package core;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by ElenaStadlin on 4/3/15.
 */
public class SimpleTest {
    @Test
    public void myTest() {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.learn2test.net/");
        Assert.assertTrue(driver.getTitle().contains("learn2test.net"));
        driver.close();
    }
}
