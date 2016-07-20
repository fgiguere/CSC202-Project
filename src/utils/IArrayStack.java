package utils;

import Exceptions.OverflowException;

/**
 * Interface for ArrayStack, extends Stack
 */
public interface IArrayStack <T> extends IStack<T> {

    /**
     *
     * @return boolean
     */
    boolean isFull();

    /**
     *
     * @param element T
     * @throws OverflowException
     */
    void push(T element) throws OverflowException;
}
