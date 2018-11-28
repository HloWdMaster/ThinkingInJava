package generics;

import java.lang.reflect.Method;
import java.util.*;

/**
 * Create by leonardo on 2018/11/28
 */
public class ContainerMethodDifferences {
    static Set<String> methodSet(Class<?> type) {
        Set<String> result = new TreeSet<>();
        for (Method method : type.getMethods()) {
            result.add(method.getName());
        }
        return result;
    }

    static void interfaces(Class<?> type) {
        System.out.println("interfaces in " + type.getSimpleName()+"==========");
        List<String> result = new ArrayList<>();
        for (Class<?> c : type.getInterfaces()) {
            result.add(c.getSimpleName());
        }
        System.out.println(result);
        System.out.println();
    }

    static Set<String> object = methodSet(Object.class);

    static {
        object.add("clone");
    }

    static void differences(Class<?> superSet, Class<?> subSet) {
        System.out.println(superSet.getSimpleName() + " extends " + subSet.getSimpleName() + ",adds ++++++");
        Set<String> comp = Sets.difference(methodSet(superSet), methodSet(subSet));
        comp.removeAll(object);
        System.out.println(comp);
        interfaces(superSet);

    }

    public static void main(String[] args) {
        System.out.println("Collection: "+methodSet(Collection.class));
        interfaces(Collection.class);
        differences(Set.class,Collection.class);
        differences(HashSet.class,Set.class);
        differences(LinkedHashSet.class,HashSet.class);

        differences(List.class,Collection.class);
        differences(ArrayList.class,List.class);
        differences(LinkedList.class,List.class);
        differences(Queue.class,Collection.class);

        System.out.println("Map: "+methodSet(Map.class));
        differences(HashMap.class,Map.class);
        differences(LinkedHashMap.class,HashMap.class);
        differences(SortedMap.class,Map.class);
        differences(TreeMap.class,Map.class);

    }
}
