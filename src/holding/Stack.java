package holding;

import java.util.LinkedList;

public class Stack<T> {

    private LinkedList<T> storage = new LinkedList<T>();

    public void push(T v) { //入栈
        storage.addFirst(v);
    }

    public T peek() {   //取栈顶元素
        return storage.getFirst();
    }

    public T pop() {    //出栈
        return storage.removeFirst();
    }

    public boolean isEmpty() {  //栈是否为空
        return storage.isEmpty();
    }

    @Override
    public String toString() {
        return storage.toString();
    }
}
