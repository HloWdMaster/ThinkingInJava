import regEx.QuoteReplacementTest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Create by 163 on 2018/12/4
 */
public class Test {
    public static void main(String[] args) throws ParseException {
//        Date date = new Date("2018-02-04 00:00:00");
//        System.out.println(date.getTime());

//        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
////        String format = df.format(date);
////        System.out.println(format);
//        Date parse = df.parse("2018-02-04");
//        System.out.println(parse.getTime());
//        System.out.println(new Date().getTime());

        Pattern p = Pattern.compile("(.)");
        Matcher m = p.matcher("as' asa");
        System.out.println("as' asa");
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb,Matcher.quoteReplacement(m.group(1)));
        }
        m.appendTail(sb);
        System.out.println(sb);
        System.out.println(p);
    }
}
