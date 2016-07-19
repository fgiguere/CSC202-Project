package utils;

import Exceptions.OverflowException;

/**
 * Created by faith on 7/6/16.
 */
public interface IArrayStack <T> extends IStack<T> {
    boolean isFull();
    void push(T element) throws OverflowException;
}
