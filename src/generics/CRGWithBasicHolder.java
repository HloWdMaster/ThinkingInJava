package generics;

/**
 * Create by 163 on 2018/11/29
 */
class Subtype extends BasicHolder<Subtype> {

}

public class CRGWithBasicHolder {

    public static void main(String[] args) {
        Subtype subtype = new Subtype(),st2 = new Subtype();
        subtype.set(st2);

    }
}
