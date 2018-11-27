package exceptions;

/**
 * Create by leonardo on 2018/11/15
 */
public class InheritingException {

    public void f() throws SimpleException {
        System.out.println("Throws SimpleException from f()");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        InheritingException sed = new InheritingException();
        try {
            sed.f();
        } catch (SimpleException e) {
            System.out.println("Caught it");
        }
    }

}

class SimpleException extends Exception {

}