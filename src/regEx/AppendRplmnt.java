package regEx;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Create by 163 on 2018/12/12
 */
public class AppendRplmnt {
    public static void main(String[] args) {
        String regEx = "\\w+";
        String input = "-->one+test<--";
        StringBuffer sb = new StringBuffer();
        Matcher m = Pattern.compile(regEx).matcher(input);
        while (m.find()) {
            m.appendReplacement(sb, "XXX");
        }
        m.appendTail(sb);
        System.out.println(sb.toString());

        BigDecimal bigDecimal = new BigDecimal(100.00);
    }
}
