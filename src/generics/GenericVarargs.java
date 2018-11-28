package generics;

import java.util.*;

/**
 * Create by 163 on 2018/11/27
 */
public class GenericVarargs {
    public static <T> List<T> makeList(T...args) {
        List<T> result = new ArrayList<T>();
        for (T arg : args) {
            result.add(arg);
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> ls = makeList("A");
        System.out.println(ls);
        ls = makeList("A", "B", "C");
        System.out.println(ls);
    }
}
