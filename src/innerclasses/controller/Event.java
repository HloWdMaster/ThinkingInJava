package innerclasses.controller;

/**
 * Create by leonardo on 2018/11/14
 */
public abstract class Event {

    private static int counter = 0;
    private int id = counter++;

    private long eventTime;
    protected final long delayTime;

    public Event(long delayTime) {
        this.delayTime = delayTime;
        start();
    }

    public void start() {
        eventTime = System.nanoTime() + delayTime;
    }

    public boolean ready() {
        return System.nanoTime() >= eventTime;
    }

    @Override
    public String toString() {
        return "Event " + id;
    }

    public abstract void action();

}
