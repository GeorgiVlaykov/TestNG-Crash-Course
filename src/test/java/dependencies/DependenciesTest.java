package dependencies;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependenciesTest {

    @Test(dependsOnMethods = "testNameB")
    public void testNameA() {
        System.out.println("testNameA");
        Assert.assertTrue(false, "String message");
//        Assert.assertTrue(true, "String message");
    }

    @Test(dependsOnMethods = {"testNameB", "testNameC"})
    public void testNameABC() {
        System.out.println("testNameABC");
        Assert.assertTrue(false, "String message");
//        Assert.assertTrue(true, "String message");
    }

    @Test( groups = "group1")
    public void testNameB() {
        System.out.println("testNameB");
//        Assert.assertTrue(false, "String message");
        Assert.assertTrue(false, "String message");
    }

    @Test(groups = "group1")
    public void testNameC() {
        System.out.println("testNameC");
//        Assert.assertTrue(false, "String message");
        Assert.assertTrue(true, "String message");
    }

    @Test(dependsOnGroups = "group1")
    public void testNameG() {
        System.out.println("testNameA");
        Assert.assertTrue(false, "String message");
//        Assert.assertTrue(true, "String message");
    }

}
