package model;

import utils.LinkedListOrderedList;

public class UserDB {

    private static LinkedListOrderedList users = new LinkedListOrderedList();

    public static LinkedListOrderedList getUsers() {return users;}

    public static void setUsers(LinkedListOrderedList users) {UserDB.users = users;}

}
