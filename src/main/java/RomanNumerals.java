import java.util.Collections;

public class RomanNumerals {

    public static String toRomanNumeral(int i) {
        if (i < 10) return convertUnits(i);
        if (i < 100) return convertTens(i / 10) + toRomanNumeral(i % 10);
        if (i < 1000) return convertHundreds(i / 100) + toRomanNumeral(i % 100);
        return "";
    }

    private static String convertUnits(int i) {
        return convertGeneric(i, "I", "V", "X");
    }

    private static String convertTens(int i) {
        return convertGeneric(i, "X", "L", "C");
    }

    private static String convertHundreds(int i) {
        return convertGeneric(i, "C", "D", "M");
    }

    private static String convertGeneric(int i, String one, String five, String ten) {
        if (i < 4) return repeat(one, i);
        if (i == 4) return one + five;
        if (i == 9) return one + ten;
        return five + repeat(one, i % 5);
    }


    public static String repeat(String stringToRepeat, int i) {
        return String.join("", Collections.nCopies(i, stringToRepeat));
    }
}
