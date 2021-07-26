package BehavioralPatterns.Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToDoList implements Aggregate{
    ArrayList<String> tasks = new ArrayList<>();

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
