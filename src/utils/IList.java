package utils;

/**
 * Created by faith on 7/11/16.
 */

public interface IList <T> {
    void add(T element);
    boolean remove(String userName);
    boolean contains(String userName);
    boolean isEmpty();
    int size();
    void reset();
    T getNext();
    String toString();
}