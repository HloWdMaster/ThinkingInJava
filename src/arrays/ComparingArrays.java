package arrays;

import java.util.Arrays;

/**
 * Create by leonardo on 2018/12/1
 */
public class ComparingArrays {

    public static void main(String[] args) {
        int[] a1 = new int[10];
        int[] a2 = new int[10];

        Arrays.fill(a1, 44);
        Arrays.fill(a2, 44);
        System.out.println(Arrays.equals(a1, a2));
//        System.out.println(a1 ==a2);
        a1[3] = 11;
        System.out.println(Arrays.equals(a1, a2));

        String[] s1 = new String[4];
        Arrays.fill(s1, "Hi");
        String[] s2 = {new String("Hi"), new String("Hi"), new String("Hi"), new String("Hi")};
        System.out.println(Arrays.equals(s1,s2));


    }
}
