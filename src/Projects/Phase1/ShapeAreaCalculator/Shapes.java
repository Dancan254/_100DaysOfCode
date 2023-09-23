package Projects.Phase1.ShapeAreaCalculator;
// Define record classes for Rectangle, Circle, and Triangle
record Rectangle(double length, double width) {}

record Circle(double radius) {}

record Triangle(double base, double height, double hypotenuse) {}

// Shapes class with generic type T
public class Shapes<T> {

    private T shapeType;

    // Constructor that initializes the shapeType
    public Shapes(T shapeType) {
        this.shapeType = shapeType;
    }

    // Getter method for shapeType
    public T getShapeType() {
        return shapeType;
    }

    // Method to calculate the area of different shapes
    public double Area() {
        if (shapeType instanceof Rectangle rectangle) {
            return rectangle.length() * rectangle.width();
        } else if (shapeType instanceof Circle circle) {
            return Math.PI * Math.pow(circle.radius(), 2);
        } else if (shapeType instanceof Triangle triangle) {
            return 0.5 * triangle.base() * triangle.height();
        } else {
            // Default case when shapeType is unknown
            return 0.0;
        }
    }

    // Method to calculate the perimeter of different shapes
    public double calculatePerimeter() {
        if (shapeType instanceof Circle circle) {
            return 2 * Math.PI * circle.radius();
        } else if (shapeType instanceof Rectangle rectangle) {
            return 2 * (rectangle.length() + rectangle.width());
        } else if (shapeType instanceof Triangle triangle) {
            return triangle.base() + triangle.height() + triangle.hypotenuse();
        } else {
            // Default case when shapeType is unknown
            return 0.0;
        }
    }
}
