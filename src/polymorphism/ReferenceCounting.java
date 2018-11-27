package polymorphism;

/**
 * Create by leonardo on 2018/11/13
 */
public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
//        Composing[] composes = new Composing[]{
//                new Composing(shared),
//                new Composing(shared),
//                new Composing(shared),
//                new Composing(shared),
//        };
//        for (Composing compose : composes) {
//            compose.dispose();
//        }
        Composing compTest = new Composing(shared);
        Composing compTest2 = new Composing(shared);
        // Test finalize():
        shared.finalize();
        Shared sharedTest = new Shared();
        Composing compTest3 = new Composing(sharedTest);
        // Test sharedTest finalize():
        sharedTest.finalize();
    }

}

class Shared {
    private int refCount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared() {
        System.out.println("Creating " + this);
    }

    public void addRef() {
        refCount++;
    }

    public void dipose() {
        if (--refCount == 0) {
            System.out.println("Disposing " + this);
        }
    }

    protected void finalize() {
        if(refCount > 0)
            System.out.println("Error: " + refCount + " Shared " + id + " objects in use");
    }

    @Override
    public String toString() {
        return "Shared" + id;
    }
}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;

    public Composing(Shared shared) {
        System.out.println("creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }

    public void dispose() {
        System.out.println("disposing " + this);
        shared.dipose();
    }

    @Override
    public String toString() {
        return "Composing" + id;
    }
}