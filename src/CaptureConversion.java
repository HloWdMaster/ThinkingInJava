import generics.Holder;

import javax.xml.transform.sax.SAXTransformerFactory;

/**
 * Create by 163 on 2018/11/29
 */
public class CaptureConversion {
    static <T> void f1(Holder<T> holder) {
        T t = holder.get();
        System.out.println(t.getClass().getSimpleName());
    }

    static void f2(Holder<?> holder) {
        f1(holder);
    }

    public static void main(String[] args) {
        Holder raw = new Holder<Integer>(1);
        f1(raw);
//        f2(raw);

    }

}
