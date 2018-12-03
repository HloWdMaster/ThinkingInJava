package containers.map.hashcode;

import util.Countries;

import java.util.*;

/**
 * Create by leonardo on 2018/12/3
 */
public class SlowMap<K, V> extends AbstractMap<K, V> {
    private List<K> keys = new ArrayList<K>();
    private List<V> values = new ArrayList<V>();

    public V put(K key, V value) {
        V oldV = get(key);
        if (!keys.contains(key)) {
            keys.add(key);
            values.add(value);
        }
        values.set(keys.indexOf(key), value);
        return oldV;
    }

    public V get(Object key) {
        if (!keys.contains(key)) {
            return null;
        }
        return values.get(keys.indexOf(key));
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = new HashSet<>();
        Iterator<K> kit = keys.iterator();
        Iterator<V> vit = values.iterator();
        while (kit.hasNext())
            set.add(new MapEntry<K, V>(kit.next(), vit.next()));
        return set;
    }

    public static void main(String[] args) {
        SlowMap<String, String> m = new SlowMap<>();
        m.putAll(Countries.capitals(15));
        System.out.println(m);
        System.out.println(m.get("EGYPT"));
        System.out.println(m.entrySet());
    }
    
}
