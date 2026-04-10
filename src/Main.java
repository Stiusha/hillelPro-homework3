public class Main {

    private static final double FAHRENHEIT_MULTIPLIER_TO_CELSIUS = 5.0 / 9;
    private static final int FAHRENHEIT_OFFSET = 32;
    private static final double FAHRENHEIT_MULTIPLIER = 1 / FAHRENHEIT_MULTIPLIER_TO_CELSIUS;

    public static void main(String[] args) {
        System.out.println("App for temperatures converting.");

        double fahrenheit = 451.0;
        double celsius = 20;
        double celsiusByFahrenheit = convFahrenheitToCelsius(fahrenheit);
        double fahrenheitByCelsius = convCelsiusToFahrenheit(celsius);
        System.out.printf("Fahrenheit: %.2f, Celsius: %.2f%n", fahrenheit, celsiusByFahrenheit);
        System.out.printf("Celsius: %.2f, Fahrenheit: %.2f%n", celsius, fahrenheitByCelsius);
    }

    private static double convFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - FAHRENHEIT_OFFSET) * FAHRENHEIT_MULTIPLIER_TO_CELSIUS;
    }

    private static double convCelsiusToFahrenheit(double celsius) {
        return celsius * FAHRENHEIT_MULTIPLIER + FAHRENHEIT_OFFSET;
    }
}