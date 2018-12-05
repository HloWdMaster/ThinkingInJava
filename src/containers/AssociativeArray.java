package containers;

/**
 * Create by leonardo on 2018/12/3
 */
public class AssociativeArray<K, V> {
    private Object[][] pairs;
    private int index;

    public AssociativeArray(int length) {
        pairs = new Object[length][2];
    }

    public void put(K k, V v) {
        if (index >= pairs.length) {
            throw new IndexOutOfBoundsException();
        }
        pairs[index++] = new Object[]{k, v};
    }

    public V get(K k) {
        for (int i = 0; i < pairs.length; i++) {
            if (pairs[i][0].equals(k))
                return (V) pairs[i][1];
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < index; i++) {
            sb.append(pairs[i][0].toString());
            sb.append(":");
            sb.append(pairs[i][1].toString());
            if (i < index - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        AssociativeArray<String, String> map = new AssociativeArray<>(6);
        map.put("sky", "blue");
        map.put("glass", "green");
        map.put("ocean", "dancing");
        map.put("tree", "tall");
        map.put("earth", "brown");
        map.put("sun", "warm");

        System.out.println(map);
        System.out.println(map.get("ocean"));
    }
}
