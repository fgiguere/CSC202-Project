package utils;
import model.User;
import java.io.Serializable;

/**
 * LinkedListOrderedList
 */

public class LinkedListOrderedList implements IOrderedList, Serializable {

    LinkedListNode <User> head = null;
    LinkedListNode <User> currentNode = null;

    /**
     *
     * @param newUser User
     */
    @Override
    public void add(User newUser) {
        LinkedListNode <User> newNode = new LinkedListNode(newUser);

        if(isEmpty()) {
            this.head = newNode;
            return;
        }

        if(head.getElement().compareTo(newUser) > 0) {
            newNode.setPointer(head);
            head = newNode;
            return;
        }

        LinkedListNode <User> curNode = head;

        if (curNode.getElement().compareTo(newUser) > 0) {
            newNode.setPointer(curNode);
            curNode.setPointer(newNode);
            return;
        }

        LinkedListNode <User> prevNode = curNode;
        curNode = curNode.getPointer();

        while (curNode != null) {
            if (curNode.getElement().compareTo(newUser) > 0) {
                prevNode.setPointer(newNode);
                newNode.setPointer(curNode);
                return;
            }
            prevNode = curNode;
            curNode = curNode.getPointer();
        }

        prevNode.setPointer(newNode);
        return;
    }

    /**
     *
     * @param userName String
     * @return boolean
     */
    @Override
    public boolean remove(String userName) {
        LinkedListNode <User> curNode = head;

        if(isEmpty()) {
            return false;
        }

        if(head.getElement().getUserName().equals(userName)) {
            head.setPointer(head.getPointer());
            return true;
        }

        LinkedListNode <User> prevNode = curNode;
        curNode = curNode.getPointer();

        while (curNode != null) {
            if (curNode.getElement().getUserName().equals(userName)) {
                prevNode.setPointer(curNode.getPointer());
                return true;
            }
            prevNode = curNode;
            curNode = curNode.getPointer();
        }

        return false;
    }

    /**
     *
     * @param userName String
     * @return boolean
     */
    @Override
    public boolean contains(String userName) {

        if(get(userName) != null) {
            return true;
        }
        return false;
    }

    /**
     *
     * @return boolean
     */
    @Override
    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    /**
     *
     * @return int
     */
    @Override
    public int size() {
        LinkedListNode <User> curNode = head;

        if (isEmpty()) {
            return 0;
        }

        int size = 0;

        while(curNode != null) {
            size++;
            curNode = curNode.getPointer();
        }
        return size;
    }

    public User get(String userName) {
        LinkedListNode <User> curNode = head;

        if(isEmpty()) {
            return null;
        }

        if(head.getElement().getUserName().equals(userName)) {
            return head.getElement();
        }

        curNode = curNode.getPointer();

        while (curNode != null) {
            if (curNode.getElement().getUserName().equals(userName)) {
                return curNode.getElement();
            }
            curNode = curNode.getPointer();
        }

        return null;
    }

    @Override
    public void reset() {
        this.currentNode = this.head;
    }

    /**
     *
     * @return User
     */
    @Override
    public User getNext() {
        reset();
        currentNode = currentNode.getPointer();
        return currentNode.getElement();
    }

    /**
     *
     * @return String
     */
    @Override
    public String toString() {
        LinkedListNode <User> curNode = head;

        String list = "";
        while (curNode != null) {
            list += curNode.getElement().toString() + "\n";
            curNode = curNode.getPointer();
        }
        return list;
    }
}