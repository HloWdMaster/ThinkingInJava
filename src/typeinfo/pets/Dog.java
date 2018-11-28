package typeinfo.pets;

/**
 * Create by leonardo on 2018/11/11
 */
public class Dog extends Pet {

    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Dog{}";
    }
}
