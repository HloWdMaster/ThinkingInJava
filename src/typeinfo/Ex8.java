package typeinfo;

class A {
}

class B extends A {
}

class C extends B {
}

/**
 * Create by leonardo on 2018/11/8
 */
public class Ex8 {

    public static void hierarchy(Object o) {
        if (o.getClass().getSuperclass() != null) {
            System.out.println(o.getClass() + " is subClass of " + o.getClass().getSuperclass());

            try {
                hierarchy(o.getClass().getSuperclass().newInstance());
            } catch (InstantiationException e) {
                System.out.println("Unable to Instantiate obj");
            } catch (IllegalAccessException e) {
                System.out.println("Unable to access obj");
            }
        }
    }

    public static void main(String[] args) {
        hierarchy(new C());
    }
}
