package bitout;

import java.util.Random;

/**
 * Create by leonardo on 2018/11/2
 * 位操作
 */
public class BitManipulation {

    public static void main(String[] args) {
        Random rand = new Random();
        int i = rand.nextInt();
        int j = rand.nextInt();
        pBitInt("-1", -1);  //二进制表示 取反 +1
        pBitInt("1", 1);

//        pBitInt("Integer.MAX_VALUE",Integer.MAX_VALUE); //int的最大值
//        pBitInt("Integer.MIN_VALUE",Integer.MIN_VALUE); //int的最小值

        pBitInt("i", i); //随机值i
//        pBitInt("~i",~i); //随机值i 取反运算
//        pBitInt("j", j); //随机值i 取反运算
//        pBitInt("i | j", i | j); //随机值i j 或运算
//        pBitInt("i & j", i & j); //随机值i j 与运算
//        pBitInt("i ^ j", i ^ j); //随机值i j 异或运算
//        pBitInt("i >> 5", i >> 5); //有符号右移
//        pBitInt("i << 5", i << 5); //有符号左移
//        pBitInt("i >>> 5", i >>> 5); //无符号右移
//        long ll = 10l;
//        byte b  = (byte) ll;
//        System.out.println(b);

//            pBitInt("",0xffff);

        byte b = (byte) 0xff;
//        pBitByte("Byte.MAX_VALUE",Byte.MAX_VALUE); //byte的最小值
//        pBitByte("Byte.MIN_VALUE", (byte) -128); //byte的最小值
        System.out.println(1.9e2f);

    }

    /**
     * 输出int型的所有二进制数字
     *
     * @param s
     * @param n
     */
     public static void pBitInt(String s, int n) {
        System.out.println(s + " , int: " + n + " ,binary: ");
        for (int i = 31; i >= 0; i--) {
            if (((1 << i) & n) != 0) {
                System.out.print("1");
            } else {
                System.out.print("0");
            }
        }
        System.out.println();
    }

    /**
     * byte的二进制表示
     *
     * @param s
     * @param n
     */
    static void pBitByte(String s, byte n) {
        System.out.println(s + " , byte: " + n + " ,binary: ");
        for (int i = 7; i >= 0; i--) {
            if (((1 << i) & n) != 0) {
                System.out.print("1");
            } else {
                System.out.print("0");
            }
        }
        System.out.println();
    }

    /**
     * long类型的二进制表示
     *
     * @param s
     * @param lo
     */
    static void pBitLong(String s, long lo) {
        System.out.println(s + " ,long: " + lo + " ,binary: ");
        for (int i = 63; i >= 0; i--) {
            if (((1 << i) & lo) != 0) {
                System.out.print("1");
            } else {
                System.out.print("0");
            }
        }
        System.out.println();
    }

}
