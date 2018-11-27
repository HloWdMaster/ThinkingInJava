package staticinit;

/**
 * Create by leonardo on 2018/11/5
 */
public class Mug {

    public Mug(int maker) {
        System.out.println("Mug(" + maker + ")");
    }

    void f(int maker) {
        System.out.println("f(" + maker + ")");
    }
}
