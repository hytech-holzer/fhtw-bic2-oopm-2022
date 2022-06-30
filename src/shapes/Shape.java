package shapes;

public abstract class Shape {

    public final void print() {

        System.out.printf("%S: area: %f, perimeter:%f\n",
                getName(),
                getArea(),
                getPerimeter());
        afterPrint();
    }
    protected void afterPrint() {
    }
    public abstract String getName();
    public abstract double getArea();
    public abstract double getPerimeter();

}
