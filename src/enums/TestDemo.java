package enums;

/**
 * Create by leonardo on 2018/11/13
 */
public class TestDemo {

    public static void main(String[] args) {
        EnumDemo ee = EnumDemo.NOT;

        for (EnumDemo demo : EnumDemo.values()) {
            System.out.println(demo);
        }
        System.out.println(ee.ordinal());
    }

}
