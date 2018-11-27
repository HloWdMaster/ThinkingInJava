package typeinfo.shapes;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

/**
 * Create by leonardo on 2018/11/8
 */
public class Shapes {
    public static void main(String[] args) {
//        List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle());
//        for (Shape shape : shapeList) {
//            shape.draw();
//        }
        Shape s = new Rhomboid();
        Rhomboid ss = (Rhomboid) s;
        ss.draw();

        ss.draw();
    }
}
