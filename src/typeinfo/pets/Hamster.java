package typeinfo.pets;

/**
 * Create by leonardo on 2018/11/11
 */
public class Hamster extends Rodent {

    public Hamster() {
    }

    @Override
    public String toString() {
        return "Hamster{}";
    }

    public Hamster(String name) {
        super(name);
    }
}
