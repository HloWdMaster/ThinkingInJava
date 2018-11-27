package initvalue;

import bitout.BitManipulation;
import staticinit.Bowl;

/**
 * Create by leonardo on 2018/11/4
 */
public class TestMain {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main);
        BitManipulation.pBitInt("s", main.c);
    }

    void f3(int maker) {
        System.out.println("f3(" + maker + ")");
    }

    static Bowl b5 = new Bowl(5);


}
