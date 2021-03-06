package containers.set;

import java.util.*;

/**
 * Create by 163 on 2018/12/3
 */
public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet<String>  sortedSet=  new TreeSet<String>();
        Collections.addAll(sortedSet,
                "one two three four five six seven eight nine".split(" "));
        System.out.println(sortedSet);
        String low = sortedSet.first();
        String high = sortedSet.last();
        System.out.println(low);
        System.out.println(high);

//        Iterator<String> it = sortedSet.iterator();
//        for (int i = 0; i < 6; i++) {
//            if (i == 3)
//                low = it.next();
//            if (i ==6)
//                high = it.next();
//            else
//                it.next();
//        }
//        System.out.println(low);
//        System.out.println(high);
        System.out.println(sortedSet.subSet(low,high)); //  [low,high)
        System.out.println(sortedSet.headSet(low)); //小于low
        System.out.println(sortedSet.tailSet(high));    //大于等于high
    }
}
