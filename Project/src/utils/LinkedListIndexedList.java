package utils;

import Exceptions.IndexOutOfBoundsException;

/**
 * LinkedListIndexedList
 */

public class LinkedListIndexedList<T> implements IIndexedList<T> {
    LinkedListNode <T> head = null;
    LinkedListNode <T> tail = null;
    LinkedListNode <T> currentNode = null;

    /**
     *
     * @param element T
     * @param index int
     * @throws IndexOutOfBoundsException
     */
   @Override
    public void add(T element, int index) throws IndexOutOfBoundsException {
        LinkedListNode <T> curNode = head;
        if(isEmpty()) {
            LinkedListNode <T> newNode = new LinkedListNode<T>(element);
            head = newNode;
        }
        for(int i = 0; i < index+1; i++) {
            if(curNode == null) {
                throw new IndexOutOfBoundsException("Unable to remove, index out of bounds.");
            }
            curNode = curNode.getPointer();
        }
        LinkedListNode <T> newNode = new LinkedListNode<T>(element);

        newNode.setPointer(curNode.getPointer());
        curNode.setPointer(newNode);
    }

    /**
     *
     * @param element T
     * @param index int
     * @return T
     * @throws IndexOutOfBoundsException
     */
   @Override
    public T set(T element, int index) throws IndexOutOfBoundsException {
       LinkedListNode <T> curNode = head;
        for(int i = 0; i < index; i++) {
            if(curNode == null) {
                throw new IndexOutOfBoundsException("Unable to remove, index out of bounds.");
            }
            curNode = curNode.getPointer();
        }
        LinkedListNode <T> newNode = new LinkedListNode<T>(element);

        newNode.setPointer(curNode.getPointer().getPointer());
        curNode.setPointer(newNode);
        return element;
    }

    /**
     *
     * @param index int
     * @return T
     * @throws IndexOutOfBoundsException
     */
   @Override
    public T get(int index) throws IndexOutOfBoundsException {
        LinkedListNode <T> curNode = head;
        for(int i = 0; i < index; i++) {
            curNode = curNode.getPointer();
            if(curNode == null) {
                throw new IndexOutOfBoundsException("Unable to remove, index out of bounds.");
            }
        }
        return (T) curNode.getPointer().getElement();
    }

    /**
     *
     * @param index int
     * @return T
     * @throws IndexOutOfBoundsException
     */
   @Override
    public T remove(int index) throws IndexOutOfBoundsException {
        LinkedListNode <T> curNode = head;
        for(int i = 0; i < index; i++) {
            curNode = curNode.getPointer();
            if(curNode == null) {
                throw new IndexOutOfBoundsException("Unable to remove, index out of bounds.");
            }
        }
        T removed = (T) curNode.getPointer().getElement();
        curNode.setPointer(curNode.getPointer().getPointer());

        return removed;

    }

    /**
     *
     * @param element T
     * @return int
     */
    @Override
    public int indexOf(T element) {
        LinkedListNode <T> curNode = head;
        int index = 0;
        while(curNode != null) {
            curNode = curNode.getPointer();
            if(curNode.getElement() == element) {
                return index;
            }
        }
        return -1;
    }

    /**
     *
     * @param element T
     */
    @Override
    public void add(T element) {
        LinkedListNode <T> curNode = head;

        if(isEmpty()) {
            LinkedListNode newNode = new LinkedListNode(element);
            head = newNode;
            return;
        }

        while(curNode.getPointer() != null) {
            curNode = curNode.getPointer();
        }

        LinkedListNode <T> newNode = new LinkedListNode<T>(element);

        curNode.setPointer(newNode);
    }

    /**
     *
     * @param element T
     * @return boolean
     */
   @Override
    public boolean remove(T element) {
       LinkedListNode <T> curNode = head;

       if(isEmpty()) {
           return false;
       }
       while(curNode.getPointer() != null) {
           if(curNode.getPointer().getElement().equals(element)) {
               curNode.setPointer(curNode.getPointer().getPointer());
               return true;
           }
           curNode = curNode.getPointer();
       }
        return false;
    }

    /**
     *
     * @param element T
     * @return boolean
     */
    @Override
    public boolean contains(T element) {
        LinkedListNode <T> curNode = head;

        if(isEmpty()) {
            return false;
        }

        while(curNode.getPointer() != null) {
            if(curNode.getElement().equals(element)) {
                return true;
            }
            curNode = curNode.getPointer();
        }
        return false;
    }

    /**
     *
     * @return boolean
     */
   @Override
    public boolean isEmpty() {
        if(head == null) {
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
       LinkedListNode <T> curNode = head;
       if(curNode == null) {
           return 0;
       }
       int size = 1;

       while(curNode.getPointer() != null) {
           size++;
           curNode = curNode.getPointer();
       }
       return size;
    }


    @Override
    public void reset() {
        currentNode = head;
    }

    /**
     *
     * @return T
     */
    @Override
    public T getNext() {
        currentNode = currentNode.getPointer();
        return currentNode.getElement();
    }
}
