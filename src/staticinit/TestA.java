package staticinit;

import com.sun.javafx.runtime.SystemProperties;
import jdk.nashorn.internal.ir.ReturnNode;

/**
 * Create by leonardo on 2018/11/11
 */
public class TestA {

    public static void main(String[] args) {
        System.out.println(new A().getA());
    }
}


class A {

    public static int a = 1;

    static{
        System.out.println("Static{}");
    }

    public static int getA() {
        System.out.println("static getA(){}");
        return a;
    }

    public A() {
        this.a = 123;
        System.out.println("A(){}");
    }
}