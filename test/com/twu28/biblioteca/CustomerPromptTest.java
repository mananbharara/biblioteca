package com.twu28.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/14/12
 * Time: 6:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class CustomerPromptTest {

    @Test public void customerIsWelcomed(){
        Library lib=null;
        assertEquals("Welcome to Biblioteca\n",new CustomerPrompt(lib).welcomeDisplay());

    }

    @Test public void invalidMesssageIfIncorrectOptionSelected(){
        Library lib=null;
        assertEquals("Select a valid option!!",new CustomerPrompt(lib).performActionSelected('X'));

    }

}
