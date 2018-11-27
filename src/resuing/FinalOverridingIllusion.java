package resuing;

/**
 * Create by leonardo on 2018/11/7
 */
public class FinalOverridingIllusion {
    public static void main(String[] args) {
    }
}

class WithFinals {
    public void f() {
        System.out.println("WithFinals.f()");
    }

    private void g() {
        System.out.println("WithFinals.g()");
    }
}

class OverridingPrivate extends WithFinals {
    @Override
    public void f() {
        System.out.println("OverridingPrivate.f()");
    }
    

}