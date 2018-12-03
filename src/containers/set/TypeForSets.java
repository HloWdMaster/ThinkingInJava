package containers.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Create by 163 on 2018/12/3
 */
public class TypeForSets {

    static <T> Set<T> fill(Set<T> set,Class<T> type) {
        for (int i = 0; i < 10; i++) {
            try {
                set.add(type.getConstructor(int.class).newInstance(i));
            } catch (Exception e) {
                throw new RuntimeException();
            }
        }
        return set;
    }

    static <T> void test(Set<T> set, Class<T> type) {
        fill(set, type);
        fill(set, type);
        fill(set, type);
        System.out.println(set.getClass().getSimpleName()+":"+set);
        System.out.println();
    }

    public static void main(String[] args) {
        test(new HashSet<HashSet>(), HashSet.class);
        test(new LinkedHashSet<HashType>(), HashType.class);
        test(new TreeSet<TreeType>(), TreeType.class);

        test(new HashSet<SetType>(), SetType.class);
        test(new HashSet<TreeType>(), TreeType.class);

        test(new LinkedHashSet<SetType>(), SetType.class);
        test(new LinkedHashSet<TreeType>(), TreeType.class);

    }

}


class SetType {
    int i;

    public SetType(int i) {
        this.i = i;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof SetType && (i == ((SetType) obj).i);
    }

    @Override
    public String toString() {
        return Integer.toString(i);
    }
}

class HashType extends SetType {

    public HashType(int i) {
        super(i);
    }

    @Override
    public int hashCode() {
        return i;
    }
}

class TreeType extends SetType implements Comparable<TreeType> {

    public TreeType(int i) {
        super(i);
    }

    @Override
    public int compareTo(TreeType t) {
        return i < t.i ? -1 : (i == t.i ? 0 : -1);
    }
}