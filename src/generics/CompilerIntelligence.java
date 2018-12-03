package generics;

import java.util.Arrays;
import java.util.List;

/**
 * Create by 163 on 2018/11/29
 */
public class CompilerIntelligence {
    public static void main(String[] args) {
        List<? extends Fruit> fList = Arrays.asList(new Apple());
        Apple a = (Apple) fList.get(0);
        System.out.println(fList.contains(new Apple()));
        System.out.println(fList.indexOf(new Apple()));

    }
}
