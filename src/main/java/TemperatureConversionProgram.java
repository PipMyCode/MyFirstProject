import java.util.Scanner;

public class TemperatureConversionProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Temperature Conversion Program");
        System.out.println("1. Convert to Fahrenheit");
        System.out.println("2. Convert to Celsius");

        int choice;
        double temperatureInCelsius;
        double temperatureInFahrenheit;

        System.out.print("Please enter your choice: ");
        choice = input.nextInt();

        if (choice == 1) {
            System.out.print("Please enter the temperature in Celsius: ");
            temperatureInCelsius = input.nextDouble();

            temperatureInFahrenheit = (temperatureInCelsius * 9.0/5) + 32;

            System.out.printf("Temperature in Fahrenheit is %.2f°F ", temperatureInFahrenheit);
        } else if (choice == 2) {
            System.out.print("Please enter the temperature in Fahrenheit: ");
            temperatureInFahrenheit = input.nextDouble();

            temperatureInCelsius = (temperatureInFahrenheit - 32) * 5.0/9 ;

            System.out.printf("Temperature in Celsius is %.2f°C",temperatureInCelsius);
        } else {
            System.out.println("Invalid choice.");
        }

        input.close();
    }
}
