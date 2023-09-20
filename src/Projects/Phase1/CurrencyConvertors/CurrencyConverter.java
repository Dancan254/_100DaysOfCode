package Projects.Phase1.CurrencyConvertors;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do {
            // Display menu and get user choice
            displayMenu();
            int choice = getUserInput(input);
            if (choice == -1){
                continue;
            }
            double exchangeRate = 0;

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
                case 5 -> {
                    System.out.println("Exiting");
                    System.out.println("Thank you for using our currency convertor");
                    input.close();
                    return;
                    //System.exit(0);
                }

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

        }while (true);

    }
    //method to display the menu
    public static void displayMenu() {
        System.out.println("""
                Currency Converter Menu:
                1. USD to EUR
                2. EUR to USD
                3. USD to KES
                4. KES to USD
                5. Exit
                Enter your choice (1, 2, 3, 4, or 5):""");
    }

    public static int getUserInput(Scanner scanner){
        int choice = -1;
        try{
            choice = scanner.nextInt();
            scanner.nextLine();
        } catch(InputMismatchException e){
            System.out.println("Invalid input, Enter a valid number");
            //System.out.println(e.getMessage());
        }
        return choice;
    }
}
