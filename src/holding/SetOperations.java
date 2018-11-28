package holding;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetOperations {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        Collections.addAll(set, "A B C D E F G H I J K L".split(" "));
        set.add("M");
        System.out.println("set:" + set);
        System.out.println("contains H:" + set.contains("H"));
        System.out.println("contains N:" + set.contains("N"));

        Set<String> set2 = new HashSet<>();
        Collections.addAll(set2, "H I J K L".split(" "));
        System.out.println("set2:" + set2);
        System.out.println("set2 in set:" + set.containsAll(set2));

        set.remove("H");
        System.out.println("set remove 'H':" + set);
        System.out.println("set2 in set:" + set.containsAll(set2));
        set.removeAll(set2);
        System.out.println("set2 removed from set:" + set);
        Collections.addAll(set, "X Y Z".split(" "));
        System.out.println("'X Y Z' added to set:" + set);

    }
}
