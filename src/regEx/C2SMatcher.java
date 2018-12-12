package regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Create by 163 on 2018/12/12
 */
public class C2SMatcher {
    public static void main(String[] args) {
        String metric = "from 26.1C to 41.3C.";

        Matcher m = Pattern.compile("(\\d+(?:\\.\\d+)?)C\\b").matcher(metric);
        StringBuffer result = new StringBuffer();
        while (m.find()) {
            float celsius = Float.parseFloat(m.group(1));
            int fahrenheit = (int) (celsius * 9 / 5 + 32);
            m.appendReplacement(result, fahrenheit+"F");
        }
        m.appendTail(result);
        System.out.println(result);

    }
}


