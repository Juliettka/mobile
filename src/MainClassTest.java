import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

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

    @Test
    public void testGetClassString() {
        String expected_string;
        expected_string = "hello";
        String actual_string;
        actual_string = this.getClassString();
        Assert.assertTrue(actual_string+ " does not contain "+expected_string,actual_string.toLowerCase().contains(expected_string.toLowerCase()));
    }
}
