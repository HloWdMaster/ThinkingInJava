package strings;

/**
 * Create by 163 on 2018/11/22
 */
public class SimpleFormat {

    public static void main(String[] args) {
        int x = 5;
        double y = 3.1415;
        System.out.println("Row 1: [" + x + " " + y + "]");
        System.out.format("Row 2: [%d %f]\n", x, y);
        System.out.printf("Row 3: [%d %f]", x, y);
    }
}
