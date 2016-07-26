package utils;

/**
 * Interface for List
 */

public interface IList <T> {

    /**
     *
     * @param element T
     */
    void add(T element);

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


    void reset();

    /**
     *
     * @return T
     */
    T getNext();

    /**
     *
     * @return String
     */
    String toString();
}