package pt.ul.fc;

/** Small utility class. */
public class Toolbox878 {

    /**
     * Returns the absolute value of number.
     */
    public static int absolute(int number) {
        return Math.abs(number);
    }

    /**
     * Returns text converted to upper case.
     */
    public static String toUpper(String text) {
        return text.toUpperCase();
    }

    /**
     * Returns the arithmetic mean of first and second.
     */
    public static double mean(double first, double second) {
        return (first + second) / 2.0;
    }

    /**
     * Returns the sum of a and b.
     */
    public static int total(int a, int b) {
        return a + b;
    }

    /**
     * Returns true if number is strictly greater than zero.
     */
    public static boolean isPositive(int number) {
        return number > 0;
    }

    /**
     * Returns amount multiplied by 5.
     */
    public static int amplify(int amount) {
        return amount * 5;
    }

    /**
     * Returns the area of a rectangle with the given w and h.
     */
    public static int surface(int w, int h) {
        return (w * h);
    }

    /**
     * Returns true if n is even, false otherwise.
     */
    public static boolean even(int n) {
        if (n % 2 != 0) {
            return false;
        }
        return true;
    }

    /**
     * Returns the larger of a and b.
     */
    public static int biggest(int a, int b) {
        return Math.max(a, b);
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double convertTemp(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }
}
