package Projects.Phase1.TODOList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        EventPlanner planner = new EventPlanner();
//        int count = 0;
       // boolean exit = false;
        while (true) {
            showOptions();
            System.out.print("Enter choice (number): ");
            int choice = sn.nextInt();
            sn.nextLine();
            switch(choice){
                   case 1 ->{
                       System.out.println("Enter activity:");
                       String activity = sn.nextLine();
                       planner.addEvent(activity);
                   }
                   case 2-> {
                       System.out.println("Enter activity to erase:");
                       String activity = sn.nextLine();
                       planner.removeEvent(activity);
                   }
                   case 3 -> {
                       planner.listEvents();
                   }
                   case 4 -> {
                       System.out.println("Exiting>>>>");
                       System.exit(0);
                   }
                   default -> {
                       System.out.println("Invalid choice try again");
                   }
            }

        }

    }

    public static void showOptions(){
        System.out.println("""
                1. Add activity
                2. Remove Activity
                3. View Present Activities
                4. Exit
                """);
    }

}
