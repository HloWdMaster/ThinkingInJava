package regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Create by 163 on 2018/12/10
 */
public class SimpleReplace {
    public static void main(String[] args) {
        String text = "Before java 1.5 was java 1.4.2. After java 1.5 is java 1.6";
        String regEx = "\\bjava\\s*1\\.([56])\\b";
        Matcher m = Pattern.compile(regEx).matcher(text);
        String result = m.replaceAll("Java $1.0");
        System.out.println(result);
    }
}
