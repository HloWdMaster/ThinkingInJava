package typeinfo.pets;

/**
 * Create by leonardo on 2018/11/11
 */
public class Cat  extends Pet{

    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Cat{}";
    }
}
