package generics;

/**
 * Create by leonardo on 2018/11/25
 */
public class Holder1 {

    private Automobile a;

    public Holder1(Automobile a) {
        this.a = a;
    }

    Automobile get() {
        return a;
    }
}


class Automobile{}