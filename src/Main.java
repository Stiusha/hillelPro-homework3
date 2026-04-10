public class Main {

    private static final double FAHRENHEIT_MULTIPLIER_TO_CELSIUS = 5.0 / 9;
    private static final int FAHRENHEIT_OFFSET = 32;

    public static void main(String[] args) {
        System.out.println("App for temperatures converting.");

        double fahrenheit = 451.0;
        double celsiusByFahrenheit = convFahrenheitToCelsius(fahrenheit);
        System.out.printf("Fahrenheit: %.2f%n", fahrenheit);
        System.out.printf("Celsius: %.2f%n", celsiusByFahrenheit);
    }

    private static double convFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - FAHRENHEIT_OFFSET) * FAHRENHEIT_MULTIPLIER_TO_CELSIUS;
    }
}