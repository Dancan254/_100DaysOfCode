package Projects.Phase1.ShapeAreaCalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Shapes<Triangle> triangle = new Shapes<>(new Triangle(10, 5, 7));
//        Shapes<Circle> circle = new Shapes<>(new Circle(10));
//        Shapes<Rectangle> rectangle = new Shapes<>(new Rectangle(10,  7));

        //implementing scanner
        Scanner scanner = new Scanner(System.in);

        // Create records for different shapes with user-provided input
        System.out.print("Enter the radius of the circle: ");
        double circleRadius = scanner.nextDouble();
        Shapes<Circle> circle = new Shapes<>(new Circle(circleRadius));

        System.out.print("Enter the length of the rectangle: ");
        double rectangleLength = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double rectangleWidth = scanner.nextDouble();
        Shapes<Rectangle> rectangle = new Shapes<>(new Rectangle(rectangleLength, rectangleWidth));

        System.out.print("Enter the base of the triangle: ");
        double triangleBase = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double triangleHeight = scanner.nextDouble();
        System.out.print("Enter the first side of the triangle: ");
        double triangleHypotenus = scanner.nextDouble();
        Shapes<Triangle> triangle = new Shapes<>(new Triangle(triangleBase,triangleHeight, triangleHypotenus));

        System.out.println("Areas of the shapes");
        System.out.println("Triangle area = " + triangle.Area());
        System.out.println("Circle area = " + circle.Area());
        System.out.println("Rectangle area = " + rectangle.Area());

        System.out.println();

        System.out.println("Perimeters");
        System.out.println("Triangle perimeter = " + triangle.calculatePerimeter());
        System.out.println("Circle perimeter = " + circle.calculatePerimeter());
        System.out.println("Rectangle perimeter = " + rectangle.calculatePerimeter());

    }
}
