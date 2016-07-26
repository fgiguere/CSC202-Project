package utils;

import Exceptions.OverflowException;
import Exceptions.UnderflowException;

/**
 * Implements IArrayQueue and uses an Array to hold the elements in a stack.
 *The first constructor creates a default array size.
 *The second constructor allows the user to select the size of the array.
 */
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

    /**
     *
     * @return boolean
     */
    @Override
    public boolean isFull()
    {
        if (lastIndex == queue.length - 1) {
            return true;
        }
        return false;
    }

    /**
     *
     * @param element T
     * @throws OverflowException
     */
    @Override
    public void enqueue(T element) throws OverflowException
    {
        if(!isFull()) {
            lastIndex++;
            queue[lastIndex] = element;
            return;
        }
        throw new OverflowException("Queue is full.");
    }

    /**
     *
     * @return boolean
     */
    @Override
    public boolean isEmpty()
    {
        if (lastIndex == -1) {
            return true;
        }
        return false;
    }

    /**
     *
     * @return int
     */
    @Override
    public int size()
    {
        return lastIndex + 1;
    }

    /**
     *
     * @return T
     * @throws UnderflowException
     */
    @Override
    public T dequeue() throws UnderflowException
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

    /**
     *
     * @return String
     */
    @Override
    public String toString()
    {
        String list = "";
        int index = 0;
        if(!isEmpty()) {
            while (index < lastIndex+1) {
                list += queue[index].toString() + "\n";
                index++;
            }
            return list;
        }
        return "Queue is empty.";

    }
}
