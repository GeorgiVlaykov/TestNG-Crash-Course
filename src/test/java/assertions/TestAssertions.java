package assertions;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

// The @Test annotation can be put on a class instead of a test method:
@Test
// The effect of a class level @Test annotation is to make all the public methods of this class
// to become test methods even if they are not annotated.
// You can still repeat the @Test annotation on a method if you want to add certain attributes.
public class TestAssertions {

    public void testngAssertionsPositiveTest() {
        assertTrue(true, "String error message.");
        assertFalse(false, "String error message.");

        assertEquals(5, 5, "String error message.");
        assertEquals("String", "String", "String error message.");

        assertNotEquals(0, 5, "String error message.");
        assertNotEquals("String1", "String2", "String error message.");
        assertNotEquals(new Object(), new Object(), "String error message.");

        assertNull(null, "String error message.");
        assertNotNull(new Object(), "String error message.");

        assertSame(null, null, "String error message.");
        assertSame(1, 1, "String error message.");
        assertSame("String", "String", "String error message.");
        assertNotSame("String", new String("String"), "String error message.");
        assertNotSame(new Object(), new Object(), "String error message.");

    }
}
