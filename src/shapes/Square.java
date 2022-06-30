package shapes;

public class Square extends Shape {

    private double width;

    public Square(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String getName() {
        return "Quadrat";
    }

    public double getPerimeter() {
        return width * 4;
    }

    public double getArea() {
        return width * width;
    }


}
