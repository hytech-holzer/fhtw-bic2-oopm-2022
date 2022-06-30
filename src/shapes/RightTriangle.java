package shapes;

public class RightTriangle extends Shape {

    private double a;
    private double b;

    public RightTriangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double getArea() {
        return (a*b/2);
    }

    @Override
    public double getPerimeter() {
        return a+b+(Math.sqrt(a*a+b*b));
    }

    @Override
    public String getName() {
        return "rechtwinkeliges Dreieck";
    }
}
