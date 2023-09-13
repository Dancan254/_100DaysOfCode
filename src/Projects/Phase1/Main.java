package Projects.Phase1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int count = 0;
        do {
            printOptions();
            System.out.println("Enter option (number): ");
            int choice = sn.nextInt();
            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice. Please enter a valid option (1-5).");
                continue; // Skip the rest of the loop and start over.
            }
            if (choice == 5) {
                System.out.println("Exiting>>>>>>");
                System.exit(0);
            }
            System.out.println("Enter num1: ");
            int num1 = sn.nextInt();
            System.out.println("Enter num2: ");
            int num2 = sn.nextInt();
            SimpleCalculator calculator = new SimpleCalculator(num1, num2);
            switch (choice){
                case 1 -> {
                    System.out.println("Sum is: " + calculator.Sum());
                }
                case 2 -> {
                    System.out.println("Difference is: " + calculator.subtraction());
                }
                case 3 -> {
                    System.out.println("Product is: " + calculator.Multiplication());
                }
                case 4 -> {
                    System.out.println("Quotient is: " + calculator.Division());
                }
                default -> System.out.println("Operation does not exist");
            }
            count++;
        } while (count <= 5);
    }

    public static void printOptions(){
        System.out.println("""
                1. Sum
                2. Subtraction
                3. Multiplication
                4. Division
                5. Exit
                """);
        //System.out.println("Enter the operation of choice:");
    }
}
