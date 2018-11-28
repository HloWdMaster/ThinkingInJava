package typeinfo.pets;

/**
 * Create by leonardo on 2018/11/11
 */
public class Pet extends Individual{

    public Pet() {
    }

    @Override
    public String toString() {
        return "Pet{}";
    }

    public Pet(String name) {
        super(name);
    }
}
