package typeinfo.pets;

/**
 * Create by leonardo on 2018/11/11
 */
public class Mouse extends Rodent {

    public Mouse() {
    }

    @Override
    public String toString() {
        return "Mouse{}";
    }

    public Mouse(String name) {
        super(name);
    }
}
