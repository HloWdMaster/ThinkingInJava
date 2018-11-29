package generics;

/**
 * Create by leonardo on 2018/11/28
 */
public class FactoryConstraint {
    public static void main(String[] args) {
        new Foo2<Integer>(new IntegerFactory());
        new Foo2<Widget>(new Widget.Factory());
    }

}

interface IFactory<T> {
    T create();
}

class Foo2<T> {
    private T x;

    public <F extends IFactory<T>> Foo2(F factory) {
        x = factory.create();
    }
}

class IntegerFactory implements IFactory<Integer> {

    @Override
    public Integer create() {
        return new Integer(0);
    }
}

class Widget {
    public static class Factory implements IFactory<Widget> {

        @Override
        public Widget create() {
            return new Widget();
        }
    }
}