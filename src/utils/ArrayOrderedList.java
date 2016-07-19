package utils;

import model.User;

/**
 * Created by faith on 7/11/16.
 */
/*
public class ArrayOrderedList<T> implements IList<User> {
}
    /*int defaultCap = 100; //default capacity of queue, if not specified
    User[] list; //holds queue elements
    int lastIndex = -1; //index of top element in stack
    int curIndex = -1;

    public ArrayOrderedList () {
        list = (User[] ) new Object [defaultCap];
    }

    public ArrayOrderedList (int size) {
        list = (User[]) new Object[size];
    }

    @Override
    public void add(User newUser) {
        reset();
        if(isEmpty()) {
            list[0] = newUser;
            lastIndex = 0;
        }

        if(newUser.compareTo(list[0]) < 0) {
            curIndex = lastIndex;
            while(curIndex >= 0) {
                list[curIndex] = list[curIndex + 1];
                curIndex--;
            }
            list[0] = newUser;
        }

        while(newUser.compareTo(list[curIndex]) > 0 && curIndex <= lastIndex)) {

        }
    }

    @Override
    public boolean remove(String userName) {
        return false;
    }

    @Override
    public boolean contains(String userName) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        if(lastIndex == -1) {
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public User get(String userName) {
        return null;
    }

    @Override
    public void reset() {
        if(!isEmpty()) {
            curIndex = 0;
        }
    }

    @Override
    public User getNext() {
        if(isEmpty()) {
            return null;
        }
        curIndex++;
        return list[curIndex];
    }
} */

