package tests;

import org.junit.Assert;
import org.junit.Test;
import utils.LinkedListIndexedList;

import static org.junit.Assert.*;

/**
 * Created by faith on 7/19/16.
 */
public class LinkedListIndexedListTest {
    @Test
    public void add() throws Exception {
        LinkedListIndexedList list = new LinkedListIndexedList();

        Object A = new Object();

        list.add(A);

        Assert.assertFalse(list.isEmpty());
    }

    @Test
    public void set() throws Exception {
        LinkedListIndexedList list = new LinkedListIndexedList();

        Object A = new Object();
        Object B = new Object();
        Object C = new Object();

        list.set(A,0);
        list.set(B,1);
        list.set(C,1);

        Assert.assertEquals(2,list.size());
    }

    @Test
    public void get() throws Exception {
        LinkedListIndexedList list = new LinkedListIndexedList();

        Object A = new Object();
        Object B = new Object();

        list.add(A,0);
        list.add(B,1);

        Assert.assertEquals(B,list.get(1));
    }

    @Test
    public void remove() throws Exception {
        LinkedListIndexedList list = new LinkedListIndexedList();

        Object A = new Object();
        Object B = new Object();

        list.add(A);
        list.add(B);

        Assert.assertTrue(list.remove(A));
    }

    @Test
    public void indexOf() throws Exception {
        LinkedListIndexedList list = new LinkedListIndexedList();

        Object A = new Object();
        Object B = new Object();

        list.add(A,0);
        list.add(B,1);

        Assert.assertEquals(1,list.indexOf(B));
    }

    @Test
    public void add1() throws Exception {
        LinkedListIndexedList list = new LinkedListIndexedList();

        Object A = new Object();
        Object B = new Object();

        list.add(A,0);
        list.add(B,0);

        Assert.assertEquals(B,list.get(0));
    }

    @Test
    public void remove1() throws Exception {
        LinkedListIndexedList list = new LinkedListIndexedList();

        Object A = new Object();
        Object B = new Object();

        list.set(A,0);
        list.set(B,1);

        Assert.assertEquals(B,list.remove(1));
    }

    @Test
    public void contains() throws Exception {
        LinkedListIndexedList list = new LinkedListIndexedList();

        Object A = new Object();
        Object B = new Object();

        list.add(A);

        Assert.assertTrue(list.contains(A));
        Assert.assertFalse(list.contains(B));
    }

    @Test
    public void isEmpty() throws Exception {
        LinkedListIndexedList list = new LinkedListIndexedList();

        Assert.assertTrue(list.isEmpty());

        Object A = new Object();

        list.add(A);

        Assert.assertFalse(list.isEmpty());
    }

    @Test
    public void size() throws Exception {
        LinkedListIndexedList list = new LinkedListIndexedList();

        Object A = new Object();
        Object B = new Object();

        list.add(A,0);
        list.add(B,1);

        Assert.assertEquals(2, list.size());
    }

    @Test
    public void reset() throws Exception {
        LinkedListIndexedList list = new LinkedListIndexedList();

        Object A = new Object();
        Object B = new Object();

        list.add(A,0);
        list.add(B,1);
        list.reset();

        Assert.assertEquals(A, list.getNext());
    }

    @Test
    public void getNext() throws Exception {
        LinkedListIndexedList list = new LinkedListIndexedList();

        Object A = new Object();
        Object B = new Object();

        list.add(A);
        list.add(B);
        list.reset();

        Assert.assertEquals(A, list.getNext());
    }

}