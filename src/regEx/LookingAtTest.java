package regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Create by 163 on 2018/12/13
 */
public class LookingAtTest {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("(\\w+)%(\\d+)");
        Matcher m =  p.matcher("ab%12-cd%34");
        System.out.println(m.lookingAt());
        Matcher mm = p.matcher("%ab%12-cd%34");
        mm.region(1, 8);
        System.out.println(mm.lookingAt());

    }
}
