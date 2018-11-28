package generics;

import java.util.EnumSet;
import java.util.Set;

import static generics.Sets.*;
import static generics.Watercolor.*;

/**
 * Create by leonardo on 2018/11/28
 */
public class WatercolorSets {

    public static void main(String[] args) {
        EnumSet<Watercolor> set1 = EnumSet.range(BRILLIANT_RED, VIRIDIAN_HUE);
        EnumSet<Watercolor> set2 = EnumSet.range(CERULEAN_BLUE_HUE, BURNT_SIENNA);

        System.out.println("set1: " + set1);
        System.out.println("set2: " + set2);

        System.out.println("union(set1,set2):" + union(set1, set2));

        Set<Watercolor> subSet = intersection(set1, set2);
        System.out.println("intersection(set1, set2): " + subSet);
        System.out.println("difference(set1,subSet): " + difference(set1, subSet));
        System.out.println("difference(set2,subSet): " + difference(set2, subSet));
        System.out.println("complement(set1,set2): " + complement(set1, set2));

    }

}
