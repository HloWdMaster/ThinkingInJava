package arrays.test;

import arrays.CountingGenerator;
import generics.util.Generator;

/**
 * Create by 163 on 2018/11/30
 */
public class GeneratorsTest {
    public static int size = 10;

    public static void test(Class<?> surroundingClass) {
        for (Class<?> type : surroundingClass.getClasses()) {
            System.out.print(type.getSimpleName() + ": ");
            try {
                Generator<?> g = (Generator<?>) type.newInstance();
                for (int i = 0; i < size; i++) {
                    System.out.print(g.next()+" ");
                }
                System.out.println();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        test(CountingGenerator.class);
    }
}
