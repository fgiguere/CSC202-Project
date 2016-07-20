package tests;

import model.User;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import utils.LinkedListOrderedList;

import static org.junit.Assert.*;

/**
 * Created by faith on 7/19/16.
 */
public class LinkedListOrderedListTest {
    @Test
    public void add() throws Exception {
        LinkedListOrderedList list = new LinkedListOrderedList();

        User A = new User("A","A");

        list.add(A);

        Assert.assertTrue(list.contains("A"));
    }

    @Test
    public void remove() throws Exception {
        LinkedListOrderedList list = new LinkedListOrderedList();

        User A = new User("A","A");

        list.add(A);

        Assert.assertTrue(list.remove("A"));
    }

    @Test
    public void contains() throws Exception {
        LinkedListOrderedList list = new LinkedListOrderedList();

        User A = new User("A","A");

        list.add(A);

        Assert.assertTrue(list.contains("A"));
    }

    @Test
    public void isEmpty() throws Exception {
        LinkedListOrderedList list = new LinkedListOrderedList();

        Assert.assertTrue(list.isEmpty());

        User A = new User("A","A");

        list.add(A);

        Assert.assertFalse(list.isEmpty());
    }

    @Test
    public void size() throws Exception {
        LinkedListOrderedList list = new LinkedListOrderedList();

        Assert.assertEquals(0, list.size());

        User A = new User("A","A");

        list.add(A);

        Assert.assertEquals(1, list.size());
    }

    @Test
    public void get() throws Exception {
        LinkedListOrderedList list = new LinkedListOrderedList();

        User A = new User("A","A");

        list.add(A);

        Assert.assertEquals(A, list.get("A"));
    }

    @Test
    public void reset() throws Exception {
        LinkedListOrderedList list = new LinkedListOrderedList();

        User A = new User("A","A");
        User B = new User("B","B");
        User C = new User("C","C");

        list.add(A);
        list.add(B);
        list.add(C);

        Assert.assertEquals(B, list.getNext());
        list.getNext();

        list.reset();

        Assert.assertEquals(B, list.getNext());
    }

    @Test
    public void getNext() throws Exception {
        LinkedListOrderedList list = new LinkedListOrderedList();

        User A = new User("A","A");
        User B = new User("B","B");

        list.add(A);
        list.add(B);

        Assert.assertEquals(B, list.getNext());
    }

    @Test
    public void toStringTest() throws Exception {
        LinkedListOrderedList list = new LinkedListOrderedList();

        User A = new User("A","A");
        User B = new User("B","B");
        User C = new User("C","C");

        list.add(C);
        list.add(B);
        list.add(A);

        Assert.assertThat(list.toString(), CoreMatchers.is("Username: A\nUsername: B\nUsername: C\n"));
    }

}