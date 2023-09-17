package Projects.Phase1.ShapeAreaCalculator;

public class Main {

    public static void main(String[] args) {

        Shapes<Triangle> triangle = new Shapes<>(new Triangle(10, 5, 7));
        Shapes<Circle> circle = new Shapes<>(new Circle(10));
        Shapes<Rectangle> rectangle = new Shapes<>(new Rectangle(10,  7));

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
