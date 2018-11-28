package typeinfo.pets;

/**
 * Create by leonardo on 2018/11/11
 */
public class Mutt extends Dog {

    public Mutt() {
    }

    @Override
    public String toString() {
        return "Mutt{}";
    }

    public Mutt(String name) {
        super(name);
    }
}
