package generics;

import typeinfo.pets.Cat;
import typeinfo.pets.Dog;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by 163 on 2018/11/29
 */
public class CheckedList {

    static void oldStyleMethod(List probabblyDogs) {
        probabblyDogs.add(new Cat());
    }

    public static void main(String[] args) {
        List<Dog> dogs  = new ArrayList<Dog>();
        oldStyleMethod(dogs);
        System.out.println(dogs);
    }
public class CkeckedList {
}
