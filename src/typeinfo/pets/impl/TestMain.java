package typeinfo.pets.impl;

import typeinfo.pets.Pet;

import java.util.HashMap;
import java.util.List;

/**
 * Create by leonardo on 2018/11/11
 */
public class TestMain {

    public static void main(String[] args) {

        //测试 i++ 与 ++i 的执行顺序
//        HashMap<Object, Object> map = new HashMap<>();
//        int i = 1;
//        map.put("a", ++i);
//        System.out.println(map.get("a"));

//        PetCount.countPets(new ForNameCreator());

//        for (int i = 0; i < 3; i++) {
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println(new ForNameCreator().createArray(40));
//                }
//            }){
//            }.start();
//        }


        PetCount.countPets(Pets.creator);

    }
}
