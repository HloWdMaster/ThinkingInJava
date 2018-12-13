package regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * text 目标字符串
 * from 目标范围的开始
 * to   目标范围的末尾
 */
public class RegionTest {
    public static void main(String[] args) {
        Matcher m = Pattern.compile("(\\w+)%(\\d+)").matcher("  ab%12-cd%34");
//        m.region(0,4);
        while (m.find()) {
            System.out.println(m.group());
            System.out.println(m.regionStart());
            System.out.println(m.regionEnd());
        }


    }
}
