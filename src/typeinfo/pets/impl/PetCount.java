package typeinfo.pets.impl;

import java.util.HashMap;

import typeinfo.pets.Cymric;
import typeinfo.pets.EgyptianMau;
import typeinfo.pets.Manx;
import typeinfo.pets.Mouse;
import typeinfo.pets.Mutt;
import typeinfo.pets.Pet;
import typeinfo.pets.Rat;

/**
 * Create by leonardo on 2018/11/11
 */
public class PetCount {

	
	static class PetCounter extends HashMap<String, Integer> {  //内部类
        public  void count(String type) {
            Integer quantity = get(type);
            if (quantity == null) {
                put(type, 1);
            } else {
                put(type, quantity + 1);
            }
        }
    }

    public static void countPets(PetCreator creator) {
        PetCounter counter = new PetCounter();
        for (Pet pet : creator.createArray(30)) {
            String name = pet.getClass().getSimpleName();
            if (pet instanceof Mutt) {
                counter.count(name);
            }
            if (pet instanceof EgyptianMau) {
                counter.count(name);
            }
            if (pet instanceof Manx) {
                counter.count(name);
            }
            if (pet instanceof Cymric) {
                counter.count(name);
            }
            if (pet instanceof Rat) {
                counter.count(name);
            }
            if (pet instanceof Mouse) {
                counter.count(name);
            }
            if (pet instanceof Mouse) {
                counter.count(name);
            }
        }
        System.out.println(counter);
    }


}
