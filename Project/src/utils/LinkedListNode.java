package utils;
import java.io.Serializable;
import model.*;

/**
 * LinkedListNode
 */
public class LinkedListNode <T> implements Serializable {
    private T element;
    LinkedListNode pointer;

    /**
     *
     * @param element T
     */
    public LinkedListNode (T element)  {
        this.element = element;
        this.pointer = null;
    }

    /**
     *
     * @param element T
     * @param pointer
     */
    public LinkedListNode(T element, LinkedListNode pointer)  {
        this.element = element;
        this.pointer = pointer;
    }

    /**
     *
     * @return T
     */
    public T getElement()  { return element; }

    /**
     *
     * @param element T
     */
    public void setElement(T element) {
        this.element = element;
    }

    /**
     *
     * @return pointer
     */
    public LinkedListNode getPointer()  {
        return pointer;
    }

    /**
     *
     * @param pointer
     */
    public void setPointer(LinkedListNode pointer) {
        this.pointer = pointer;
    }

}
