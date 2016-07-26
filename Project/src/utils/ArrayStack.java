package utils;

import Exceptions.OverflowException;
import Exceptions.UnderflowException;

/**
 * Implements IArrayStack and uses an array to hold the elements in the stack.
 *The first constructor creates a default array size.
 *The second constructor allows the user to select the size of the array.
*/

public class ArrayStack<T> implements IArrayStack<T> {
    int defaultCap = 100; //default capacity of stack, if not specified
    T[] stack;  //holds stack elements
    int topIndex = -1; //index of top element in stack

    public ArrayStack() {
        stack = (T[]) new Object[defaultCap];
    }

    public ArrayStack(int size) {
        stack = (T[]) new Object[size];
    }

    /**
     *
     * @return boolean
     */
    @Override
    public boolean isFull()
    {
        if(topIndex == stack.length - 1) {
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
    public void push(T element) throws OverflowException
    {
        if(!isFull()) {
            topIndex++;
            stack[topIndex] = element;
            return;
        }
        throw new OverflowException("Stack is full.");
    }

    /**
     *
     * @return T
     * @throws UnderflowException
     */
    @Override
    public T top() throws UnderflowException
    {
        if(!isEmpty()) {
            return stack[topIndex];
        }
        throw new UnderflowException("Stack is empty.");
    }

    /**
     *
     * @return T
     * @throws UnderflowException
     */
    @Override
    public T pop() throws UnderflowException
    {
        if(!isEmpty()) {
            T pop = stack[topIndex];
            stack[topIndex] = null;
            topIndex--;
            return pop;
        }
        throw new UnderflowException("Stack is empty.");
    }

    /**
     *
     * @return boolean
     */
    @Override
    public boolean isEmpty()
    {
        if (topIndex == -1) {
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
        return topIndex + 1;
    }

    /**
     *
     * @return String
     */
    @Override
    public String toString()
    //Returns readable list of objects in the stack.
    {
        String list = "";
        int index = 0;
        if(!isEmpty()) {
            while (index < topIndex + 1) {
                list += stack[index].toString() + "\n";
                index++;
            }
            return list;
        }
        return "Stack is empty.";

    }
}
