package arrays;

import generics.util.Generator;

import java.util.Random;

/**
 * Create by 163 on 2018/11/30
 */
public class RandomGenerator {

    private static Random r = new Random();

    public static class Boolean implements Generator<java.lang.Boolean> {
        private boolean flag;

        @Override
        public java.lang.Boolean next() {
            return r.nextBoolean();
        }
    }

    public static class Byte implements Generator<java.lang.Byte> {
        @Override
        public java.lang.Byte next() {
            return (byte) r.nextInt();
        }
    }

    static char[] chars = ("abcdefghijklmnopqrstuvwxyz" +
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ").toCharArray();

    public static class Character implements Generator<java.lang.Character> {
        @Override
        public java.lang.Character next() {
            return chars[r.nextInt(chars.length)];
        }
    }

    public static class Short implements Generator<java.lang.Short> {

        @Override
        public java.lang.Short next() {
            return (short) r.nextInt();
        }
    }

    public static class Integer implements Generator<java.lang.Integer> {
        private int mod = 10000;

        public Integer() {
        }

        public Integer(int mod) {
            this.mod = mod;
        }

        @Override
        public java.lang.Integer next() {
            return r.nextInt(mod);
        }
    }

    public static class String extends CountingGenerator.String {
        {
            cg = new Character();
        }

        public String() {
        }

        public String(int length) {
            super(length);
        }

    }

    public static class Long implements Generator<java.lang.Long> {
        private int mod = 10000;

        public Long() {
        }

        public Long(int mod) {
            this.mod = mod;
        }

        @Override
        public java.lang.Long next() {
            return new java.lang.Long(r.nextInt(mod));
        }
    }

    public static class Float implements Generator<java.lang.Float> {

        @Override
        public java.lang.Float next() {
            int trimed = Math.round(r.nextFloat() * 100);
            return ((float) trimed) / 100;
        }
    }

    public static class Double implements Generator<java.lang.Double> {
        @Override
        public java.lang.Double next() {
            long trimed = Math.round(r.nextDouble() * 100);
            return ((double) trimed) / 100;
        }
    }
}
