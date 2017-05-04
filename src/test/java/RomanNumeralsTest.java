import static org.junit.Assert.*;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

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
            checkRomanConversion(num.getKey(), num.getValue());
        }
    }


    private void checkRomanConversion(int i, String result) {
        String res = new Converter().convertToRoman(i);
        assertEquals(result, res);
    }

    @Test
    public void repeatChar_4I_result_IIII() {
        String res = Converter.repeat('I', 4);
        assertEquals("IIII", res);
    }
}
