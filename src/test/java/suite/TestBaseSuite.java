package suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestBaseSuite {

    @BeforeSuite // The annotated method will be run before all tests in this suite have run.
    public void beforeSuiteMethod() {
        System.out.println("@BeforeSuite");
    }

    @AfterSuite // The annotated method will be run after all tests in this suite have run.
    public void afterSuiteMethod() {
        System.out.println("@AfterSuite");
    }

    @BeforeTest
    // The annotated method will be run before any test method belonging to the classes inside the <test> tag is run.
    public void beforeTestMethod() {
        System.out.println("@BeforeTest");
    }

    @AfterTest
    //The annotated method will be run after all the test methods belonging to the classes inside the <test> tag have run.
    public void afterTestMethod() {
        System.out.println("@AfterTest");
    }

//    @BeforeGroups // The list of groups that this configuration method will run before.
//    // This method is guaranteed to run shortly before the first test method that belongs to any of these groups is invoked.
//    public void beforeGroupsMethod() {
//        System.out.println("@BeforeGroups");
//    }
//
//    @AfterGroups // The list of groups that this configuration method will run after.
//    // This method is guaranteed to run shortly after the last test method that belongs to any of these groups is invoked.
//    public void afterGroupsMethod() {
//        System.out.println("@AfterGroups");
//    }
}
