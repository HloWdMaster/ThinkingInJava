package generics;

/**
 * Create by leonardo on 2018/11/28
 */
public class ClassTypeCapture<T> {
    Class<T> kind;

    public ClassTypeCapture(Class<T> kind) {
        this.kind = kind;
    }

    public boolean f(Object arg) {
        return kind.isInstance(arg);
    }

    public static void main(String[] args) {
        ClassTypeCapture<Building> ctcb = new ClassTypeCapture<>(Building.class);
        System.out.println(ctcb.f(new Building()));
        System.out.println(ctcb.f(new House()));
        ClassTypeCapture<House> ctcb2 = new ClassTypeCapture<>(House.class);
        System.out.println(ctcb2.f(new Building()));
        System.out.println(ctcb2.f(new House()));

    }
}


class Building {

}

class House extends Building {

}