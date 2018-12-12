package regEx;

import java.security.Principal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Create by 163 on 2018/12/12
 */
public class QuoteReplacementTest {
    private static String regEx = "dog";
    static String input = "The dog says meow" + " All dogs say meow";
    private static String replace = "//$";

    public static void main(String[] args) {
        Matcher m = Pattern.compile(regEx).matcher(input);
        try {
            m.replaceAll(replace);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        String s = m.replaceAll(Matcher.quoteReplacement(replace));
        System.out.println(s);


    }
}
