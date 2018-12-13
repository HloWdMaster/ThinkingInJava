package regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Create by 163 on 2018/12/13
 */
public class PatternTest {

    static String printArr(String[] arr) {
        int len = arr.length;
        StringBuffer sb = new StringBuffer();
        sb.append("{");
        for (int i = 0; i < len; i++) {
            sb.append("\"").append(arr[i]).append("\"");
            if (i != len - 1) {
                sb.append(",");
            }
        }
        sb.append("}").append(", 共有" + len + "个元素");
        return sb.toString();
    }

    public static void main(String[] args) {
//        Pattern p = Pattern.compile("o");
//        CharSequence input = "boo:and:foo";
//        String[] arr = p.split(input, -1);    //匹配所有
//        System.out.println(printArr(arr));
//        arr = p.split(input,3);
//        System.out.println(printArr(arr));
//        arr = p.split(input,7);
//        System.out.println(printArr(arr));
//        arr = p.split(input,0);
//        System.out.println(printArr(arr));
//
//        Pattern p1 = Pattern.compile("\\w+");
//        System.out.println(p1);

        Matcher m = Pattern.compile("\\\\").matcher("\\");
        while (m.find()) {
            System.out.println(m.group());
        }

    }


}
