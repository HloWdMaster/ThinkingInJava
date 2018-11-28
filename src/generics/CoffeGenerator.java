package generics;

import generics.coffee.*;
import generics.util.Generator;

import java.util.Iterator;
import java.util.Random;

/**
 * Create by 163 on 2018/11/26
 */
public class CoffeGenerator implements Generator, Iterable<Coffee> {

    private Class[] types = {Latte.class, Mocha.class, Cappuccino.class, Americano.class};
    private static Random rand = new Random();

    public CoffeGenerator() {
    }

    @Override
    public String toString() {
        return super.toString();
    }

    private int size = 0;

    public CoffeGenerator(int sz) {
        size = sz;
    }


    @Override
    public Coffee next() {

        try {
            return (Coffee) types[rand.nextInt(types.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    class CoffeeIterator implements Iterator<Coffee> {

        int count = size;

        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Coffee next() {
            count--;
            return CoffeGenerator.this.next();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static void main(String[] args) {
        CoffeGenerator gen = new CoffeGenerator();
        for (int i = 0; i < 5; i++) {
            System.out.println(gen.next());
        }
        for (Coffee c : new CoffeGenerator(5)) {
            System.out.println(c);
        }
    }
}
