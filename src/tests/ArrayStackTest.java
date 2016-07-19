package tests;

import model.User;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import utils.ArrayStack;

/**
 * Created by faith on 7/17/16.
 */

public class ArrayStackTest {
    @Test
    public void testArrayStack() throws Exception
    //Tests ArrayStack
    {
        //Create Test data and empty stack
        User A = new User("User_1","Pass_1");
        User B = new User("User_2","Pass_2");
        User C = new User("User_3","Pass_3");

        ArrayStack <User> stack = new ArrayStack(3);

        //Test push and pop

        stack.push(A);

        User temp = stack.pop();

        Assert.assertEquals(A, temp);

        //Test isEmpty

        Assert.assertTrue(stack.isEmpty());

        //Test size

        stack.push(A);
        stack.push(B);
        stack.push(C);

        Assert.assertEquals(3, stack.size());

        //Test isFull

        Assert.assertTrue(stack.isFull());

        //Test toString

        Assert.assertThat(stack.toString(), CoreMatchers.is("Username: User_1\nUsername: User_2\nUsername: User_3\n"));
    }
}
