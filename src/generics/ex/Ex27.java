package generics.ex;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by 163 on 2018/11/29
 * 协变性对通配符不起作用
 */
public class Ex27 {
    public static void main(String[] args) {
        List<? extends Number> nList = new ArrayList<Integer>();
//        nList.add(new Integer(0));
        nList.add(null);
//        nList.add();
        nList.get(0);
    }
}
