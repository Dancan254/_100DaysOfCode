package Projects.Phase1.CurrencyConvertors;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Display menu and get user choice
        System.out.println("Currency Converter Menu:");
        System.out.println("1. USD to EUR");
        System.out.println("2. EUR to USD");
        System.out.println("3. USD to KES");
        System.out.println("4. KES to USD");
        System.out.print("Enter your choice (1, 2, 3, or 4): ");

        int choice = input.nextInt();

        double exchangeRate;

        // Determine exchange rate based on user choice
        switch (choice) {
            case 1 ->
                // USD to EUR exchange rate
                    exchangeRate = 0.85;
            case 2 ->
                // EUR to USD exchange rate
                    exchangeRate = 1.18;
            case 3 ->
                // USD to KES exchange rate
                    exchangeRate = 110.0;
            case 4 ->
                // KES to USD exchange rate
                    exchangeRate = 0.0091;
            default -> {
                System.out.println("Invalid choice. Please enter 1, 2, 3, or 4.");
                input.close();
                return;
            }
        }

        // Get the amount to convert
        System.out.print("Enter the amount to convert: ");
        double amount = input.nextDouble();

        // Perform the conversion
        double convertedAmount = amount * exchangeRate;

        // Display the result
        System.out.println("Converted amount: " + convertedAmount);

        input.close();
    }
}
