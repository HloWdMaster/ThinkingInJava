package generics;

/**
 * Create by leonardo on 2018/11/28
 */
public class SimpleHolder {
    private Object obj;

    public void set(Object obj) {
        this.obj = obj;
    }

    public Object get() {
        return obj;
    }

    public static void main(String[] args) {
        SimpleHolder sh = new SimpleHolder();
        sh.set("item");
        String s = (String) sh.get();
        System.out.println(s);
    }
}
