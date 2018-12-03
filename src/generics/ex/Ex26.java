package generics.ex;

/**
 * Create by 163 on 2018/11/29
 */
public class Ex26 {
    public static void main(String[] args) {
        Number[] numbers = new Integer[3];

        numbers[0] = new Integer(0);
        numbers[1] = new Integer(1);
        numbers[2] = new Integer(2);

        try {
            numbers[1] = new Double(3.4);
        } catch (Exception e) {
            System.out.println(e);
        }

        for (Number number : numbers) {
            System.out.println(number);
        }

        for (Number n : numbers) {
            System.out.println(n.getClass().getSimpleName());
        }
    }
}
