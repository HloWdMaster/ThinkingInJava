package generics.ex;

import java.util.Map;

/**
 * Create by 163 on 2018/11/29
 */

class Building {

}

class House extends Building {

}
public class ClassTypeCapture21<T> {
    Class<?> kind;
    Map<String, Class<?>> map;

    public ClassTypeCapture21(Class<?> kind) {
        this.kind = kind;
    }

    public ClassTypeCapture21(Class<?> kind, Map<String, Class<?>> map) {
        this.kind = kind;
        this.map = map;
    }

    public void addType(String typeName,Class<?> kind) {
        map.put(typeName,kind);
    }

    boolean f(Object arg) {
        return kind.isInstance(arg);
    }

    public Object createNew(String typeName) throws IllegalAccessException, InstantiationException {
        if (map.containsKey(typeName)) {
            return map.get(typeName).newInstance();
        }
        System.out.println(typeName+" class not available");
        return null;
    }

    public static void main(String[] args) {
        ClassTypeCapture21<Building> ctt1 = new ClassTypeCapture21<>(Building.class);
        System.out.println(ctt1.f(new Building()));
    }
}
