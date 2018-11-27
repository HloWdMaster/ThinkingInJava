package staticinit;

/**
 * Create by leonardo on 2018/11/4
 */
public class Bowl {

    public Bowl(int maker) {
        System.out.println("Bowl(" + maker + ")");
    }

    void f(int maker) {
        System.out.println("f(" + maker + ")");
    }

}
