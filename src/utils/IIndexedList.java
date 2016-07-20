package utils;

/**
 * Interface for IndexedList, extends IList
 */

import Exceptions.IndexOutOfBoundsException;


public interface IIndexedList <T> extends IList<T> {

    /**
     *
     * @param element T
     * @param index int
     * @throws IndexOutOfBoundsException
     */
    void add (T element, int index) throws IndexOutOfBoundsException;

    /**
     *
     * @param element T
     * @param index int
     * @return T
     * @throws IndexOutOfBoundsException
     */
    T set(T element, int index) throws IndexOutOfBoundsException;

    /**
     *
     * @param index int
     * @return T
     * @throws IndexOutOfBoundsException
     */
    T get(int index) throws IndexOutOfBoundsException;

    /**
     *
     * @param index int
     * @return T
     * @throws IndexOutOfBoundsException
     */
    T remove(int index) throws IndexOutOfBoundsException;

    /**
     *
     * @param element T
     * @return int
     */
    int indexOf(T element);

    /**
     *
     * @param element T
     * @return boolean
     */
    boolean remove(T element);

    /**
     *
     * @param element T
     * @return boolean
     */
    boolean contains(T element);

}
