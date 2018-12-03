package generics;

/**
 * Create by 163 on 2018/11/29
 */
public class CovariantArrays {
    public static void main(String[] args) {
        Fruit[] fruit = new Apple[10];
        fruit[0] = new Apple();
        fruit[1] = new Jonathan();

//        try {
//            fruit = new Fruit[11];
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        try {
            fruit[0] = new Fruit();
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            fruit[0] = new Orange();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

class Fruit{}

class Apple extends Fruit {

}

class Jonathan extends Apple {

}

class Orange extends Fruit {

}