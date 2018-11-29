package generics;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

/**
 * Create by 163 on 2018/11/28
 */
public class Sets {
    public static <T> Set<T> union(Set<T> a, Set<T> b) { //求并集
        Set<T> result = new HashSet<>(a);
        result.addAll(b);
        return result;
    }

    public static <T> Set<T> intersection(Set<T> a, Set<T> b) {  //交集
        Set<T> result = new HashSet<>(a);
        result.retainAll(b);
        return result;
    }

    //取出superset中包含的subset元素
    public static <T> Set<T> difference(Set<T> superset, Set<T> subset) {
        Set<T> result = new HashSet<>(superset);
        result.removeAll(subset);
        return result;
    }

    public static <T> Set<T> complement(Set<T> a, Set<T> b) {    //
        return difference(union(a, b), intersection(a, b));
    }


}
