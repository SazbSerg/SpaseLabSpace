package Collections.Practice;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePractice {
    public static void main(String[] args) {
        Queue <QueueTest> queue = new ArrayDeque<>();
        QueueTest queueTest = new QueueTest();
        QueueTest queueTest1 = new QueueTest();
        QueueTest queueTest2 = new QueueTest();
        queue.add(queueTest);
        queue.add(queueTest1);
        queue.add(queueTest2);
        System.out.println("Вывод очереди в консоль");
        System.out.println(queue);
        System.out.println();
        System.out.println("Вывод хэшкода в консоль");
        System.out.println(queue.hashCode());
        System.out.println();
        System.out.println("Вывод верхнего элемента в консоль");
        System.out.println(queue.peek());
        System.out.println();
        System.out.println("Удаление верхнего элемента из очереди");
        queue.poll();
        System.out.println();
        System.out.println("Вывод очереди в консоль");
        System.out.println(queue);
        System.out.println();
        System.out.println("Вставка нового элемента в конец очереди и вывод очереди в консоль");
        queue.offer(new QueueTest());
        System.out.println(queue);
        System.out.println();

        Queue <Integer> queueOfInteger = new PriorityQueue<>();
        queueOfInteger.add(6);
        queueOfInteger.add(3);
        queueOfInteger.add(5);
        queueOfInteger.add(44);
        queueOfInteger.add(2);
        System.out.println(queueOfInteger);
        queueOfInteger.remove();
        System.out.println(queueOfInteger);
        queueOfInteger.remove();
        System.out.println(queueOfInteger);
        queueOfInteger.remove();
        System.out.println(queueOfInteger);


    }
}


class QueueTest {
}