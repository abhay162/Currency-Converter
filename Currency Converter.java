import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CurrencyConverter {

    // Default conversion rates (you could later load these from a file or API)
    private static double USD_TO_EUR = 0.93;
    private static double USD_TO_INR = 83.0;
    private static double USD_TO_GBP = 0.82;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Currency Converter");

        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            if (choice == 5) {
                System.out.println("Exiting the Currency Converter.");
                break;  // Exit the program
            }

            System.out.print("Enter the amount you want to convert: ");
            double amount = scanner.nextDouble();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    convertCurrency(amount, "USD", "EUR", USD_TO_EUR);
                    break;
                case 2:
                    convertCurrency(amount, "USD", "INR", USD_TO_INR);
                    break;
                case 3:
                    convertCurrency(amount, "USD", "GBP", USD_TO_GBP);
                    break;
                case 4:
                    displayRates();
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }

        scanner.close();
    }

    // Display the menu options
    private static void displayMenu() {
        System.out.println("\nCurrency Conversion Options:");
        System.out.println("1. Convert USD to EUR");
        System.out.println("2. Convert USD to INR");
        System.out.println("3. Convert USD to GBP");
        System.out.println("4. Display Conversion Rates");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
    }

    // Perform the currency conversion
    private static void convertCurrency(double amount, String fromCurrency, String toCurrency, double rate) {
        double convertedAmount = amount * rate;
        System.out.println(amount + " " + fromCurrency + " is equivalent to " + convertedAmount + " " + toCurrency);
    }

    // Display the conversion rates
    private static void displayRates() {
        System.out.println("\nConversion Rates:");
        System.out.println("1 USD = " + USD_TO_EUR + " EUR");
        System.out.println("1 USD = " + USD_TO_INR + " INR");
        System.out.println("1 USD = " + USD_TO_GBP + " GBP");
    }
}
