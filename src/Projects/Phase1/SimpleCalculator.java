package Projects.Phase1;

public class SimpleCalculator {
    private double num1;
    private double num2;

    public SimpleCalculator() {
    }

    public SimpleCalculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    //add method
    public double Sum(){
        return num1 + num2;
    }
    //subtraction
    public double subtraction(){
        return num1 - num2;
    }

    ///multiplication
    public double Multiplication(){
        return num1 * num2;
    }
    public double Division(){
        return (num1 == 0 ? -1 : num2 / num1);
    }

    public double SquareRoot(){
        return Math.sqrt(num1);
    }

    public double Exponential(){
        return Math.pow(num1, num2);
    }
    @Override
    public String toString() {
        return "SimpleCalculator{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }
}
