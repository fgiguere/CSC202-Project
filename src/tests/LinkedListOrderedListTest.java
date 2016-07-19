package tests;

import model.User;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import utils.LinkedListOrderedList;

/**
 * Created by faith on 7/17/16.
 */
public class LinkedListOrderedListTest {
    @Test
    public void testLinkedListOrderedList() throws Exception {
        //add, remove, contains, isEmpty, size, get, toString, reset, getNext
        //Create test data and new list
        User A = new User("User_1","Pass_1");
        User B = new User("User_2","Pass_2");
        User C = new User("User_3","Pass_3");
        User D = new User("User_4","Pass_4");

        LinkedListOrderedList list = new LinkedListOrderedList();

        //Test isEmpty

        Assert.assertTrue(list.isEmpty());

        //Test add, contains, get, size

        list.add(A);

        Assert.assertTrue(list.contains("User_1"));
        Assert.assertFalse(list.contains("User_2"));

        User test = list.get("User_1");

        Assert.assertEquals(A,test);

        Assert.assertEquals(1,list.size());

        //Test remove

        Assert.assertTrue(list.remove("User_1"));
        Assert.assertTrue(list.isEmpty());

        //Test toString, and ordering of usernames

        list.add(D);
        list.add(B);
        list.add(C);
        //list.add(A);

        Assert.assertThat(list.toString(), CoreMatchers.is("Username: User_1\nUsername: User_2\nUsername: User_3\nUsername: User_4\n"));

    }
}
