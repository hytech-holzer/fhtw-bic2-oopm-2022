package shapes;

public class Rectangle extends Shape {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String getName() {
        return "Rechteck";
    }

    @Override
    public double getPerimeter() {
        return length+length+width+width;
    }

    @Override
    public double getArea() {
        return length*width;
    }
}
