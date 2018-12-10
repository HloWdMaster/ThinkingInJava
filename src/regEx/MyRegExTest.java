package regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Create by 163 on 2018/12/10
 */
public class MyRegExTest {
    public static void main(String[] args) {
        String url = "http://regex.info.blog";
        String regex = "(?x) ^(https?)://([^/:]+)(?:(\\d+))?";
        Matcher m = Pattern.compile(regex).matcher(url);
        if (m.find()) {
            System.out.println("Overall [" + m.group() + "]" +
                    " (from " + m.start() + " to " + m.end() + ")\n" +
                    "Protocal [" + m.group(1) + "]" +
                    " (from " + m.start(1) + " to " + m.end(1) + ")\n" +
                    "Hostname [" + m.group(2) + "]" +
                    " (from " + m.start(2) + " to " + m.end(2) + ")"
            );
        }
        if (m.group(3) == null) {
            System.out.println("No port; default of '80' is assumed");
        } else {
            System.out.println("Post is [" + m.group(3) + "]" +
                    " (from " + m.start(3) + " to " + m.end(3) + ")");
        }
    }
}
