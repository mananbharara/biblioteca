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
    ArrayList<User> userList;

    public void initializeUserList(){

    }

    @Test public void userIsCorrectlyValidated() throws Exception{
        initializeUserList();
        assertTrue(new UserManager().validateUser("111-11112", "aaaab"));
    }

    @Test public void currentUserIsRecorded()throws Exception{
        initializeUserList();
        UserManager s=new UserManager();
        s.validateUser("111-11112", "aaaab");
    }


}
