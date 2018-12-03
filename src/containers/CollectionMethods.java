package containers;

import util.Countries;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Create by leonardo on 2018/12/2
 */
public class CollectionMethods {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.addAll(Countries.names(6));
        c.add("ten");
        c.add("eleven");
        System.out.println(c);

        Object[] arr = c.toArray();
        String[] str = c.toArray(new String[0]);
        System.out.println("Collections.max(c): " + Collections.max(c));
        System.out.println("Collections.min(c): " + Collections.min(c));

        Collection<String> c2 = new ArrayList<String>();
        c2.addAll(Countries.names(6));
        c.addAll(c2);
        System.out.println(c);

        c.remove(Countries.DATA[0][0]);
        System.out.println(c);
        c.remove(Countries.DATA[1][0]);
        System.out.println(c);

    }

}
