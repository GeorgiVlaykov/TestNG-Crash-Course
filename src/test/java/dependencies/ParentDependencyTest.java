package dependencies;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ParentDependencyTest extends DependenciesTest{

    @Test(dependsOnMethods = "testNameA")
    public void testNameE() {
        System.out.println("testNameE");
        Assert.assertTrue(false, "String message");
//        Assert.assertTrue(true, "String message");
    }

    @Test()
    public void testNameF() {
        System.out.println("testNameF");
//        Assert.assertTrue(false, "String message");
        Assert.assertTrue(true, "String message");
    }

}
