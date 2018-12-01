package util;

import generics.util.Generator;
import typeinfo.pets.Pug;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Create by leonardo on 2018/12/1
 */
public class CollectionData<T> extends ArrayList<T>{
    public CollectionData(Generator<T> gen, int quantity) {
        for (int i = 0; i < quantity; i++) {
            add(gen.next());
        }
    }

    public static <T> CollectionData<T> list(Generator<T> gen,int quantity) {
        return new CollectionData<T>(gen,quantity);
    }

}
