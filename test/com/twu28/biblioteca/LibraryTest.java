package com.twu28.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/13/12
 * Time: 11:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class LibraryTest {

    @Test public void welcomeScreen(){
        assertEquals("Welcome to Biblioteca\n",new Library().welcomeDisplay());
    }
}
