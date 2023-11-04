package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Test
public class HardAndSoftAssertionsTest {
    // default value to "enabled" is true.
    // @Test timeout takes precedence than the timeout set for the suite in the .xml
    @Test(enabled = false, timeOut = 7000)
    public void hardAssertionsTest() {
        try {
            Assert.assertTrue(false, "String message");
        } catch (Throwable t) {
            System.out.println("End of the hardAssertionsTest.");
        }
    }

    public void softAssertionsTest() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(false, "Custom String message for assertTrue:");
        softAssert.assertEquals(1, 5, "Custom String message for assertEquals:");
        System.out.println("End of the softAssertionsTest.");

        softAssert.assertAll("There was a failure.");

    }
}
