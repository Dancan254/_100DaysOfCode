package Projects.Phase1.SimpleQuizGame;

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
    public static void Quiz(Scanner scanner) {
        System.out.println("Welcome to Quiz game");
        String[] questions = {
                """
                What is Java?
                A) An operating system
                B) A programming language
                C) A type of coffee""",
                                """
                Which keyword is used to define a constant in Java?
                A) const
                B) final
                C) static""",
                                """
                What is the entry point of a Java program?
                A) main()
                B) start()
                C) execute()""",
                                """
                Which data type is used to store whole numbers in Java?
                A) double
                B) int
                C) char""",
                                """
                How do you declare a variable in Java to hold a floating-point number?
                A) float
                B) real
                C) double""",
                                """
                What is the purpose of the 'if' statement in Java?
                A) To declare a variable
                B) To define a class
                C) To make decisions in code""",
                                """
                Which Java keyword is used to create a subclass of a class?
                A) super
                B) extends
                C) subclass""",
                                """
                What is the default value of a boolean variable in Java?
                A) true
                B) false
                C) null""",
                                """
                Which loop in Java is used to iterate over a collection of items like an array?
                A) while
                B) for-each
                C) repeat
                """,
                                """
                How do you prevent a method or variable from being accessed outside of its class?
                A) Make it public
                B) Make it private
                C) Make it protected
                """
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
