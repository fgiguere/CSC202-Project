package utils;

import Exceptions.OverflowException;
import Exceptions.UnderflowException;

//Implements IArrayQueue and uses an Array to hold the elements in a stack.
//The first constructor creates a default array size.
//The second constructor allows the user to select the size of the array.

public class ArrayQueue<T>  implements IArrayQueue<T>  {

    int defaultCap = 100; //default capacity of queue, if not specified
    T[] queue; //holds queue elements
    int lastIndex = -1; //index of top element in stack

    public ArrayQueue () {
        queue = (T[] ) new Object [defaultCap];
    }

    public ArrayQueue (int size) {
        queue = (T[]) new Object[size];
    }

    @Override
    public boolean isFull()
    //Returns true if queue is full, otherwise returns false.
    {
        if (lastIndex == queue.length - 1) {
            return true;
        }
        return false;
    }

    @Override
    public void enqueue(T element) throws OverflowException
    //If queue is full, throws OverflowException.
    //Otherwise adds element to back of the queue.
    {
        if(!isFull()) {
            lastIndex++;
            queue[lastIndex] = element;
            return;
        }
        throw new OverflowException("Queue is full.");
    }

    @Override
    public boolean isEmpty()
    //Returns true if queue is empty, otherwise returns false.
    {
        if (lastIndex == -1) {
            return true;
        }
        return false;
    }

    @Override
    public int size()
    //Returns size of queue.
    {
        return lastIndex + 1;
    }

    @Override
    public T dequeue() throws UnderflowException
    //If queue is empty, throws UnderflowException.
    //Otherwise removes element from front of queue.
    {
        if(!isEmpty()) {
            T deq = queue[0];
            int index = 0;

            while (index < lastIndex) {
                queue[index] = queue[index+1];
                index++;
            }
            queue[index] = null;
            return deq;
        }
        throw new UnderflowException("Queue is empty.");
    }

    @Override
    public String toString()
    //Returns readable list of objects in the stack.
    {
        String list = "";
        int index = 0;
        if(!isEmpty()) {
            while (index < lastIndex) {
                list += queue[index].toString() + "\n";
                index++;
            }
            return list;
        }
        return "Queue is empty.";

    }
}
