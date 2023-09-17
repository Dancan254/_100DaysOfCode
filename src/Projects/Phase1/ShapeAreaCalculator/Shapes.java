package Projects.Phase1.ShapeAreaCalculator;


record Rectangle(double length, double width){}
record Circle(double radius){}
record Triangle(double base, double height, double hypotenuse){}
public class Shapes <T> {

   private T shapeType;

    public Shapes(T shapeType) {
        this.shapeType = shapeType;
    }

    public T getShapeType() {
        return shapeType;
    }

    //method to calculate area, returns double
    public double Area(){
        if (shapeType instanceof Rectangle rectangle){
            return rectangle.length() * rectangle.width();
        } else if (shapeType instanceof Circle circle) {
            return Math.PI * Math.pow(circle.radius(), 2);
        }
        else if (shapeType instanceof Triangle triangle){
            return 0.5 * triangle.base() * triangle.height();
        }
        else{
            return 0.0;
        }
    }

    public double calculatePerimeter() {
        if (shapeType instanceof Circle circle) {
            return 2 * Math.PI * circle.radius();
        } else if (shapeType instanceof Rectangle rectangle) {
            return 2 * (rectangle.length() + rectangle.width());
        } else if (shapeType instanceof Triangle triangle) {
            return triangle.base() + triangle.height() + triangle.hypotenuse();
        }
        return 0.0;
    }
}
