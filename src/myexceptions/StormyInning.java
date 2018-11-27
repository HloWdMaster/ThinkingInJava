package myexceptions;

/**
 * Create by leonardo on 2018/11/19
 */
class BaseballException extends Exception {
}

class Foul extends BaseballException {  //犯规
}

class Strike extends Foul { //打击
}

abstract class Inning {

    public Inning() throws BaseballException {
    }

    public void event() throws BaseballException {
    }

    public abstract void atBat() throws Strike, Foul;

    public void walk() {

    }
}

class StormExcepiton extends Exception {
}

class RainedOut extends StormExcepiton {
}

class PopFoul extends Foul {
}

interface Storm {
    public void event() throws RainedOut;

    public void rainHard() throws RainedOut;
}

/**
 * 异常可以少抛 父类抛 子类不抛
 * 异常不可以多抛 父类不抛 子类抛 参考多态  父类.方法() 可以让子类异常失效
 */
public class StormyInning extends Inning implements Storm {

    public StormyInning() throws RainedOut, BaseballException {
    }

    public StormyInning(String s) throws Foul, BaseballException {
    }

    //子类抛出父类没有的异常 无法编译 可以通过Inning.walk()调用时不抛出异常
//    public void walk() throws BaseballException {    }

    //子类方法不能抛出比父类多的异常
//    public void event() throws BaseballException{}

    //子类可以不抛出父类异常
    public void rainHard() throws RainedOut {
    }


    public void event()  {
    }

    @Override
    public void atBat() throws PopFoul {

    }


    public static void main(String[] args) {
        try {
            StormyInning si = new StormyInning();
            si.atBat();
        } catch (PopFoul popFoul) {
            popFoul.printStackTrace();
        } catch (BaseballException e) {
            e.printStackTrace();
        } catch (RainedOut rainedOut) {
            rainedOut.printStackTrace();
        }

        try {
            Inning in = new StormyInning();
            in.atBat();
        } catch (RainedOut rainedOut) {
            rainedOut.printStackTrace();
        } catch (BaseballException e) {
            e.printStackTrace();
        }
    }


}
