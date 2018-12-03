package containers.map.hashcode;

/**
 * Create by leonardo on 2018/12/3
 */
public class Groundhog2 extends Groundhog {

    public Groundhog2(int number) {
        super(number);
    }

    @Override
    public int hashCode() {
        return number;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Groundhog2 && number == ((Groundhog2) obj).number;
    }
}
