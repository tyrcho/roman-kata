import java.util.Collections;
import java.util.List;

public class RomanNumerals {

    public static String toRomanNumeral(int i) {
        String toReturn = baseNumber(i);

        if (toReturn == null) {
            if (i>= 100) return "C" + toRomanNumeral(i - 100);
            if (i >= 90) return "XC" + toRomanNumeral(i - 90);
            if (i >= 50) return "L" + toRomanNumeral(i - 50);
            int nbTens = i / 10;
            if (nbTens > 0 && nbTens < 4) return repeat("X", nbTens) + baseNumber(i % 10);
            else if (nbTens == 4) return "XL" + baseNumber(i % 10);
        }

        return toReturn;
    }

    private static String baseNumber(int i) {
        if (i == 4) return "IV";

        if (i < 4)
            return repeat("I", i);
        if (i > 4 && i < 9) {
            return "V" + repeat("I", i - 5);
        }
        if (i == 9) return "IX";
        return null;
    }

    public static String repeat(String stringToRepeat, int i) {
        return String.join("", Collections.nCopies(i, stringToRepeat));
    }
}
