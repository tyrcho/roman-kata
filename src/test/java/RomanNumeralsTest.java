import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsTest {
    @Test
    public void toRomanUntil500() {
        check(1, "I");
        check(2, "II");
        check(4, "IV");
        check(5, "V");
        check(9, "IX");
        check(8, "VIII");
        check(38, "XXXVIII");
        check(42, "XLII");
        check(50, "L");
        check(59, "LIX");
        check(91, "XCI");
        check(100, "C");
        check(256, "CCLVI");
        check(456, "CDLVI");
    }

    private void check(int number, String expected) {
        String actual = Converter.toRoman(number);
        assertEquals(expected, actual);
    }

    @Test
    public void repeatChar_4I_result_IIII() {
        String actual = Converter.repeat('I', 4);
        assertEquals("IIII", actual);
    }
}
