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
    private ArrayList<User> registeredUsers;

    public UserManager(){
        registeredUsers =new ArrayList<User>();
        registeredUsers.add(new User("111-11111", "aaaaa", "Librarian"));
        registeredUsers.add(new User("111-11112", "aaaab", "Customer"));

    }

    public boolean validateUser(String id, String pass) {
        for(User u:registeredUsers){
            if(id.equals(u.getLibraryNumber())&&pass.equals(u.getPassword())){
                return true;
            }
        }
        return false;
    }
}
