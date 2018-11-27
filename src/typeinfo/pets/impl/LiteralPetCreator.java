package typeinfo.pets.impl;

import typeinfo.pets.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Create by leonardo on 2018/11/11
 */
public class LiteralPetCreator extends PetCreator {

    public static final List<Class<? extends Pet>> allTypes = Collections.unmodifiableList(Arrays.asList(
            Cat.class, Cymric.class, Dog.class, EgyptianMau.class,Hamster.class,Manx.class,
            Mouse.class,Mutt.class,Pug.class,Rat.class,Rodent.class,Pet.class
    ));

    private static final List<Class<? extends Pet>> types = allTypes.subList(allTypes.indexOf(Mutt.class),allTypes.size());

    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }

    public static void main(String[] args) {
        System.out.println(allTypes.size());
        System.out.println(types.size());
    }
}
