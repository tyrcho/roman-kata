import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RomanNumeralsTest {
    @Test
    public void testSeveral() {
        HashMap<Integer, String> numbers = new HashMap<>();
        numbers.put(1, "I");
        numbers.put(2, "II");
        numbers.put(4, "IV");
        numbers.put(5, "V");
        numbers.put(9, "IX");
        numbers.put(8, "VIII");
        numbers.put(38, "XXXVIII");
        numbers.put(42, "XLII");
        numbers.put(50, "L");
        numbers.put(59, "LIX");
        numbers.put(91, "XCI");
        numbers.put(100, "C");
        numbers.put(256, "CCLVI");
        numbers.put(456, "CDLVI");
        for (Map.Entry<Integer, String> num : numbers.entrySet()) {
            checkRomanConvertion(num.getKey(), num.getValue());
        }
    }


    private void checkRomanConvertion(int i, String result) {
        // GIVEN
        // WHEN
        String res = RomanNumerals.toRomanNumeral(i);
        // THEN
        assertEquals(result, res);
    }

    @Test
    public void repeatChar_4I_result_IIII() {
        // GIVEN
        // WHEN
        String res = RomanNumerals.repeat("I", 4);
        // THEN
        assertEquals("IIII", res);
    }
}
