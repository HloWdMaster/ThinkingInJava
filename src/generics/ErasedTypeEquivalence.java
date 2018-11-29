package generics;

import java.util.ArrayList;

/**
 * Create by leonardo on 2018/11/28
 */
public class ErasedTypeEquivalence {
    public static void main(String[] args) {
        Class c1 = new ArrayList<Integer>().getClass();
        Class c2 = new ArrayList<String>().getClass();
        System.out.println(c1==c2);
    }
}
