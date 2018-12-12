import java.math.BigDecimal;

/**
 * Create by 163 on 2018/12/11
 */
public class TestMain {
    public static void main(String[] args) {
        BigDecimal divide = new BigDecimal(100.00000).divide(new BigDecimal(100));
        System.out.println(divide);
    }
}
