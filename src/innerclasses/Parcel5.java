package innerclasses;


/**
 * Create by leonardo on 2018/11/14
 * 方法内部创建类  -->局部内部类
 */
public class Parcel5 {

    public Destination destination(String s) {  //方法

        class PDestination implements Destination { //方法内部类
            private String label;
            private PDestination(String whereTo) {
                label = whereTo;
            }
            @Override
            public String readLabel() {
                return label;
            }
        }

        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel5 p = new Parcel5();
        Destination d = p.destination("Tasmania");
    }

}
