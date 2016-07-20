package utils;

import Exceptions.UnderflowException;

/**
 * Interface for Stack
 */
public interface IStack<T> {

    /**
     *
     * @return T
     * @throws UnderflowException
     */
    T top() throws UnderflowException;

    /**
     *
     * @return T
     * @throws UnderflowException
     */
    T pop() throws UnderflowException;

    /**
     *
     * @return boolean
     */
    boolean isEmpty();

    /**
     *
     * @return int
     */
    int size();

    /**
     *
     * @return String
     */
    String toString();
}
