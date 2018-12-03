package generics;

/**
 * Create by 163 on 2018/11/29
 */
public class Wildcards {
    static void rawArgs(Holder holder, Object arg) {
        holder.set(arg);
        holder.set(new Wildcards());
        Object o = holder.get();
    }

    static void unboundedArg(Holder<?> holder, Object arg) {
//        holder.set(arg);
        Object o = holder.get();
    }

    static <T> T excact1(Holder<T> holder) {
//        holder.set(arg);
        T t = holder.get();
        return t;
    }

    static <T> T exact2(Holder<T> holder, T arg) {
        holder.set(arg);
        T t = holder.get();
        return t;
    }

    static <T> T wildSubtype(Holder<? extends T> holder, T arg) {
//        holder.set(arg);
        T t = holder.get();
        return t;
    }

    static <T> void wildSupertype(Holder<? super T> holder, T arg) {
        holder.set(arg);
        Object o = holder.get();
    }

    public static void main(String[] args) {
        Holder raw = new Holder<>();
        raw = new Holder();
        Holder<Long> qualified = new Holder<>();
        Holder<?> unbounded = new Holder<>();
        Holder<? extends Long> bounded = new Holder<>();
        Long lng = 1L;

        rawArgs(raw,lng);
        rawArgs(qualified,lng);
        rawArgs(unbounded,lng);
        rawArgs(bounded,lng);

        unboundedArg(raw,lng);
        unboundedArg(qualified,lng);
        unboundedArg(unbounded,lng);
        unboundedArg(bounded,lng);

        Object r1 = excact1(raw);
        Long r2 = excact1(qualified);
        Object r3 = excact1(unbounded);
        Long r4 = excact1(bounded);

        Object o = exact2(raw, lng);
        Long aLong = exact2(qualified, lng);
//        Object o1 = exact2(unbounded, lng);
//        exact2(bounded,lng);

    }
}
