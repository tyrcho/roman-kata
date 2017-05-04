
import lombok.AllArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
public class Converter {
    private final char one;
    private final char five;
    private final int ratio;
    private final Optional<Converter> next;

    static Converter units = new Converter('I', 'V', 1, Optional.empty());
    static Converter tens = new Converter('X', 'L', 10, Optional.of(units));
    static Converter hundreds = new Converter('C', 'D', 100, Optional.of(tens));
    Converter() {
        this('M', ' ', 1000, Optional.of(hundreds));
    }

    public String convertToRoman(int number) {
        return convertToRoman(number, 'M');
    }

    String convertToRoman(int number, char nextUnit) {
        int i = number / ratio;
        String mine = i < 4 ? repeat(one, i)
                : i == 4 ? one + "" + five
                : i == 9 ? one + "" + nextUnit
                : five + repeat(one, i % 5);
        return next.isPresent()
                ? mine + next.get().convertToRoman(number % ratio, one)
                : mine;
    }

    public static String repeat(char c, int n) {
        return new String(new char[n]).replace('\0', c);
    }
}
