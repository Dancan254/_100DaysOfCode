package Projects.Phase1.CurrencyConvertors;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NewCurrencyConvertor {

    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);

        do{

            //displayMenu();
            //get choice
            int choice = getUserInput(scanner);

            double exchangeRate = 0;
            String fromCurrency = "";
            String toCurrency = "";

            switch(choice){
                case 1 -> {
                    // USD to EUR exchange rate
                    exchangeRate = 0.85;
                    fromCurrency = "USD";
                    toCurrency = "EURO";
                }
                case 2 -> {
                    // EUR to USD exchange rate
                    exchangeRate = 1.18;
                    fromCurrency = "EUR";
                    toCurrency = "USD";
                }
                case 3 -> {
                    // USD to KES exchange rate
                    exchangeRate = 147.25;
                    fromCurrency = "USD";
                    toCurrency = "KES";
                }
                case 4 -> {
                    // KES to USD exchange rate
                    exchangeRate = 0.0091;
                    fromCurrency = "KES";
                    toCurrency = "USD";
                }
                case 5 -> {
                    System.out.println("Exiting->>>");
                    System.out.println("Thank you for using our conversion services");
                    scanner.close();
                    return;
                }
                default -> {
                    System.out.println("Invalid choice, Try again");
                }
            }

            double amountToConvert = getAmount(scanner, fromCurrency, toCurrency);

            double convertedAmount = amountToConvert * exchangeRate;
            System.out.println("Successfully converted " + amountToConvert + fromCurrency + " to " + convertedAmount + toCurrency);

        }while(true);

    }

    //display menu
    public static void displayMenu(){

        System.out.println("""
                Currency Converter Menu:
                1. USD to EUR
                2. EUR to USD
                3. USD to KES
                4. KES to USD
                5. Exit
                Enter your choice (1, 2, 3, 4, or 5):""");
    }

    //method to get user input
    public static int getUserInput(Scanner scanner){
        //implements exception handling
        int choice = -1;
        boolean isValid = false;
        while(!isValid) {
            displayMenu();
            try {
                choice = scanner.nextInt();
                scanner.nextLine();
                if (choice > 0 && choice <=5){
                    isValid = true;
                }
                else {
                    //displayMenu();
                    System.out.println(" Enter a number within the given range");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input, Enter a number within the given range");
                scanner.nextLine();
            }
        }
        return choice;
    }


    //returns the amount
    public static double getAmount(Scanner scanner, String fromCurrency, String toCurrency){
        double amount = -1;
        while (amount< 0) {
            System.out.println("Enter amount in " + fromCurrency + " to convert to " + toCurrency);
            try {
                amount = scanner.nextDouble();
                if (amount < 0) {
                    System.out.println("Enter a positive amount");
                }
            } catch (Exception e) {
                System.out.println("Enter valid amount");
                scanner.nextLine();
            }
        }
        return amount;
    }

}
