package testDriven.Junit_basic_testing;
import static org.junit.Assert.*;
import org.junit.Test;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        assertEquals(8, 5 + 3);
        assertTrue(20 > 10);
        assertFalse(10 < 5);
        assertNull(null);
        assertNotNull("JUnit");
    }
}