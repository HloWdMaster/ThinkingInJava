package containers.map.hashcode;

import java.util.Map;

/**
 * Create by leonardo on 2018/12/3
 */
public class MapEntry<K, V> implements Map.Entry<K, V> {
    private K key;
    private V value;

    public MapEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public V setValue(V v) {
        V result = value;
        value = v;
        return result;
    }

    @Override
    public int hashCode() {
        return (key == null ? 0 : key.hashCode()) ^     //^ 按位异或 不同为1 相同置0
                (value == null ? 0 : value.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof MapEntry))
            return false;
        MapEntry me = (MapEntry) obj;
        return (key == null ? me.getKey() == null : key.equals(me.getKey()))
                && (value == null ? me.getValue() == null : value.equals(me.getValue()));
    }

    public String toString() {
        return key + "=" + value;
    }

}


