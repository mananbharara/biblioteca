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

    @Test public void bookInfoIsCorrect() throws Exception{

        assertEquals("Game Of Thrones by R.R. Martin",new Book("Game Of Thrones","R.R. Martin",20).getInfo());
    }

    @Test public void checkBookAvailability() throws Exception{
        BookStub testBook=new BookStub("TG001","The Godfather","Mario Puzo",15);
        testBook.setIssued(14);
        assertTrue(testBook.isAvailable());
        testBook.setIssued(15);
        assertFalse(testBook.isAvailable());
    }

    @Test public void checkBookCountDecrement() throws Exception{

        BookStub testBook=new BookStub("TC001","The Confession","John Grisham",5);
        testBook.setIssued(4);
        assertTrue(testBook.decreaseCount());
        assertFalse(testBook.decreaseCount());
    }
}





