package generics;

import java.lang.reflect.Array;

/**
 * Create by 163 on 2018/11/29
 */
public class GenericArrayWithTypeToken<T> {
    private T[] array;

    public GenericArrayWithTypeToken(Class<T> type,int sz) {
        array = (T[]) Array.newInstance(type, sz);
    }

    public void put(int index,T item) {
        array[index] = item;
    }

    public T get(int index) {
        return array[index];
    }

    public T[] rep() {
        return array;
    }

    public static void main(String[] args) {
        GenericArrayWithTypeToken<Integer> gai = new GenericArrayWithTypeToken<>(Integer.class, 5);
        Integer[] rep = gai.rep();
        System.out.println(rep);
    }
    
}
