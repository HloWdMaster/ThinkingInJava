package containers.ex;

import util.Countries;

import java.util.*;

/**
 * Create by 163 on 2018/12/3
 */
public class Ex7 {
    public static void main(String[] args) {
        List al = new ArrayList<>(Countries.names(3));
        List ll = new LinkedList(Countries.names(3));

        System.out.println(al);
        System.out.println(ll);
        Iterator alIter = al.iterator();
        Iterator llIter = ll.iterator();

        while (alIter.hasNext()) {
            System.out.print(alIter.next() + (alIter.hasNext() ? "," : ""));
        }
        System.out.println();

        while (llIter.hasNext()) {
            System.out.print(llIter.next() + (llIter.hasNext() ? "," : ""));
        }
        System.out.println();

        ListIterator allI = al.listIterator();
        ListIterator lllI = ll.listIterator();
        while (lllI.hasNext()) {
            allI.add((String) lllI.next());
            allI.next();
        }
        System.out.println(al);
        while (lllI.hasPrevious())
            lllI.previous();
        List al2 = new ArrayList<String>(Countries.names(4));
        ListIterator alli2 = al2.listIterator();
        while (alli2.hasNext()) {
            alli2.next();
        }
        while (lllI.hasNext()) {
            alli2.add((String) lllI.next());
            alli2.previous();
            alli2.previous();
        }
        System.out.println(al2);

    }
}
