package typeinfo.pets.impl;

import java.util.ArrayList;
import java.util.List;

import typeinfo.pets.Pet;

/**
 * Create by leonardo on 2018/11/11
 */
public class ForNameCreator extends PetCreator{

    private static List<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();
    private static String[] typeNames = {
            "typeinfo.pets.Cat",
            "typeinfo.pets.Mutt",
            "typeinfo.pets.EgyptianMau",
            "typeinfo.pets.Manx",
            "typeinfo.pets.Cymric",
            "typeinfo.pets.Rat",
            "typeinfo.pets.Mouse"
    };

    private static void loader() {
        for (String name : typeNames) {
            try {
                types.add((Class<? extends Pet>)Class.forName(name));
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static {
        loader();
    }

    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }


}
