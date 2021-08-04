package BehavioralPatterns.Iterator;

public class IteratorApp {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Iterator iterator = toDoList.getIterator();

        toDoList.add("Первое задание");
        toDoList.add("Второе задание");
        toDoList.add("Третье задание");
        toDoList.add("Четвёртое задание");
        toDoList.add("Пятое задание");
        System.out.println(toDoList);
        System.out.println();

        System.out.println(iterator.getElement(4));
        System.out.println(iterator.getElement(3));
        System.out.println(iterator.getElement(2));
        System.out.println(iterator.getElement(1));
        System.out.println(iterator.getElement(0));
        System.out.println();

        while (iterator.hasNext()){
           System.out.println(iterator.next());
        }

        //toDoList.tasks.remove(2);
       // System.out.println(toDoList.tasks);
        System.out.println();

        Iterator iterator1 = toDoList.getIterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
       }
    }
}
