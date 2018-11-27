package staticinit;

/**
 * Create by leonardo on 2018/11/4
 */
public class Table {

    static Bowl b1 = new Bowl(1);

    public Table() {
        System.out.println("Table()");
        b2.f(1);
    }

    void f2(int maker) {
        System.out.println("f2(" + maker + ")");
    }

    static Bowl b2 = new Bowl(2);


}
