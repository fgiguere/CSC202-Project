package utils;

/**
 * Interface for ArrayQueue, extends IQueue
 */
public interface IArrayQueue <T> extends IQueue <T> {

    /**
     *
     * @return boolean
     */
    boolean isFull();
}
