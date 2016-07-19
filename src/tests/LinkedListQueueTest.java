package tests;

/**
 * Created by faith on 7/16/16.
 */

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import utils.LinkedListNode;
import utils.LinkedListQueue;

public class LinkedListQueueTest {
    @Test
    public void testLinkedListQueue() throws Exception {
        //Queue: Enqueue, Dequeue, isEmpty, size, toString

        //Create Test data and empty queue
        LinkedListNode A = new LinkedListNode("Object 1");
        LinkedListNode B = new LinkedListNode("Object 2");
        LinkedListNode C = new LinkedListNode("Object 3");

        LinkedListQueue queue = new LinkedListQueue();

        //Test isEmpty method
        boolean isEmptyTest = queue.isEmpty();

        Assert.assertTrue(isEmptyTest);

        //Test enqueue and dequeue method
        queue.enqueue(A);

        LinkedListNode testDequeue = queue.dequeue();

        Assert.assertEquals(A, testDequeue);

        //Test size
        queue.enqueue(A);
        queue.enqueue(B);
        queue.enqueue(C);

        int testSize = queue.size();

        Assert.assertEquals(3, testSize);

        //Test toString

        String testString = queue.toString();

        Assert.assertThat(testString, CoreMatchers.is("Object 1\tObject 2\tObject 3\t"));

    }
}
