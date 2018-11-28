package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Create by 163 on 2018/11/22
 */
public class Groups {
    static public final String POEM =
            "Twas brilling, and the slighty toves\n" +
                    "Did gyre and gimble in the wabe.\n" +
                    "All mimsy were the borogoves,\n" +
                    "And the mome raths outgrabe.\n\n";

    public static void main(String[] args) {
        Matcher m = Pattern.compile("(?m)(\\S+)\\s+(\\S+)\\s+(\\S+)$").matcher(POEM);
        while (m.find()) {
            for (int i = 0; i < m.groupCount(); i++) {
                System.out.print("[" + m.group(i) + "]");
            }
            System.out.println();
        }
    }
}
