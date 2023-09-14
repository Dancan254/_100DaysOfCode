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
            int choice = getUserInput(sn);
            //sn.nextLine();
            switch(choice){
                   case 1 -> addEvent(sn, planner);
                   case 2-> removeEvent(sn, planner);
                   case 3 -> listEvents(planner);
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
    public static int getUserInput(Scanner scanner){

        System.out.print("Enter choice of operation (number): ");
        return scanner.nextInt();
    }
    public static void showOptions(){
        System.out.println("""
                1. Add activity
                2. Remove Activity
                3. View Present Activities
                4. Exit
                """);
    }

    public static void addEvent(Scanner scanner, EventPlanner planner){

        System.out.println("Enter activity: ");
        scanner.nextLine();
        String activity = scanner.nextLine();
        planner.addEvent(activity);
    }

    public static void removeEvent(Scanner scanner, EventPlanner planner){
        System.out.println("Enter activity to erase: ");
        scanner.nextLine();
        String activity = scanner.nextLine();
        planner.removeEvent(activity);
    }

    public static void listEvents(EventPlanner planner){
        System.out.println("Viewing present activities: ");
        planner.listEvents();
    }

}
