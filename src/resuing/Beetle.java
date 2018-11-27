package resuing;

/**
 * Create by leonardo on 2018/11/7
 */
public class Beetle extends Insect{

    private static int k = printInit("Beetle.k initialized");


    public static void main(String[] args) {
        Beetle.printInit("123");
    }
}

class Insect {
    private int i = 9;
    protected int j;

    Insect() {
        System.out.println("i="+i+"j="+j);
        j = 39;
    }

    private static int x1 = printInit("static Insect.x1 initialized");

    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }

}