package generics.ex;

import java.util.Map;

/**
 * Create by 163 on 2018/11/29
 */

class Building {

}

class House extends Building {

}
class ClassTypeCapture<T> {
    Class<?> kind;
    Map<String, Class<?>> map;

    public ClassTypeCapture(Class<?> kind) {
        this.kind = kind;
    }

    public ClassTypeCapture(Class<?> kind, Map<String, Class<?>> map) {
        this.kind = kind;
        this.map = map;
    }

    public void addType(String typeName,Class<?> kind) {
        map.put(typeName,kind);
    }

    public Object createNew(String typeName) throws IllegalAccessException, InstantiationException {
        if (map.containsKey(typeName)) {
            return map.get(typeName).newInstance();
        }
        System.out.println(typeName+" class not available");
        return null;
    }

    public static void main(String[] args) {
//        new ClassTypeCapture21<Building>(Building.class).var;
    }
}
