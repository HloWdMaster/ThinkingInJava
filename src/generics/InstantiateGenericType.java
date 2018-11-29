package generics;

/**
 * Create by leonardo on 2018/11/28
 */
public class InstantiateGenericType {
    public static void main(String[] args) {
        ClassAsFactory<Employee> fe = new ClassAsFactory<>(Employee.class);
        System.out.println("ClassAsFactory<Employee> succeeded");
        try {
            ClassAsFactory<Integer> fi = new ClassAsFactory<>(Integer.class);
        } catch (Exception e) {
            System.out.println("ClassAsFactory<Integer> failed");
        }
    }
}


class ClassAsFactory<T> {
    T x;
    public ClassAsFactory(Class<T> type) {
        try {
            x = type.newInstance();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}

class Employee { }

