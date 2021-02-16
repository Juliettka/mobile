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
    @Test
    public void testGetClassNumber(){
        int expected_number = 45;
        int actual_number;
        actual_number = this.getClassNumber();
        if (actual_number < expected_number) {
            Assert.fail("getClassNumber returns number less than 45");
        }
    }
}
