package generics;

/**
 * Create by 163 on 2018/11/29
 */
public class GeneratorCreate {
    public static void main(String[] args) {
        Creator c = new Creator();
        c.f();
    }
}

abstract class GenericWithCreate<T> {
    final T element;

    public GenericWithCreate() {
        this.element = create();
    }

    protected abstract T create();

}

class X {
}

class Creator extends GenericWithCreate<X> {

    @Override
    protected X create() {
        return new X();
    }

    void f() {
        System.out.println(element.getClass().getSimpleName());
    }
}