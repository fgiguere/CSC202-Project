package tests;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import utils.LinkedListNode;
import utils.LinkedListQueue;

import static org.junit.Assert.*;

/**
 * Created by faith on 7/19/16.
 */
public class LinkedListQueueTest<T> {

    @Test
    public void enqueue() throws Exception
    //test enqueue
    {
        LinkedListQueue queue = new LinkedListQueue();

        LinkedListNode A = new LinkedListNode("Object 1");

        queue.enqueue(A);

        Assert.assertEquals(queue.dequeue(), A);
    }

    @Test
    public void dequeue() throws Exception
    //tests dequeue
    {
        LinkedListQueue queue = new LinkedListQueue();

        LinkedListNode A = new LinkedListNode("Object 1");

        queue.enqueue(A);

        Assert.assertEquals(queue.dequeue(), A);
    }

    @Test
    public void isEmpty() throws Exception
    //Test isEmpty
    {
        LinkedListQueue queue = new LinkedListQueue();

        Assert.assertTrue(queue.isEmpty());
    }

    @Test
    public void size() throws Exception
    //tests size
    {
        LinkedListQueue queue = new LinkedListQueue();

        LinkedListNode A = new LinkedListNode("Object 1");
        LinkedListNode B = new LinkedListNode("Object 2");
        LinkedListNode C = new LinkedListNode("Object 3");

        queue.enqueue(A);
        queue.enqueue(B);
        queue.enqueue(C);

        int testSize = queue.size();

        Assert.assertEquals(3, testSize);
    }

    @Test
    public void toStringTest() throws Exception
    //tests toString
    {
        LinkedListQueue queue = new LinkedListQueue();

        LinkedListNode A = new LinkedListNode("Object 1");
        LinkedListNode B = new LinkedListNode("Object 2");
        LinkedListNode C = new LinkedListNode("Object 3");

        queue.enqueue(A);
        queue.enqueue(B);
        queue.enqueue(C);

        String testString = queue.toString();

        Assert.assertThat(testString, CoreMatchers.is("Object 1\tObject 2\tObject 3\t"));

    }

}