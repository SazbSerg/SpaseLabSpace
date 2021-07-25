package BehavioralPatterns.Iterator;

public class ConcreteAggregate implements Aggregate{
    String[] tasks = {"Посадить дерево", "Постороить дом", "Вырастить сына"};

    @Override
    public Iterator getIterator() {
        return null;
    }
    private class TaskIterator implements Iterator{
        int index = o;

        @Override
        public Boolean hasNext() {
            if(index< tasks.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return tasks[index++];
        }
    }

}
