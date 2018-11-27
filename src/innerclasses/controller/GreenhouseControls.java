package innerclasses.controller;

/**
 * Create by leonardo on 2018/11/14
 */
public class GreenhouseControls extends Controller{

    private boolean light = false;

    public class LightOn extends Event {

        public LightOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            light = true;
        }

        @Override
        public String toString() {
            return "light is on";
        }
    }

    public class LightOff extends Event {

        public LightOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            light = false;
        }

        @Override
        public String toString() {
            return "light is off";
        }
    }

    public class Bell extends Event {

        public Bell(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            addEvent(new Bell(delayTime));
        }

        @Override
        public String toString() {
            return "Bing!";
        }
    }

    public class Restart extends Event {
        private Event[] events;

        public Restart(long delayTime,Event[] events) {
            super(delayTime);
            this.events = events;
            for (Event event : events) {
                addEvent(event);
            }
        }

        @Override
        public void action() {
            for (Event event : events) {
                event.start();
                addEvent(event);
            }
            start();
            addEvent(this);
        }

        @Override
        public String toString() {
            return "Restart system";
        }
    }

}
