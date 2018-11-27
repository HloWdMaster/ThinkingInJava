package innerclasses;

/**
 * Create by leonardo on 2018/11/14
 */
public class DotNew {
    public class Inner {
     
    }

    public static void main(String[] args) {
        DotNew dn = new DotNew();
        Inner inner = dn.new Inner();
    }
}
