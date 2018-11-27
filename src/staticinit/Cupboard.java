package staticinit;

/**
 * Create by leonardo on 2018/11/4
 */
public class Cupboard {

    Bowl b3 = new Bowl(3);
    static Bowl b4 = new Bowl(4);

    public Cupboard() {
        System.out.println("Cupboard()");
        b4.f(2);
    }

    void f3(int maker) {
        System.out.println("f3(" + maker + ")");
    }

}
