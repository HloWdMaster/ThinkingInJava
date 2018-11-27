package typeinfo.shapes;

/**
 * Create by leonardo on 2018/11/8
 */
public abstract class Shape {
    void draw() {
        System.out.println(this+".draw()");
    }

    public abstract String toString();
}
