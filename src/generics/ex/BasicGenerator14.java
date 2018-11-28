package generics.ex;

import generics.util.Generator;

/**
 * Create by 163 on 2018/11/28
 */
public class BasicGenerator14<T> implements Generator<T>{

    private Class<T> type;

    public BasicGenerator14(Class<T> type) {
        this.type = type;
    }

    @Override
    public T next() {
        try {
            return type.newInstance();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
