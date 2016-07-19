package utils;

import Exceptions.UnderflowException;

import java.io.Serializable;


/**
 * Created by faith on 7/6/16.
 */

public class LinkedListStack <T> implements ILinkedListStack <LinkedListNode>, Serializable {
    LinkedListNode top;

    @Override
    public LinkedListNode top() throws UnderflowException {
        if (isEmpty()) {
            throw new UnderflowException("Cannot top an empty stack.");
        }
        return top;
    }


    @Override
    public LinkedListNode pop() throws UnderflowException {
        if (isEmpty()) {
            throw new UnderflowException("Cannot pop, stack is empty.");
        }

        LinkedListNode oldTop = top; //Set temp var to store old top before reassigning
        top = top.getPointer(); //Set new top to next node
        return oldTop;
    }

    @Override
    public void push(LinkedListNode newNode) {
        newNode.setPointer(top); //Set pointer of new node to the current top of stack
        top = newNode; //Set the new top of stack to the new node
    }

    @Override
    public boolean isEmpty() {
        if (top == null) { //If there is no node set to the top, then the stack is empty
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int size() {
        if (isEmpty()) { //If empty, return size as 0
            return 0;
        }

        int count = 1; //If is not empty, size starts as 1
        LinkedListNode curNode = top; //Set a temp node for the loop as the top

        while (curNode != null) {
            curNode = curNode.getPointer(); //Set the temp node as the next node
            if (curNode != null) { //If the new temp node is not null, add 1 to count
                count++;
            }
        }
        return count; //return the total count after while loop
    }

    public String toString() {
        LinkedListNode<T> current = null;
        try {
            current = top();
        } catch (UnderflowException e) {
            e.printStackTrace();
        }
        String list = "";
        while (current != null) {
            list += current.getElement().toString() + "\t";
            current = current.getPointer();
        }
        return list;
    }

}