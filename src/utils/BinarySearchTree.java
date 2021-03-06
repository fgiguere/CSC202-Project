package utils;
import java.util.LinkedList;

import Exceptions.UnderflowException;

/**
 * Binary Search Tree
 */
public class BinarySearchTree<T extends Comparable<T>> implements IBST<T> {

    protected BSTNode<T> root; //reference to the root of this BinarySearchTree
    private boolean found; //used by remove

    protected LinkedListQueue<T> inOrderQueue;
    protected LinkedListQueue<T> preOrderQueue;
    protected LinkedListQueue<T> postOrderQueue;

    /**
     * @return boolean
     */
    @Override
    public boolean isEmpty() {
        return (root == null);
    }

    /**
     * @return int
     */
    @Override
    public int size() {
        return recSize(root);
    }

    /**
     * @param tree BSTNode
     * @return int
     */
    private int recSize(BSTNode<T> tree) {
        if (tree == null)
            return 0;
        else
            return recSize(tree.getLeft()) + recSize(tree.getRight()) + 1;
    }

    /**
     * @param element T
     * @return boolean
     */
    @Override
    public boolean contains(T element) {
        return recContains(element, root);
    }

    /**
     * @param element T
     * @param tree    BSTNode
     * @return boolean
     */
    private boolean recContains(T element, BSTNode<T> tree) {
        if (tree == null) {
            return false;
        } else if (element.compareTo(tree.getInfo()) < 0) {
            return recContains(element, tree.getLeft());
        } else if (element.compareTo(tree.getInfo()) > 0) {
            return recContains(element, tree.getRight());
        } else
            return true;
    }

    /**
     * @param element T
     * @return boolean
     */
    @Override
    public boolean remove(T element) {
        root = recRemove(element, root);
        return found;
    }

    /**
     * @param element T
     * @param tree    BSTNode
     * @return BSTNode
     */
    private BSTNode<T> recRemove(T element, BSTNode<T> tree) {
        if (tree == null) {
            found = false;
        } else if (element.compareTo(tree.getInfo()) < 0) {
            tree.setLeft(recRemove(element, tree.getLeft()));
        } else if (element.compareTo(tree.getInfo()) > 0) {
            tree.setRight(recRemove(element, tree.getRight()));
        } else {
            tree = removeNode(tree);
            found = true;
        }
        return tree;
    }

    /**
     * @param tree BSTNode
     * @return BSTNode
     */
    private BSTNode<T> removeNode(BSTNode<T> tree) {
        T data;

        if (tree.getLeft() == null) {
            return tree.getRight();
        } else if (tree.getRight() == null) {
            return tree.getLeft();
        } else {
            data = getPredecessor(tree.getLeft());
            tree.setInfo(data);
            tree.setLeft(recRemove(data, tree.getLeft()));
        }
        return tree;
    }

    private T getPredecessor(BSTNode<T> tree) {
        while (tree.getRight() != null) {
            tree = tree.getRight();
        }
        return tree.getInfo();
    }


    /**
     * @param element T
     * @return T
     */
    @Override
    public T get(T element) {

        return recGet(element, root);
    }

    /**
     * @param element T
     * @param tree    BSTNode
     * @return T
     */
    private T recGet(T element, BSTNode<T> tree) {
        if (tree == null) {
            return null;
        } else if (element.compareTo(tree.getInfo()) < 0) {
            return recGet(element, tree.getRight());
        } else if (element.compareTo(tree.getInfo()) > 0) {
            return recGet(element, tree.getRight());
        } else {
            return tree.getInfo();
        }
    }

    /**
     * @param element T
     */
    @Override
    public void add(T element) {
        root = recAdd(element, root);
    }

    /**
     * @param
     * @return int
     */


    /**
     * @param element T
     * @param tree BSTNode
     * @return BSTNode
     */
    private BSTNode<T> recAdd(T element, BSTNode<T> tree) {
        if (tree == null) {
            tree = new BSTNode<T>(element);
        } else if (element.compareTo(tree.getInfo()) <= 0) {
            tree.setLeft(recAdd(element, tree.getLeft()));
        } else {
            tree.setRight(recAdd(element, tree.getRight()));
        }
        return tree;
    }

    /**
     * @param orderType int
     * @return int
     */
    @Override
    public int reset(int orderType) {

        int numNodes = size();

        if (orderType == INORDER) {
            inOrderQueue = new LinkedListQueue<T>();
            inOrder(root);
        } else if (orderType == PREORDER) {
            preOrderQueue = new LinkedListQueue<T>();
            preOrder(root);
        }
        if (orderType == POSTORDER) {
            postOrderQueue = new LinkedListQueue<T>();
            postOrder(root);
        }
        return numNodes;
    }

    /**
     * @param orderType int
     * @return int
     */
    @Override
    public T getNext(int orderType) {
        if (isEmpty()) {
            return null;
        }
        if (orderType == INORDER) {
            try {
                return (T) inOrderQueue.dequeue().getElement();
            } catch (UnderflowException e) {
                e.printStackTrace();
            }
        }

        else if (orderType == PREORDER) {
            try {
                return (T) preOrderQueue.dequeue().getElement();
            } catch (UnderflowException e) {
                e.printStackTrace();
            }
        }

        else if (orderType == POSTORDER) {
            try {
                return (T) postOrderQueue.dequeue().getElement();
            } catch (UnderflowException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    private void inOrder(BSTNode<T> tree) {
        if (tree != null) {

            inOrder(tree.getLeft());
            LinkedListNode newNode = new LinkedListNode(tree.getInfo());
            inOrderQueue.enqueue(newNode);
            inOrder(tree.getRight());
        }
    }
    private void preOrder(BSTNode<T> tree) {
        if(tree != null) {
            LinkedListNode newNode = new LinkedListNode(tree.getInfo());
            preOrderQueue.enqueue(newNode);
            preOrder(tree.getLeft());
            preOrder(tree.getRight());
        }
    }
    private void postOrder(BSTNode<T> tree) {
        if(tree != null) {
            postOrder(tree.getLeft());
            postOrder(tree.getRight());
            LinkedListNode newNode = new LinkedListNode(tree.getInfo());
            postOrderQueue.enqueue(newNode);

        }
    }
}


