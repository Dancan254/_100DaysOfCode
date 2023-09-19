package LearningConcepts.Phase1.Arrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //initializing arrays
        int[] numbers = {4, 7, 8, 6, 9};
        //printing the values
        System.out.println(Arrays.toString(numbers));
        //using for loop
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        //using enhanced for loop
        for (int number : numbers){
            System.out.print(number + " ");
        }

        //sorting
        Arrays.sort(numbers);

        //searching without binary

        for (int number : numbers){
            long startTime = System.currentTimeMillis();
            if (number == 9){
                System.out.println("found 9");
                long endTime = System.currentTimeMillis();
                long duration = endTime - startTime;
                System.out.println("Total time taken for search = " + (duration ) + "secs");
                break;
            }
            //System.out.print(number + " ");
        }
        binarySearch(numbers, 9);
    }
    //implementing binary search
    private static void binarySearch(int[] arr, int target){

        System.out.println("Ensure that your array is sorted");
        int start = 0;
        int end = arr.length - 1;

        long startTime = System.currentTimeMillis();
        while (start <= end){

            int mid = (end - start) / 2 + start;
            if (arr[mid] == target){
                System.out.println("Found " + target + " at index " + mid);
                long endTime = System.currentTimeMillis();
                long duration = endTime - startTime;
                System.out.println("Total time taken for search = " + (duration) + "secs");
                break;
            } else if (arr[mid] < target) {
                //shift indices to the right
                start = mid + 1;
            }
            else if(arr[mid] > target) {
                //shift indices to the left
                end = mid - 1;
            }
            else {
                System.out.println("Element not found");
            }
        }
    }
}
