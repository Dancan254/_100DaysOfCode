package Projects.Phase1.LotteryGame;

import java.util.*;

public class Lottery {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //welcome statements
        System.out.println("Welcome to my lottery game, its gonna be a tough one make your guesses right");
        System.out.println("You might never win");
        System.out.println("--".repeat(15));
        System.out.println("--".repeat(15));
        //create 6 random numbers between 1 - 49
        //use ArrayList to store the numbers
        List<Integer> correctNumbers = new ArrayList<>();

        int totalNumbs = 6;
        for (int i = 0; i < totalNumbs; i++) {
           //loop until the user enters distinct numbers
            while(true) {
                    int randomNumber = random.nextInt(49) + 1;
                    //check if number is already in the list
                    if (!correctNumbers.contains(randomNumber)) {
                        correctNumbers.add(randomNumber);
                        break;
                    }
            }
        }
       // System.out.println(correctNumbers);
        //prompt user to guess all the numbers
        System.out.println("Please enter your 6 numbers between (1 - 49):");
        //create a list for the guessedNumbers
        List<Integer> guessedNumbsList = new ArrayList<>();
        for (int i = 0; i < totalNumbs; i++) {
            //show the user the current progress
            System.out.println("Your guess list: " + guessedNumbsList);
            while (true) {
                //handle exceptions
                try {
                    String number = scanner.nextLine();
                    int guessedNumber = Integer.parseInt(number);
                    //check if number is within the range
                    if (guessedNumber >= 1 && guessedNumber <= 49) {
                        if (!guessedNumbsList.contains(guessedNumber)) {
                            guessedNumbsList.add(guessedNumber);
                            break;
                        } else {
                            System.out.println("No duplicate allowed");
                        }
                    } else {
                        System.out.println(guessedNumber + " not in range");
//                    break;
                    }
                }catch (NumberFormatException nf){
                    System.out.println("Enter a number, try again");
                }
            }
        }
        //compare the result with the correct values
        System.out.println("The correct lottery numbers are: " + correctNumbers);
        System.out.println("You guessed the following numbers: " + guessedNumbsList);
        //show the correctly matched numbers
        guessedNumbsList.retainAll(correctNumbers);
        System.out.println("Matched numbers are : " + guessedNumbsList);

        //check if all number match
        if (new HashSet<>(guessedNumbsList).containsAll(correctNumbers)) {
            System.out.println("Wooooooahoo you won, wait, how did you do it?!!!!");
            System.out.println("You cheated right? ");
        } else {
            System.out.println("You lost, not surprised");
        }

        scanner.close();
    }
}
