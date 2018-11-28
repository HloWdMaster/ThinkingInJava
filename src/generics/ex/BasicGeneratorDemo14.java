package generics.ex;

import generics.BasicGenerator;
import generics.CountedObject;

/**
 * Create by 163 on 2018/11/28
 */
public class BasicGeneratorDemo14 {

    public static void main(String[] args) {
        BasicGenerator14<CountedObject> co = new BasicGenerator14<>(CountedObject.class);
        for (int i = 0; i < 5; i++) {
            System.out.println(co.next());
        }
    }
}
