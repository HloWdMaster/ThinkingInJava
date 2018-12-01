package containers;

import containers.map.Pair;
import generics.util.Generator;
import util.MapData;

import java.util.Iterator;

/**
 * Create by leonardo on 2018/12/1
 */
public class MapDataTest {

    public static void main(String[] args) {
        System.out.println(MapData.map(new Letters(),11));

    }
}


class Letters implements Generator<Pair<Integer, String>>, Iterable<Integer> {

    private int size = 9;
    private int number = 1;
    private char letter = 'A';

    @Override
    public Pair<Integer, String> next() {
        return new Pair<Integer, String>(number++, "" + letter++);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return number < size;
            }

            @Override
            public Integer next() {
                return number++;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}