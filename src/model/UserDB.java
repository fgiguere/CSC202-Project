package model;

import utils.LinkedListStack;

public class UserDB {

    private static LinkedListStack users = new LinkedListStack();

    public static LinkedListStack getUsers() {return users;}

    public static void setUsers(LinkedListStack users) {UserDB.users = users;}

}
