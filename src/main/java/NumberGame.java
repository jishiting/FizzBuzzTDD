public class NumberGame {
    public static String of(int i) {
        if (isaBoolean(i, 15)) return "fizzbuzz";
        if (isaBoolean(i, 3)) return "fizz";
        if (isaBoolean(i, 5)) return "buzz";
        return String.valueOf(i);
    }

    private static boolean isaBoolean(int i, int i2) {
        return i % i2 == 0;
    }
}
