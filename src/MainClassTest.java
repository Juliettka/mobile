import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetLocalNumber() {
        int expected = 14;
        int actual;
        actual = this.getLocalNumber();
        if (expected!=actual) {
            Assert.fail("Expected number is not equal to 14");
        }
    }
}
