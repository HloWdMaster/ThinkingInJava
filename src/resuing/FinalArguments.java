package resuing;

/**
 * Create by leonardo on 2018/11/7
 */
public class FinalArguments {
    void with(final Gizmo g) {
//        g = new Gizmo();
    }

    void without(Gizmo g) {
        g = new Gizmo();
        g.spin();
    }

}

class Gizmo {
    public void spin() {

    }
}

