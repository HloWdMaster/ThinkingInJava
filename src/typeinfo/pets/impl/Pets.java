package typeinfo.pets.impl;

import typeinfo.pets.Pet;

import java.util.ArrayList;

/**
 * Create by leonardo on 2018/11/11
 */
public class Pets {

    public static final PetCreator creator = new LiteralPetCreator();

    public static Pet randomPet() {
        return creator.randomPet();
    }

    public static Pet[] createArray(int size) {
        return creator.createArray(size);
    }

    public static ArrayList<Pet> arrayList(int size) {
        return creator.arrayList(size);
    }
}
