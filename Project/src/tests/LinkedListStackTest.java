package tests;

import org.junit.Assert;
import org.junit.Test;
import utils.LinkedListNode;
import utils.LinkedListStack;

import static org.junit.Assert.*;

//Tests LinkedListStack

public class LinkedListStackTest {

    @Test
    public void top() throws Exception
    //tests top
    {
        LinkedListStack stack = new LinkedListStack();

        LinkedListNode A = new LinkedListNode("Object 1");

        stack.push(A);

        Assert.assertEquals(A, stack.top());
    }

    @Test
    public void pop() throws Exception
    //tests pop
    {
        LinkedListStack stack = new LinkedListStack();

        LinkedListNode A = new LinkedListNode("Object 1");

        stack.push(A);

        Assert.assertEquals(A, stack.pop());
    }

    @Test
    public void push() throws Exception
    //tests push
    {
        LinkedListStack stack = new LinkedListStack();

        LinkedListNode A = new LinkedListNode("Object 1");
        LinkedListNode B = new LinkedListNode("Object 2");
        LinkedListNode C = new LinkedListNode("Object 3");

        stack.push(A);
        stack.push(B);
        stack.push(C);

        Assert.assertEquals(C, stack.top());
    }

    @Test
    public void isEmpty() throws Exception
    //tests isEmpty
    {
        LinkedListStack stack = new LinkedListStack();

        Assert.assertTrue(stack.isEmpty());

        LinkedListNode A = new LinkedListNode("Object 1");

        stack.push(A);

        Assert.assertFalse(stack.isEmpty());
    }

    @Test
    public void size() throws Exception
    //tests size
    {
        LinkedListStack stack = new LinkedListStack();

        LinkedListNode A = new LinkedListNode("Object 1");
        LinkedListNode B = new LinkedListNode("Object 2");
        LinkedListNode C = new LinkedListNode("Object 3");

        stack.push(A);
        stack.push(B);
        stack.push(C);

        Assert.assertEquals(3, stack.size());
    }

}