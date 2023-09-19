package LearningConcepts.Phase1.MultiDimentionalArrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[][] numbers = {
                {2, 4, 6, 8},
                {5, 7, 9, 11},
                {12, 14, 16, 18}
        };

        //printing values
        System.out.println(Arrays.deepToString(numbers));
        //iterating through i==rows, j ==columns
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
        }
        System.out.println();
        //using enhanced for loop
        for (int[] numbs : numbers){
            System.out.println(Arrays.toString(numbs));
        }

        //finding an element
        //first iterate through the array
        for (int[] number : numbers) {
            for (int j = 0; j < numbers.length; j++) {
                if (number[j] == 89) {
                    System.out.println("Found: " + number[j]);
                } else {
                    System.out.println("not found");
                    return;
                }
            }
        }
    }
}
