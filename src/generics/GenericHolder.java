package generics;

/**
 * Create by leonardo on 2018/11/28
 */
public class GenericHolder<T> {
    private T obj;

    public void set(T obj) {
        this.obj = obj;
    }

    public T get() {
        return obj;
    }

    public static void main(String[] args) {
        GenericHolder<String> ghs = new GenericHolder<>();
        ghs.set("generic");
        String s = ghs.get();
        System.out.println(s);
    }
}
