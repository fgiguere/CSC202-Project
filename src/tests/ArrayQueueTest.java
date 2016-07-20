package tests;

import model.User;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import utils.ArrayQueue;

import static org.junit.Assert.*;

/**
 * Created by faith on 7/19/16.
 */
public class ArrayQueueTest {

    @Test
    public void isFull() throws Exception {
        ArrayQueue queue = new ArrayQueue(2);

        Assert.assertFalse(queue.isFull());

        Object A = new Object();
        Object B = new Object();

        queue.enqueue(A);
        queue.enqueue(B);

        Assert.assertTrue(queue.isFull());
    }

    @Test
    public void enqueue() throws Exception {
        ArrayQueue queue = new ArrayQueue(2);

        Object A = new Object();

        queue.enqueue(A);

        Assert.assertEquals(A,queue.dequeue());
    }

    @Test
    public void isEmpty() throws Exception {
        ArrayQueue queue = new ArrayQueue(2);

        Assert.assertTrue(queue.isEmpty());

        Object A = new Object();

        queue.enqueue(A);

        Assert.assertFalse(queue.isEmpty());
    }

    @Test
    public void size() throws Exception {
        ArrayQueue queue = new ArrayQueue(2);

        Object A = new Object();

        queue.enqueue(A);

        Assert.assertEquals(1, queue.size());
    }

    @Test
    public void dequeue() throws Exception {
        ArrayQueue queue = new ArrayQueue(2);

        Object A = new Object();

        queue.enqueue(A);

        Assert.assertEquals(A, queue.dequeue());
    }

    @Test
    public void toStringTest() throws Exception {
        ArrayQueue <User> queue = new ArrayQueue(3);

        User A = new User("User_1","Pass_1");
        User B = new User("User_2","Pass_2");
        User C = new User("User_3","Pass_3");

        queue.enqueue(A);
        queue.enqueue(B);
        queue.enqueue(C);

        Assert.assertThat(queue.toString(), CoreMatchers.is("Username: User_1\nUsername: User_2\nUsername: User_3\n"));
    }

}