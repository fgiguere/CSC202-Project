package tests;

import model.User;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import utils.ArrayStack;

/**
 * Tests ArrayStack
 */
public class ArrayStackTest {

    @Test
    public void isFull() throws Exception
    //tests isFull
    {
        ArrayStack<User> stack = new ArrayStack(3);

        Assert.assertFalse(stack.isFull());

        User A = new User("User_1","Pass_1");
        User B = new User("User_2","Pass_2");
        User C = new User("User_3","Pass_3");

        stack.push(A);
        stack.push(B);
        stack.push(C);

        Assert.assertTrue(stack.isFull());
    }

    @Test
    public void push() throws Exception
    //tests push
    {
        ArrayStack<User> stack = new ArrayStack(3);

        User A = new User("User_1","Pass_1");
        User B = new User("User_2","Pass_2");
        User C = new User("User_3","Pass_3");

        stack.push(A);
        stack.push(B);
        stack.push(C);

        Assert.assertEquals(C, stack.top());
    }

    @Test
    public void top() throws Exception
    //tests top
    {
        ArrayStack<User> stack = new ArrayStack(3);

        User A = new User("User_1","Pass_1");
        User B = new User("User_2","Pass_2");

        stack.push(A);
        stack.push(B);

        Assert.assertEquals(B, stack.top());
    }

    @Test
    public void pop() throws Exception
    //tests pop
    {
        ArrayStack<User> stack = new ArrayStack(3);

        User A = new User("User_1","Pass_1");

        stack.push(A);

        Assert.assertEquals(A, stack.pop());
    }

    @Test
    public void isEmpty() throws Exception
    //tests isEmpty
    {
        ArrayStack<User> stack = new ArrayStack(3);

        Assert.assertTrue(stack.isEmpty());

        User A = new User("User_1","Pass_1");

        stack.push(A);

        Assert.assertFalse(stack.isEmpty());
    }

    @Test
    public void size() throws Exception
    //tests size
    {
        ArrayStack<User> stack = new ArrayStack(3);

        User A = new User("User_1","Pass_1");
        User B = new User("User_2","Pass_2");
        User C = new User("User_3","Pass_3");

        stack.push(A);
        stack.push(B);
        stack.push(C);

        Assert.assertEquals(3, stack.size());
    }

    @Test
    public void toStringTest() throws Exception
    //tests toString
    {
        ArrayStack<User> stack = new ArrayStack(3);

        User A = new User("User_1","Pass_1");
        User B = new User("User_2","Pass_2");
        User C = new User("User_3","Pass_3");

        stack.push(A);
        stack.push(B);
        stack.push(C);

        Assert.assertThat(stack.toString(), CoreMatchers.is("Username: User_1\nUsername: User_2\nUsername: User_3\n"));
    }

}