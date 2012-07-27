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
        User user=new User("111-12345","abcde");
        assertEquals("abcde",user.getPassword());
    }

    @Test public void correctUserIdIsReturned() throws Exception{
        User user=new User("111-12345","abcde");
        assertEquals("111-12345",user.getLibraryNumber());
    }



}
