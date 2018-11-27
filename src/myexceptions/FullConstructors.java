package myexceptions;

public class FullConstructors {

    public static void f() throws MyException {
        System.out.println(" Throwing MyException froom f()");
        throw new MyException();
    }
    public static void g() throws MyException {
        System.out.println(" Throwing MyException froom g()");
        throw new MyException();
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }

        try {
            g();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }
    }
}


class MyException extends Exception {
   public MyException() {}

    public MyException(String message) {
        super(message);
    }
}