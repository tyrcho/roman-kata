public class Converter {
    private static final char[] ones = {'I', 'X', 'C', 'M'};
    private static final char[] fives = {'V', 'L', 'D'};

    public static String toRoman(int number) {
        return convertRec(number, 'M', ones.length - 1, 1000);
    }

    private static String convertRec(int number, char ten, int i, int powerOfTen) {
        int digit = number / powerOfTen;
        String converted = digit < 4 ? repeat(ones[i], digit)
                : digit == 4 ? ones[i] + "" + fives[i]
                : digit == 9 ? ones[i] + "" + ten
                : fives[i] + repeat(ones[i], digit % 5);
        return i == 0 ? converted
                : converted + convertRec(number % powerOfTen, ones[i], i - 1, powerOfTen / 10);
    }

    static String repeat(char c, int n) {
        return new String(new char[n]).replace('\0', c);
    }
}
