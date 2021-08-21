package Collections.Practice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListPractice {
    public static void main(String[] args) {
        List <String> list = new LinkedList<>();

        System.out.println("Добавление list.element1 в list");
        list.add("list.element1");
        System.out.println(list);
        System.out.println();

        System.out.println("Добавление list.element2 в list по индексу");
        list.add(1,"list.element2");
        System.out.println(list);
        System.out.println();

        System.out.println("Определение хэшкода коллекции");
        System.out.println(list.hashCode());
        System.out.println();

        System.out.println("Удаление list.element2 из list по индексу");
        list.remove(1);
        System.out.println(list);
        System.out.println();

        System.out.println("Определение размера list");
        System.out.println(list.size());
        System.out.println();

        System.out.println("Удаление list.element1 из list по наименованию объекта");
        list.remove("list.element1");
        System.out.println(list);
        System.out.println();

        System.out.println("Определение хэшкода коллекции");
        System.out.println(list.hashCode());
        System.out.println();

        System.out.println("Проверка на то, пустая ли данная коллекция");
        System.out.println(list.isEmpty());
        System.out.println();

        List <String> list1 = new LinkedList<>();

        list1.add("list1.element1");
        list1.add("list1.element2");
        list1.add("list1.element3");
        System.out.println("Добавление всех элементов новой коллекции list1 в коллекцию list");
        list.addAll(list1);
        System.out.println(list);

        System.out.println("Определение хэшкода коллекции");
        System.out.println(list.hashCode());
        System.out.println();

        System.out.println("Удаление всех элементов колекции list");
        list.removeAll(list);
        System.out.println(list);
        System.out.println();

        System.out.println("Определение хэшкода коллекции");
        System.out.println(list.hashCode());
        System.out.println();

        System.out.println("Добавление всех элементов коллекции list1 в коллекцию list");
        list.addAll(list1);
        System.out.println(list);
        System.out.println();

        System.out.println("Поиск элемента list1.element3 в коллекции");
        System.out.println(list.contains("list1.element3"));
        System.out.println();

        System.out.println("Поиск элемента по индексу");
        System.out.println(list.get(1));
        System.out.println();

        System.out.println("Определение хэшкодов коллекций list и list1");
        System.out.println(list.hashCode());
        System.out.println(list1.hashCode());
        System.out.println();

        System.out.println("Сравнение list и list1 на эквивалентность");
        System.out.println(list.equals(list1));
        System.out.println();

        System.out.println("Определение индекса заданного элемента по наименованию");
        System.out.println(list.indexOf("list1.element3"));
        System.out.println();

        System.out.println("Очистка коллекции");
        list.clear();
        System.out.println(list);
        System.out.println();

        System.out.println("Добавление всех элементов коллекции list1 в коллекцию list");
        list.addAll(list1);
        System.out.println(list);
        System.out.println();

        System.out.println("Возврат индекса последнего вхождения объекта list1.element3 в список");
        System.out.println(list.lastIndexOf("list1.element3"));
        System.out.println();

        System.out.println("Добавление в нулевую ячейку нового элемента");
        list.add(0, "Спонтанный элемент");
        System.out.println(list);
        System.out.println();

        System.out.println("Возврат индекса последнего вхождения объекта list1.element3 в список");
        System.out.println(list.lastIndexOf("list1.element3"));
        System.out.println();

        System.out.println("Возврат индекса первого вхождения объекта list1.element3 в список");
        System.out.println(list.indexOf("list1.element3"));
        System.out.println();

        System.out.println("Присваивание нового значения ячейке 0");
        list.set(0, "уже не спонтанный элемент");
        System.out.println(list);
        System.out.println();

        ListIterator<String> listIterator = list.listIterator();
        System.out.println(listIterator.next());
        System.out.println(listIterator.next());
        System.out.println(listIterator.next());
        System.out.println(listIterator.next());
        System.out.println();
       // Iterator<String> iterator = list.iterator();
       // iterator.notify(); //wait(): освобождает монитор и переводит вызывающий поток в состояние ожидания до тех пор,
        // пока другой поток не вызовет метод notify()
        for (String elem: list){
            System.out.println(elem);
        }










    }
}
