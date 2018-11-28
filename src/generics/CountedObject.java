package generics;

/**
 * Create by 163 on 2018/11/28
 */
public class CountedObject {

    private static long count = 0;
    private final long id = count++;

    public long id() {
        return id;
    }

    public String toString() {
        return "countedObject :" + id;
    }

}
