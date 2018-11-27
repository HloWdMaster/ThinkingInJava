package myexceptions;

class ThreeException extends Exception {

}

/**
 * finally分支最终将执行
 */
public class FinallyWorks {
    static int count = 0;

    public static void main(String[] args) {
        while (true) {
            try {
                if (count++ == 0)
                    throw new ThreeException();
                System.out.println("No Exception" + count);
            } catch (ThreeException e) {
                e.printStackTrace();
                System.out.println("Three Exception" + count);
            } finally {
                System.out.println("In finally clause" + count);
                if (count == 2) {
                    break;
                }
            }
        }
    }
}

