package com.twu28.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/20/12
 * Time: 11:44 AM
 * To change this template use File | Settings | File Templates.
 */
public class UserTest {

    @Test public void correctPasswordIsReturned() throws Exception{
        User user=new User("111-12345","abcde","customer");
        assertEquals("abcde",user.getPassword());
    }

    @Test public void correctUserIdIsReturned() throws Exception{
        User user=new User("111-12345","abcde","customer");
        assertEquals("111-12345",user.getLibraryNumber());
    }

    @Test public void correctRoleIsReturned() throws Exception{
        User user=new User("111-12345","abcde","customer");
        assertEquals("customer",user.getRole());
    }

}
