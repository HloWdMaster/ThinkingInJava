package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Create by 163 on 2018/11/22
 */
public class TestRegularExpression {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage:\njava TestRegularExpression" +
                    "characterSequence regularExpression");
            System.exit(0);
        }
        System.out.println("Input: \"" + args[0] + "\"");
        for (String s : args) {
            System.out.println("Regular Expression:\"" + s + "\"");
            Pattern p = Pattern.compile(s);
            Matcher m = p.matcher(args[0]);
            while (m.find()) {
                System.out.println("Match \"" + m.group() + "\"at positions " + m.start()
                        + "-" +(m.end() - 1));
            }
        }
    }
}
