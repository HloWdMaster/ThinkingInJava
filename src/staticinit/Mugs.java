package staticinit;

/**
 * Create by leonardo on 2018/11/5
 */
public class Mugs {

    Mug m1;
    Mug m2;

    {
        m1 = new Mug(1);
        m2 = new Mug(2);
        System.out.println("m1 & m2 initialized");
    }

    public Mugs() {
        System.out.println("Mugs()");
    }

    public static void main(String[] args) {
        Mugs mugs = new Mugs();

    }
}
