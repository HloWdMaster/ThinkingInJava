package containers;

import java.util.PriorityQueue;

/**
 * Create by 163 on 2018/12/3
 */
public class ToDoList extends PriorityQueue<ToDoList.ToDoItem> {

    static class ToDoItem implements Comparable<ToDoItem> {
        private char primary;
        private int secondary;
        private String item;

        public ToDoItem(char primary, int secondary, String item) {
            this.primary = primary;
            this.secondary = secondary;
            this.item = item;
        }

        @Override
        public int compareTo(ToDoItem o) {
            if (primary > o.primary)
                return +1;
            if (primary == o.primary) {
                if (secondary > o.secondary) {
                    return +1;
                } else if (secondary == o.secondary) {
                    return 0;
                }
            }
            return -1;
        }

        public String toString() {
            return Character.toString(primary) + secondary + ":" + item;
        }
    }

    
    public void add(String td, char pri, int sec) {
        super.add(new ToDoItem(pri, sec, td));
    }

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        toDoList.add("Empty trash",'C',4);
        toDoList.add("Feed Dog",'A',2);
        toDoList.add("Feed Bird",'B',7);
        toDoList.add("Mow lawn",'A',1);
        toDoList.add("Feed Cat",'B',1);
        while (!toDoList.isEmpty()) {
            System.out.println(toDoList.remove());
        }

    }
}
