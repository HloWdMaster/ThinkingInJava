package generics;

import java.util.Arrays;
import java.util.Random;

/**
 * Create by 163 on 2018/11/30
 */
public class RaggedArray {
    public static void main(String[] args) {
        Random r = new Random();
        int[][][] a = new int[r.nextInt(5)][][];
        for (int i = 0; i < a.length; i++) {
            a[i] = new int[r.nextInt(5)][];
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = new int[r.nextInt(5)];
            }
        }
        System.out.println(Arrays.deepToString(a));
    }
}
