package containers;

import java.util.*;

/**
 * Create by 163 on 2018/12/3
 */
public class Unsupported {
    static void test(String msg, List<String> list) {
        System.out.println("-----------" + msg + "--------------");
        Collection<String> c = list;
        Collection subList = list.subList(1, 8);
        Collection<String> c2 = new ArrayList<String>(subList);
        try {
            c.retainAll(c2);
        } catch (Exception e) {
            System.out.println("retainAll() :" + e);
        }

        try {
            c.removeAll(c2);
        } catch (Exception e) {
            System.out.println("removeAll(c2):" + e);
        }

        try {
            c.clear();
        } catch (Exception e) {
            System.out.println("clear():" + e);
        }

        try {
            c.add("X");
        } catch (Exception e) {
            System.out.println("add():" + e);
        }

        try {
            c.addAll(c2);
        } catch (Exception e) {
            System.out.println("addAll(c2)" + e);
        }

        try {
            c.remove("C");
        } catch (Exception e) {
            System.out.println("remove()" + e);
        }

        try {
            list.set(0, "x");
        } catch (Exception e) {
            System.out.println("set():" + e);
        }
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("A B C D E F G H I J K L".split(" "));
        test("modifiable Copy ", new ArrayList<String>(list));
        test("Arrays.asList()", list);
        test("unmodifiableList()", Collections.unmodifiableList(list));
    }
}
