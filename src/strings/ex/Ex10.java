package strings.ex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Create by 163 on 2018/11/22
 */
public class Ex10 {
    public static void main(String[] args) throws Exception {
//        String str = "Java now has regular expressions";
        String str = "Java now has regular expressions";
//        Pattern p = Pattern.compile("^Java");
        Pattern p = Pattern.compile("(h(a|i)s)*");
        Matcher m = p.matcher(str);
        System.out.println(m.lookingAt());
//        while (m.find()) {
//            System.out.println("match");
//            System.out.println(m.group());
//        }

    }
}
