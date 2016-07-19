package utils;

import Exceptions.OverflowException;
import Exceptions.UnderflowException;

/**
 * Created by faith on 7/6/16.
 */

public interface IQueue <T> {

    T dequeue () throws UnderflowException;
    boolean isEmpty();
    int size();
    String toString();
    void enqueue (T element) throws OverflowException;

}

