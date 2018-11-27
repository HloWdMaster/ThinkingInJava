package typeinfo;

import java.lang.invoke.CallSite;

/**
 * Create by leonardo on 2018/11/8
 */
public class Sweetshop {
    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("Usage : sweetName");
            System.exit(0);
        }
        Class c = null;
        try {
            c = Class.forName(args[0]);
            System.out.println("Enjoy your "+args[0]);
        } catch (ClassNotFoundException e) {
            System.out.println("can't find "+args[0]);
        }
    }
}

class Candy {
    static {
        System.out.println("Loading Candy");
    }
}

class Gum {
    static {
        System.out.println("Loading Gum");
    }
}

class Cookie {
    static {
        System.out.println("Loading Cookie");
    }
}
