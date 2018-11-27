package innerclasses.controller;

/**
 * Create by leonardo on 2018/11/14
 */
public class GreenhouseControl {

    public static void main(String[] args) {
        GreenhouseControls gc = new GreenhouseControls();
        gc.addEvent(gc.new Bell(900));
        Event[] events = {
          gc.new LightOff(100),
          gc.new LightOn(200),
//          gc.new Bell(100),
        };
//        gc.addEvent(gc.new Restart(2000,events));
        if (args.length ==1 ) {
            System.out.println(1);
        }
        gc.run();

    }
}
