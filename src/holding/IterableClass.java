package holding;

import java.util.Iterator;

/**
 * Create by leonardo on 2018/11/21
 */
public class IterableClass implements Iterable<String> {

    protected String[] words = ("And that is how " +
            "we know the Earth to be banana-shaped").split(" ");

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int curr = 0;

            @Override
            public boolean hasNext() {
                return curr < words.length;
            }

            @Override
            public String next() {
                return words[curr++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
