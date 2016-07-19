package utils;
import model.User;

/**
 * Created by faith on 7/17/16.
 */

public class LinkedListOrderedList implements IList <User> {

    LinkedListNode <User> head = null;
    LinkedListNode <User> curNode = null;

    @Override
    public void add(User newUser) {
        reset();
        LinkedListNode <User> newNode = new LinkedListNode(newUser);

        if(isEmpty()) {
            this.head = newNode;
            return;
        }

        if(head.getElement().compareTo(newUser) < 0) {
            newNode.setPointer(head);
            head = newNode;
            return;
        }

        if (curNode.getElement().compareTo(newUser) < 0) {
            newNode.setPointer(curNode);
            curNode.setPointer(newNode);
            return;
        }

        LinkedListNode <User> prevNode = curNode;
        curNode = curNode.getPointer();

        while (curNode != null) {
            if (curNode.getElement().compareTo(newUser) < 0) {
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

    @Override
    public boolean remove(String userName) {
        reset();

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

    @Override
    public boolean contains(String userName) {

        if(get(userName) != null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        reset();

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
        reset();
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
        this.curNode = this.head;
    }

    @Override
    public User getNext() {
        curNode = curNode.getPointer();
        return curNode.getElement();
    }

    @Override
    public String toString() {
        reset();

        String list = "";
        while (curNode != null) {
            list += curNode.getElement().toString() + "\n";
            curNode = curNode.getPointer();
        }
        return list;
    }
}