package annotations;

import org.testng.Assert;
import org.testng.annotations.*;
import suite.TestBaseSuite;

// Order of execution:
// @BeforeSuite
// @BeforeTest
// @BeforeClass
// ------------
// @BeforeMethod
// @Test - 1
// @AfterMethod
// ------------
// @BeforeMethod
// @Test - 2
// @AfterMethod
// ------------
// @AfterClass
// @AfterTest
// @AfterSuite
public class TestAnnotations extends TestBaseSuite {

    @BeforeClass //The annotated method will be run before the first test method in the current class is invoked.
    public void beforeClass() {
        System.out.print("\033[0;34m");
        System.out.println("@BeforeClass1");
    }

    @BeforeMethod // The annotated method will be run before each test method.
    public void setUp() {
        System.out.println("@BeforeMethod1");
    }

    @Test(description = "This is a TestNG 1st test.")
    public void testingTestNGAnnotations() {
        System.out.println("@Test1 - 1");
        Assert.assertTrue(true, "Error message.");
    }

    @Test(description = "This is a TestNG 2nd test.")
    public void testingTestNGAnnotations2() {
        System.out.println("@Test1 - 2");
        Assert.assertTrue(true, "Error message.");
    }

    @AfterMethod // The annotated method will be run after each test method.
    public void tearDown() {
        System.out.println("@AfterMethod1");
    }

    @AfterClass // The annotated method will be run after all the test methods in the current class have been run.
    public void afterClass() {
        System.out.println("@AfterClass1");
        System.out.print("\033[0m");
    }

}


