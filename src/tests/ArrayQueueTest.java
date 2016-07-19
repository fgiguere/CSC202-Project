package tests;

import model.User;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import utils.ArrayQueue;

/**
 * Created by faith on 7/18/16.
 */
public class ArrayQueueTest {
    @Test
    public void testArrayQueue() throws Exception {

        //Enqueue, Dequeue, isEmpty, isFull(array), size, toString

        //Create the test data and empty queue
        User A = new User("User_1","Pass_1");
        User B = new User("User_2","Pass_2");
        User C = new User("User_3","Pass_3");

        ArrayQueue <User> queue = new ArrayQueue<>(3);

        //Test isEmpty
        Assert.assertTrue(queue.isEmpty());

        //Test size, enqueue, isFull
        queue.enqueue(A);

        Assert.assertEquals(queue.size(),1);
        Assert.assertFalse(queue.isFull());

        //Test dequeue, size, isFull
        queue.enqueue(B);
        queue.enqueue(C);

        Assert.assertEquals(queue.size(),3);
        Assert.assertTrue(queue.isFull());
        Assert.assertEquals(queue.dequeue(),A);

        //Test toString
        Assert.assertThat(queue.toString(), CoreMatchers.is("Username: User_2\nUsername: User_3\n"));


    }

}
