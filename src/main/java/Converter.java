public class Converter {
    private static final char[] ones = {'I', 'X', 'C', 'M'};
    private static final char[] fives = {'V', 'L', 'D'};

    public static String toRoman(int n) {
        return convertRec(n, 'M', ones.length - 1, 1000);
    }

    private static String convertRec(int n, char nextUnit, int i, int ratio) {
        int num = n / ratio;
        String converted = num < 4 ? repeat(ones[i], num)
                : num == 4 ? ones[i] + "" + fives[i]
                : num == 9 ? ones[i] + "" + nextUnit
                : fives[i] + repeat(ones[i], num % 5);
        return i > 0
                ? converted + convertRec(n % ratio, ones[i], i - 1, ratio / 10)
                : converted;
    }

    static String repeat(char c, int n) {
        return new String(new char[n]).replace('\0', c);
    }
}
