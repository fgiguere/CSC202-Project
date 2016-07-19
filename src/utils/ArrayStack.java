package utils;

import Exceptions.OverflowException;
import Exceptions.UnderflowException;

//Implements IArrayStack and uses an array to hold the elements in the stack.
//The first constructor creates a default array size.
//The second constructor allows the user to select the size of the array.


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

    @Override
    public boolean isFull()
    //Returns true if the stack is full, otherwise returns false.
    {
        if(topIndex == stack.length - 1) {
            return true;
        }
        return false;
    }

    @Override
    public void push(T element) throws OverflowException
    //If stack is full, throws OverflowException.
    //Otherwise puts element at the top of stack.
    {
        if(!isFull()) {
            topIndex++;
            stack[topIndex] = element;
            return;
        }
        throw new OverflowException("Stack is full.");
    }

    @Override
    public T top() throws UnderflowException
    //If stack is empty, throws UnderflowException.
    //Otherwise returns element on top of stack.
    {
        if(!isEmpty()) {
            return stack[topIndex];
        }
        throw new UnderflowException("Stack is empty.");
    }

    @Override
    public T pop() throws UnderflowException
    //If stack is empty, throws UnderflowException.
    //Otherwise removes top element of stack.
    {
        if(!isEmpty()) {
            T pop = stack[topIndex];
            stack[topIndex] = null;
            topIndex--;
            return pop;
        }
        throw new UnderflowException("Stack is empty.");
    }

    @Override
    public boolean isEmpty()
    //Returns true if the stack is empty, otherwise returns false.
    {
        if (topIndex == -1) {
            return true;
        }
        return false;
    }

    @Override
    public int size()
    //Returns size of stack.
    {
        return topIndex + 1;
    }

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
