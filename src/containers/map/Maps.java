package containers.map;

import util.CountingMapData;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Create by leonardo on 2018/12/3
 */
public class Maps {
    public static void printKeys(Map<Integer, String> map) {
        System.out.println(" Size = " + map.size() + ",");
        System.out.print("keys: ");
        System.out.println(map.keySet());
    }

    public static void test(Map<Integer, String> map) {
        System.out.print(map.getClass().getSimpleName());
        map.putAll(new CountingMapData(25));
        map.putAll(new CountingMapData(25));
        printKeys(map);
        System.out.print("Values:");
        System.out.println(map.values());
        System.out.println(map);
        System.out.println("map.containsKey(11): " + map.containsKey(11));
        System.out.println(map.get(11));
        System.out.println("map.containsValue(\"F0\"): "+map.containsValue("F0"));
        Integer key = map.keySet().iterator().next();
        System.out.println("First key in map: "+key);

        map.remove(key);
        printKeys(map);
        map.clear();
        System.out.println("after clear map is empty: "+map.isEmpty());
        map.putAll(new CountingMapData(25));
        map.keySet().removeAll(map.keySet());
        System.out.print("after removeAll() map is empty: "+map.isEmpty());
        System.out.println();
        System.out.println("=========end===========");
    }

    public static void main(String[] args) {
        test(new HashMap<Integer, String>());
        test(new TreeMap<Integer, String>());
        test(new LinkedHashMap<Integer, String>());
        test(new IdentityHashMap<Integer, String>());
        test(new ConcurrentHashMap<Integer, String>());
        test(new WeakHashMap<Integer, String>());



    }

}
