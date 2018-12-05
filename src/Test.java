import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Create by 163 on 2018/12/4
 */
public class Test {
    public static void main(String[] args) throws ParseException {
//        Date date = new Date("2018-02-04 00:00:00");
//        System.out.println(date.getTime());

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//        String format = df.format(date);
//        System.out.println(format);
        Date parse = df.parse("2018-02-04");
        System.out.println(parse.getTime());
        System.out.println(new Date().getTime());
    }
}
