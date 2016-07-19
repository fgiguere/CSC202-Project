package utils;

import Exceptions.UnderflowException;

import java.io.Serializable;

import model.User;

/**
 * Created by faith on 7/6/16.
 */
public class LinkedListQueue <T> implements ILinkedListQueue <LinkedListNode>, Serializable  {
    LinkedListNode <T> head;
    LinkedListNode <T> tail;

    public LinkedListNode getHead() { return head; }

    @Override
    public void enqueue(LinkedListNode newNode) {
        if(isEmpty()) {
            head = newNode; //If queue is empty, set the head to the new node
        }
        else if (size() == 1){ //If there is only one item in the queue, set newNode as the tail and point the head to it
            tail = newNode;
            head.setPointer(tail);
        }
        else {
            tail.setPointer(newNode); //Otherwise point the old tail to the new node as set newNode as new tail
            tail = newNode;
        }
    }

    @Override
    public LinkedListNode dequeue() throws UnderflowException {
        if (isEmpty()) {
            throw new UnderflowException("Cannot dequeue, queue is empty.");
        }

        LinkedListNode oldHead = head;
        head = head.getPointer();

        return oldHead;
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
        if (isEmpty()) { //If empty, return size as 0
            return 0;
        }

        int count = 1; //If is not empty, size starts as 1
        LinkedListNode curNode = head; //Set a temp node for the loop as the top

        while(curNode != null) {
            curNode = curNode.getPointer(); //Set the temp node as the next node
            //If the new temp node is not null, add 1 to count
            if(curNode != null) count++;
        }
        return count; //return the total count after while loop
    }

    @Override
    public String toString() {
        LinkedListNode <T> current = this.head;

        String list = "";
        while (current != null) {
            list += current.getElement().toString() + "\t";
            current = current.getPointer();
        }
        return list;
    }
}
