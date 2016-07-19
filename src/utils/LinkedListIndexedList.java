package utils;

import Exceptions.IndexOutOfBoundsException;

/**
 * Created by faith on 7/11/16.
 */

public class LinkedListIndexedList<T> /*implements IIndexedList<T> */{ /*
    LinkedListNode <T> head = null;
    LinkedListNode <T> tail = null;
    LinkedListNode <T> curNode = null;

    @Override
    public void add(T element, int index) throws IndexOutOfBoundsException {
        reset();
        for(int i = 0; i < index; i++) {
            getNext();
            if(curNode == null) {
                throw new IndexOutOfBoundsException("Unable to remove, index out of bounds.");
            }
        }
        LinkedListNode <T> newNode = new LinkedListNode<T>(element);

        newNode.setPointer(curNode.getPointer());
        curNode.setPointer(newNode);
    }

    @Override
    public T set(T element, int index) throws IndexOutOfBoundsException {
        reset();
        for(int i = 0; i < index; i++) {
            getNext();
            if(curNode == null) {
                throw new IndexOutOfBoundsException("Unable to remove, index out of bounds.");
            }
        }
        LinkedListNode <T> newNode = new LinkedListNode<T>(element);

        newNode.setPointer(curNode.getPointer().getPointer());
        curNode.setPointer(newNode);
        return element;
    }

    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        reset();
        for(int i = 0; i < index; i++) {
            getNext();
            if(curNode == null) {
                throw new IndexOutOfBoundsException("Unable to remove, index out of bounds.");
            }
        }
        return (T) curNode.getPointer().getElement();
    }

    @Override
    public T remove(int index) throws IndexOutOfBoundsException {
        reset();
        for(int i = 0; i < index; i++) {
            getNext();
            if(curNode == null) {
                throw new IndexOutOfBoundsException("Unable to remove, index out of bounds.");
            }
        }
        T removed = (T) curNode.getPointer().getElement();
        curNode.setPointer(curNode.getPointer().getPointer());

        return removed;

    }

    @Override
    public int indexOf(T element) {
        reset();
        int index = 0;
        while(curNode != null) {
            if(getNext() == element) {
                return index;
            }
        }
        return -1;
    }

    @Override
    public void add(T element) {

    }

    @Override
    public T remove(T element) {
        return null;
    }

    @Override
    public boolean contains(T element) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        if(head == null) {
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void reset() {
        curNode = head;
    }

    @Override
    public T getNext() {
        curNode = curNode.getPointer();
        return curNode.getElement();
    } */
}
