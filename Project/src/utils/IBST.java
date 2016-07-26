package utils;

/**
 * Binary Search Tree Interface
 */
public interface IBST<T extends Comparable<T>> {

    static final int INORDER = 1;
    static final int PREORDER = 2;
    static final int POSTORDER = 3;


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
     * @param element T
     * @return boolean
     */
    boolean contains (T element);

    /**]
     *
     * @param element T
     * @return boolean
     */
    boolean remove (T element);

    /**
     *
     * @param element T
     * @return T
     */
    T get (T element);

    /**
     *
     * @param element T
     */
    void add (T element);

    /**
     *
     * @param orderType int
     * @return int
     */
    int reset(int orderType);

    /**
     *
     * @param orderType int
     * @return int
     */
    T getNext(int orderType);

    /**
     *
     * @return String
     */
    String toString();

}
