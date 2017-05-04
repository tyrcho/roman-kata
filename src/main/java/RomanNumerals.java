import java.util.Collections;

public class RomanNumerals {

    public static String toRoman(int number) {
        if (number < 10) return convertDigit(number, "I", "V", "X");
        if (number < 100) return convertDigit(number / 10, "X", "L", "C") + toRoman(number % 10);
        if (number < 1000) return convertDigit(number / 100, "C", "D", "M") + toRoman(number % 100);
        return "";
    }

    private static String convertDigit(int digit, String one, String five, String ten) {
        if (digit < 4) return repeat(digit, one);
        if (digit == 4) return one + five;
        if (digit == 9) return one + ten;
        return five + repeat(digit % 5, one);
    }

    static String repeat(int count, String stringToRepeat) {
        return String.join("", Collections.nCopies(count, stringToRepeat));
    }
}
