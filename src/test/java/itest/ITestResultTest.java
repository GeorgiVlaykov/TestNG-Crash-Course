package itest;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
@Test
public class ITestResultTest {

    public void testA() {
        System.out.println("testA");
        Assert.assertTrue(true, "Error message.");
    }

    public void testB() {
        System.out.println("testB");
        Assert.assertTrue(true, "Error message.");
    }

    @AfterMethod
    public void afterTests(ITestResult iTestResult) {
        if (iTestResult.getStatus() == ITestResult.SUCCESS) {
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }

    }
}
