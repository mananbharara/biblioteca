package com.twu28.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/20/12
 * Time: 12:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserManagerTest {
    ArrayList<User> users;

    public void initializeUserList(){
        users=new ArrayList<User>();
        users.add(new User("111-11111", "aaaaa", "Librarian"));
        users.add(new User("111-11112", "aaaab", "Customer"));
    }


    @Test public void correctUserIsValidated() throws Exception{
        initializeUserList();
        assertTrue(new UserManager(users).validateUser("111-11112", "aaaab"));
    }

    @Test public void incorrectUserIsNotLoggedIn() throws Exception{
        initializeUserList();
        assertFalse(new UserManager(users).validateUser("111-11111","abcds"));
    }



}
