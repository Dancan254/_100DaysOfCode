package Projects.Phase1.SimpleQuizGame;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        QuizWithChoices(scanner);
    }
    //with choices
    public static void QuizWithChoices(Scanner scanner){
        int score = 0;

        // Define an array of questions and their corresponding answers
        String[] questions = {
                "1. What is the capital of France?\nA) London\nB) Madrid\nC) Paris\n",
                "2. Which planet is known as the 'Red Planet'?\nA) Venus\nB) Mars\nC) Jupiter\n",
                "3. What is the largest mammal on Earth?\nA) Elephant\nB) Blue Whale\nC) Giraffe\n"
        };

        char[] answers = {'C', 'B', 'B'};

        // Present questions to the user and check their answers
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            char userAnswer = scanner.next().charAt(0);

            if (userAnswer == answers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is " + answers[i] + ".\n");
            }
        }

        // Display the user's final score
        System.out.println("Quiz completed! Your score: " + score + "/" + questions.length);

        // Close the scanner
        scanner.close();
    }

}
