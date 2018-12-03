package util;

import java.util.AbstractList;

/**
 * Create by leonardo on 2018/12/2
 */
public class IntegerList extends AbstractList<Integer> {

    private int size;

    public IntegerList(int size) {
        this.size = size < 0 ? 0 : size;
    }

    @Override
    public Integer get(int index) {
        return Integer.valueOf(index);
    }

    @Override
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        System.out.println(new IntegerList(10));

    }
}
