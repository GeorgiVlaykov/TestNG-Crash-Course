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

// @BeforeSuite
// @BeforeTest
// @BeforeTest2
// @BeforeClass
// @BeforeMethod
// @Test - 1
// @AfterMethod
// @BeforeMethod
// @Test - 2
// @AfterMethod
// @AfterClass
// @BeforeClass2
// @BeforeMethod2
// @Test2 - 1
// @AfterMethod2
// @BeforeMethod2
// @Test2 - 2
// @AfterMethod2
// @AfterClass2
// @AfterTest
// @AfterTest2
// @AfterSuite
public class TestAnnotations2 extends TestBaseSuite {
    @BeforeClass //The annotated method will be run before the first test method in the current class is invoked.
    public void beforeClass() {
        System.out.print("\033[0;92m");
        System.out.println("@BeforeClass2");
    }

    @BeforeMethod // The annotated method will be run before each test method.
    public void setUp() {
        System.out.println("@BeforeMethod2");
    }

    @Test(description = "This is a TestNG 1st test.")
    public void testingTestNGAnnotations() {
        System.out.println("@Test2 - 1");
        Assert.assertTrue(true, "Error message.");
    }

    @Test(description = "This is a TestNG 2nd test.")
    public void testingTestNGAnnotations2() {
        System.out.println("@Test2 - 2");
        Assert.assertTrue(true, "Error message.");
    }

    @AfterMethod // The annotated method will be run after each test method.
    public void tearDown() {
        System.out.println("@AfterMethod2");
    }

    @AfterClass // The annotated method will be run after all the test methods in the current class have been run.
    public void afterClass() {
        System.out.println("@AfterClass2");
        System.out.print("\033[0m");
    }


}


