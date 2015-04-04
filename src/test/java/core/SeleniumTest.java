package core;


import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import org.junit.*;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;

@RunWith(Parameterized.class)
public class SeleniumTest {

    // Test data generator
    @Parameters(name = "Iteration # {index} : exp: {1}; act: {2}")
    public static Collection<String[]> data() throws IOException {
        core.Selenium selenium = new core.Selenium();
        return Arrays.asList(selenium.a2d());
    }
    // @Parameter for Field injection instead of Constructor
    @Parameter(value = 0)
    public String test_id;
    @Parameter(value = 1)
    public String expectedTitle;
    @Parameter(value = 2)
    public String actualTitle;

    @Test
    public void test_Title_Validation()  throws ComparisonFailure {
        System.out.println("Test Case: " + test_id +
                " Expected Title: " + expectedTitle +
                " Actual Title: " + actualTitle);
        Assert.assertEquals("Wrong title", expectedTitle, actualTitle);
    }
}
