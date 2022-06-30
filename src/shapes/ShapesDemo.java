package shapes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class ShapesDemo {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Square(5));
        shapes.add(new Rectangle(3, 6));
        shapes.add(new Circle(4));
        shapes.add(new RightTriangle(3, 4));

        for (Shape s : shapes) {
            s.print();
        }

        for (int i = 0; i < shapes.size(); i++) {
            shapes.get(i).print();
        }

        shapes.forEach(shape -> {
            shape.print();
        });

    }

}
