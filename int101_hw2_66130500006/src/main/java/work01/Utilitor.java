package work01;

public class Utilitor {
    public static String testString(String value) {
        if (value == null) throw new NullPointerException("value is null");
        if (value.isBlank()) throw new IllegalArgumentException("the value is blank");
        return value;
    }

    public static double testPositive(double value) {
        if (value <= 0) throw new IllegalArgumentException("value is not positive");
        return value;
    }

    public static long computeIsbn10(long isbn10) {
        long sum = 0;
        for (int i = 2; i <= 10; i++) {
            sum += (isbn10 % 10) * i;
            isbn10 /= 10;
        }
        long checkDigit = sum % 11;
        return 11 - checkDigit;
    }
}

