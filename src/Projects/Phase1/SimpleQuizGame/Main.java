package Projects.Phase1.SimpleQuizGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Quiz(scanner);

        //QuizWithChoices(scanner);
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

    //using ArrayList
    public static void Quiz(Scanner scanner) {

        System.out.println("Welcome to Quiz game");

        String[] questions = {
                "What is Java?\nA) An operating system\n" +
                        "B) A programming language\n" +
                        "C) A type of coffee",
                "Which keyword is used to define a constant in Java?\nA) const\n" +
                        "B) final\n" +
                        "C) static",
                "What is the entry point of a Java program?\nA) main()\n" +
                        "B) start()\n" +
                        "C) execute()",
                "Which data type is used to store whole numbers in Java?\nA) double\n" +
                        "B) int\n" +
                        "C) char",
                "How do you declare a variable in Java to hold a floating-point number?\nA) float\n" +
                        "B) real\n" +
                        "C) double",
                "What is the purpose of the 'if' statement in Java?\nA) To declare a variable\n" +
                        "B) To define a class\n" +
                        "C) To make decisions in code",
                "Which Java keyword is used to create a subclass of a class?\nA) super\n" +
                        "B) extends\n" +
                        "C) subclass",
                "What is the default value of a boolean variable in Java?\nA) true\n" +
                        "B) false\n" +
                        "C) null",
                "Which loop in Java is used to iterate over a collection of items like an array?\nA) while\n" +
                        "B) for-each\n" +
                        "C) repeat\n",
                "How do you prevent a method or variable from being accessed outside of its class?\nA) Make it public\n" +
                        "B) Make it private\n" +
                        "C) Make it protected\n"
        };

        String[] answers = {
                "B) A programming language",
                "B) final",
                "A) main()",
                "B) int",
                "C) double",
                "C) To make decisions in code",
                "B) extends",
                "B) false",
                "B) for-each",
                "B) Make it private"
        };


        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            System.out.println("question" + (i + 1) + ": " + questions[i]);
            //System.out.println(answers[i]);

            char userAnswer = scanner.next().toLowerCase().charAt(0);

            if (userAnswer == answers[i].toLowerCase().charAt(0)) {
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
