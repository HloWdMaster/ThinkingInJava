package arrays;

import generics.util.Generator;

import java.util.Arrays;
import java.util.Random;

/**
 * Create by leonardo on 2018/12/1
 */
public class CompType implements Comparable<CompType> {
    int i;
    int j;

    private static int count = 1;

    public CompType(int i, int j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public String toString() {
        String result = "[i=" + i + ",j = " + j + "]";
        if (count++ % 3 == 0) {
            result += "\n";
        }
        return result;
    }

    public int compareTo(CompType rv) {
        return (i < rv.i ? -1 : (i == rv.i ? 0 : 1));
    }

    private static Random r = new Random();

    public static Generator<CompType> generator() {
        return new Generator<CompType>() {
            @Override
            public CompType next() {
                return new CompType(r.nextInt(100), r.nextInt(100));
            }
        };
    }

    public static void main(String[] args) {
        CompType[] a = new CompType[10];
        util.Generated.array(a, CompType.generator());
        System.out.println("before sorting");
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("after sorting");
        System.out.println(Arrays.toString(a));
    }
}
