package generics;

/**
 * Create by leonardo on 2018/11/25
 */
public class TwoTuple<A, B> {
    public final A first;
    public final B second;

    public TwoTuple(A a, B b) {
        this.first = a;
        this.second = b;
    }

    public String toString() {
        return "(" + first + "," + second + ")";
    }
}
