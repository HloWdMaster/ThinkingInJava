package generics;

import java.util.Arrays;

/**
 * Create by leonardo on 2018/11/29
 */
public class MultiDimensionalPrimitiveArray {

    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
        };
        System.out.println(Arrays.deepToString(a));
    }
}
