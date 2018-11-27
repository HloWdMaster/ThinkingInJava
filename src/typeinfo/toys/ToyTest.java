package typeinfo.toys;

import java.io.PipedReader;

/**
 * Create by leonardo on 2018/11/8
 */
public class ToyTest implements HasBatteries{

    static void printInfo(Class cc) {
        System.out.println("=======     start    ==========");
        System.out.println("class name: " + cc.getName() + " is interface ? [" + cc.isInterface() + "]");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("Canonical name: " + cc.getCanonicalName());
        System.out.println("========    end      =========");
        System.out.println();

    }

    public static void main(String[] args) {
        Class c = null;
        Class<?>[] interfaces = new ToyTest().getClass().getInterfaces();
        for (Class<?> anInterface : interfaces) {
            printInfo(anInterface);
        }

//        try {
//            c = Class.forName("typeinfo.toys.FancyToy");
//        } catch (ClassNotFoundException e) {
//            System.out.println("can't find FancyToy ");
//            System.exit(1);
//        }
//        printInfo(c);
//
//        for (Class face : c.getInterfaces()) {
//            printInfo(face);
//        }
//        Class up = c.getSuperclass();
//        Object obj = null;
//        try {
//            obj = up.newInstance();
//        } catch (InstantiationException e) {
//            System.out.println("can't instantiation");
//            System.exit(1);
//        } catch (IllegalAccessException e) {
//            System.out.println("can't access");
//            System.exit(1);
//        }
//        printInfo(obj.getClass());

    }
}

