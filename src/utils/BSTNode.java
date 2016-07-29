package utils;

/**
 * Binary Search Tree Node
 */
public class BSTNode<T extends Comparable<T>> {

    protected T info; //the info in a BinarySearchTree node
    protected BSTNode<T> left; //A link to the left child node
    protected BSTNode<T> right; //A link to the right child node

    /**
     *
     * @param info T
     */
    public BSTNode(T info) {
        this.info = info;
        left = null;
        right = null;
    }

    /**
     *
     * @param info T
     */
    public void setInfo (T info) {
        this.info = info;
    }

    /**
     *
     * @return T
     */
    public T getInfo() {
        return info;
    }

    /**
     *
     * @param link BSTNode
     */
    public void setLeft (BSTNode<T> link) {
        left = link;
    }

    /**
     *
     * @param link BSTNode
     */
    public void setRight(BSTNode<T> link) {
        right = link;
    }

    /**
     *
     * @return BSTNode
     */
    public BSTNode<T> getLeft() {
        return left;
    }

    /**
     *
     * @return BSTNode
     */
    public BSTNode<T> getRight() {
        return right;
    }
}
