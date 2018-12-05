package containers.map.hashcode;

import java.util.Random;

/**
 * Create by leonardo on 2018/12/3
 */
public class Prediction {

    private static Random rand = new Random();
    private boolean shadow = rand.nextDouble() > 0.5;

    @Override
    public String toString() {
        if (shadow)
            return "six more weeks of winter!";
        else
            return "Early Spring";
    }
}
