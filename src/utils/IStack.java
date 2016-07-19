package utils;

import Exceptions.UnderflowException;

/**
 * Created by faith on 7/6/16.
 */
public interface IStack<T> {
    T top() throws UnderflowException;
    T pop() throws UnderflowException;
    boolean isEmpty();
    int size();
    String toString();
}
