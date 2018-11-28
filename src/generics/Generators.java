package generics;

import generics.coffee.Coffee;
import generics.util.Generator;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Create by 163 on 2018/11/27
 */
public class Generators {
    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static void main(String[] args) {
        Collection<Coffee> coffee = fill(new ArrayList<>(), new CoffeGenerator(), 4);
        for (Coffee c : coffee) {
            System.out.println(c);
        }
        Collection<Integer> fill = fill(new ArrayList<Integer>(), new Fibonacci(), 5);
        for (Integer integer : fill) {
            System.out.print(integer+" ");
        }
    }
}
