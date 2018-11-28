package generics;

/**
 * Create by 163 on 2018/11/26
 */
public class A {
    public void print() {
        System.out.println("A");
    }

    public static void main(String[] args) {
        A a = new B();
        new A().print();
        a.print();
    }
}

class B extends A {
    public void print() {
        System.out.println("B");
    }
}