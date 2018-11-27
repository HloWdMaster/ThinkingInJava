package resuing;

/**
 * Create by leonardo on 2018/11/7
 */
public class CacheUtil {
    public static void main(String[] args) {
        Cache.get();
    }
}

class Cache {
    static {
        System.out.println("Cache static ");
    }

    public Cache() {
        System.out.println("Cache() {}");
    }

    public static void get() {
        System.out.println("cache.get()");
    }
}