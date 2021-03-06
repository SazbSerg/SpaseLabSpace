package BehavioralPatterns.Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToDoList implements Aggregate{
    private ArrayList<String> tasks = new ArrayList<>();

    public void add(String task){
        tasks.add(task);

    }

    @Override
    public String toString() {
        return "ToDoList{" +
                "tasks=" + tasks +
                '}';
    }

    @Override
    public Iterator getIterator() {
        return new TaskIterator();
    }

    private class TaskIterator implements Iterator {
        int index = 0;

        @Override
        public Boolean hasNext() {
            if (index < tasks.size()) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return tasks.get(index++);
        }

        @Override
        public Object getElement(int index) {
            return tasks.get(index);
        }


    }
}
