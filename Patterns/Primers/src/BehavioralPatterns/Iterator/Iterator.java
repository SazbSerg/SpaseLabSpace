package BehavioralPatterns.Iterator;

public interface Iterator {
    Boolean hasNext();
    Object next();
    Object getElement(int index);
}
