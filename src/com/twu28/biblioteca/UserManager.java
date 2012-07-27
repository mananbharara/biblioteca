package com.twu28.biblioteca;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/20/12
 * Time: 12:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserManager {
    private ArrayList<User> users;

    public UserManager(ArrayList<User> registeredUsers){
        users=registeredUsers;

    }

    public boolean validateUser(String id, String pass) {
        for (User u:users){
            if(u.equals(new User(id,pass)))
            {
            return true;
            }
        }
        return false;
    }
}
