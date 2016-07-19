package tests;

/**
 * Created by faith on 7/16/16.
 */

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import utils.LinkedListNode;
import utils.LinkedListStack;

public class LinkedListStackTest {
    @Test
    public void testLinkedListStack() throws Exception {
        //Stack: Push, pop, top, isEmpty, size, toString

        //Create Test data and empty stack
        LinkedListNode A = new LinkedListNode("Object 1");
        LinkedListNode B = new LinkedListNode("Object 2");
        LinkedListNode C = new LinkedListNode("Object 3");

        LinkedListStack stack = new LinkedListStack();

        //Test isEmpty method
        boolean isEmptyTest = stack.isEmpty();

        Assert.assertTrue(isEmptyTest);

        //Test push and pop method
        stack.push(A);

        LinkedListNode testPop = stack.pop();

        Assert.assertEquals(A, testPop);

        //Test top
        stack.push(A);

        LinkedListNode testTop = stack.pop();

        Assert.assertEquals(A, testPop);

        //Test size
        stack.push(A);
        stack.push(B);
        stack.push(C);

        int testSize = stack.size();

        Assert.assertEquals(3, testSize);

        //Test toString

        String testString = stack.toString();

        Assert.assertThat(testString, CoreMatchers.is("Object 3\tObject 2\tObject 1\t"));

    }
}
