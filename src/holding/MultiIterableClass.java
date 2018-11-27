package holding;

import java.util.*;

/**
 * Create by leonardo on 2018/11/21
 */
public class MultiIterableClass extends IterableClass {

    public Iterable<String> reversed() {
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                return new Iterator<String>() {
                    private int current = words.length - 1;

                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public String next() {
                        return words[current--];
                    }

                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

    public Iterable<String> randomized() {
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                List<String> shuffled = new ArrayList<>(Arrays.asList(words));
                Collections.shuffle(shuffled, new Random());
                return shuffled.iterator();
            }
        };
    }

    public static void main(String[] args) {
        MultiIterableClass mic = new MultiIterableClass();
        for (String s : mic.reversed()) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("===============");
        for (String s : mic.randomized()) {
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.println("===============");
        for (String s : mic) {
            System.out.print(s+" ");
        }
    }
}
