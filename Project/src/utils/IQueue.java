package utils;

import Exceptions.OverflowException;
import Exceptions.UnderflowException;

/**
 *Interface for Queue
 */

public interface IQueue <T> {

    /**
     *
     * @return T
     * @throws UnderflowException
     */
    T dequeue () throws UnderflowException;

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

    /**
     *
     * @param element T
     * @throws OverflowException
     */
    void enqueue (T element) throws OverflowException;

}

