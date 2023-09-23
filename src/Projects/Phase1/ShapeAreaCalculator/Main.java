package Projects.Phase1.ShapeAreaCalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Create instances for different shapes using user input

        // Implementing scanner
        Scanner scanner = new Scanner(System.in);

        // Get user input for the circle
        System.out.print("Enter the radius of the circle: ");
        double circleRadius = scanner.nextDouble();
        Shapes<Circle> circle = new Shapes<>(new Circle(circleRadius));

        // Get user input for the rectangle
        System.out.print("Enter the length of the rectangle: ");
        double rectangleLength = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double rectangleWidth = scanner.nextDouble();
        Shapes<Rectangle> rectangle = new Shapes<>(new Rectangle(rectangleLength, rectangleWidth));

        // Get user input for the triangle
        System.out.print("Enter the base of the triangle: ");
        double triangleBase = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double triangleHeight = scanner.nextDouble();
        System.out.print("Enter the first side of the triangle: ");
        double triangleHypotenuse = scanner.nextDouble();
        Shapes<Triangle> triangle = new Shapes<>(new Triangle(triangleBase, triangleHeight, triangleHypotenuse));

        // Calculate and display areas of the shapes
        System.out.println("Areas of the shapes");
        System.out.println("Triangle area = " + triangle.Area());
        System.out.println("Circle area = " + circle.Area());
        System.out.println("Rectangle area = " + rectangle.Area());

        System.out.println();

        // Calculate and display perimeters of the shapes
        System.out.println("Perimeters");
        System.out.println("Triangle perimeter = " + triangle.calculatePerimeter());
        System.out.println("Circle perimeter = " + circle.calculatePerimeter());
        System.out.println("Rectangle perimeter = " + rectangle.calculatePerimeter());

    }
}
