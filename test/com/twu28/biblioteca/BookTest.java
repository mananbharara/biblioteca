package com.twu28.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/13/12
 * Time: 5:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class BookTest {

    @Test() public void bookInfoIsCorrect() throws Exception{

        assertEquals("Game Of Thrones by R.R. Martin",new Book("Game Of Thrones","R.R. Martin",20,2).getInfo());
    }

    @Test() public void onlyAvailableBooksAreIssued(){
        Book testBook=new Book("The Godfather","Mario Puzo",15,14);
        assertTrue(testBook.issueBook());
        assertFalse(testBook.issueBook());
    }
}





