package annotations;


import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
// Using the new annotation @Ignore, TestNG lets you ignore all the @Test methods :
//      - In a class (or)
//      - In a particular package (or)
//      - In a package and all of its child packages
// When used at the method level @Ignore annotation is functionally equivalent to @Test(enabled=false).
// The @Ignore annotation has a higher priority than individual @Test method annotations.
// When @Ignore is placed on a class, all the tests in that class will be disabled.
// To ignore all tests in a particular package, you just need to create package-info.java and add the @Ignore annotation to it.
// This causes all the @Test methods to be ignored in the package and all of its sub-packages.
public class IgnoreTest {

    @Test(description = "This is a TestNG test.")
    public void testingTestNGAnnotations() {
        System.out.println("@Test");
        Assert.assertTrue(true, "Error message.");
    }
}
