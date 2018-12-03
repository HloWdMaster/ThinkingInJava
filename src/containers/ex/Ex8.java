package containers.ex;

/**
 * Create by 163 on 2018/12/3
 */
public class Ex8 {
    public static void main(String[] args) {
        SList<String> sl = new SList<>();
        System.out.println(sl);
        SListIterator<String> it = sl.iterator();
        it.insert("Hi");
        it.insert("jack");

        System.out.println(sl);
        SListIterator<String> it2 = sl.iterator();
        it2.remove();
        System.out.println(sl);
    }
}

class SList<E> {
    private Link<E> headLink = new Link<E>(null);

    public SListIterator<E> iterator() {
        return new SListIterator<>(headLink);
    }

    public String toString() {
        if (headLink.next == null) {
            return "SList:[]";
        }
        SListIterator<E> it = iterator();
        StringBuilder sb = new StringBuilder();
        sb.append("SList:[");
        while (it.hasNext()) {
            sb.append(it.next() + (it.hasNext() ? ", " : "]"));
        }
        return sb.toString();
    }
}

class Link<E> {
    E e;
    Link<E> next;

    Link(E e, Link<E> next) {
        this.e = e;
        this.next = next;
    }

    Link(E e) {
        this(e, null);
    }

    public String toString() {
        if (e == null) {
            return "null";
        }
        return e.toString();
    }
}

class SListIterator<E> {
    Link<E> current;

    SListIterator(Link<E> link) {
        current = link;
    }

    public boolean hasNext() {
        return current.next != null;
    }

    public Link<E> next() {
        current = current.next;
        return current;
    }

    public void insert(E e) {
        current.next = new Link<E>(e, current.next);
        current = current.next;
    }

    public void remove() {
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

}