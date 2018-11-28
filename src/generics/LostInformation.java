package generics;

import java.util.*;

/**
 * Create by leonardo on 2018/11/28
 */
class Frob {}
class Fnorkle{}
class Quark<Q> {}
class Particle<POSITION, MOMENTUM> {}

public class LostInformation {
    public static void main(String[] args) {
        List<Frob> frobs = new ArrayList<>();
        Map<Frob, Fnorkle> map = new HashMap<>();
        Quark<Fnorkle> quark = new Quark<>();
        Particle<Long, Double> p = new Particle<>();
        System.out.println(Arrays.toString(frobs.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(map.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(quark.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(p.getClass().getTypeParameters()));

        System.out.println(frobs.getClass().getTypeParameters());
        System.out.println(map.getClass().getTypeParameters());
        System.out.println((quark.getClass().getTypeParameters()));
        System.out.println((p.getClass().getTypeParameters()));

    }
}
