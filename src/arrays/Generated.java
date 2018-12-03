package arrays;

import generics.util.Generator;

import java.lang.reflect.Array;
import java.util.Collection;

/**
 * Create by 163 on 2018/11/30
 */
public class Generated {
    public static <T> T[] array(T[] a, Generator<T> gen) {
//        return new CollectionData<T>(gen,a.length).toArray(a);
        return a;
    }

    public static <T> T[] array(Class<T> type,Generator<T> gen,int size) {
         T[] a = (T[]) Array.newInstance(type,size);
//        return new CollectionData<T>(gen,size).toArray(a);
        return a;
    }


}
