package innerclasses;

/**
 * Create by leonardo on 2018/11/14
 * 结论内部类可以访问外部类的私有成员和私有方法
 */
public class PrivateOuter {
    private static int i = 0;

    private int getI() {
        return i;
    }

    class Inner {
        private int j;
        private int change() {
            PrivateOuter.this.i = 1;
            return PrivateOuter.this.getI();
        }
    }

    public static void main(String[] args) {
        PrivateOuter po = new PrivateOuter();
        Inner inner = po.new Inner();
        System.out.println(inner.change());
    }

}
