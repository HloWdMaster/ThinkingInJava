package arrays;

import java.util.Arrays;

/**
 * Create by 163 on 2018/11/30
 */
public class CopyingArrays {
    public static void main(String[] args) {
        int[] i = new int[7];
        int[] j = new int[10];
        Arrays.fill(i, 47);
        Arrays.fill(j, 99);

        System.out.println("i= " + Arrays.toString(i));
        System.out.println("j= " + Arrays.toString(j));
        System.arraycopy(i, 0, j, 0, i.length);
        System.out.println("j= " + Arrays.toString(j));

        int[] k = new int[5];
        Arrays.fill(k, 103);

        System.arraycopy(k, 0, i, 0, k.length);
        System.out.println("i = " + Arrays.toString(i));

        Integer[] u = new Integer[10];
        Integer[] v = new Integer[5];
        Arrays.fill(u, new Integer(47));
        Arrays.fill(v, new Integer(99));
        System.arraycopy(v, 0, u, u.length / 2, v.length);

    }
}
