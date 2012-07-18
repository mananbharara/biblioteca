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

        assertEquals("Game Of Thrones by R.R. Martin",new Book("GT001","Game Of Thrones","R.R. Martin",20).toString());
    }

    @Test public void getTrueIfBookIsAvailable() throws Exception{
        Book testBook=new Book("TG001","The Godfather","Mario Puzo",15);
        assertTrue(testBook.isAvailable());
    }

    @Test public void getFalseIfBookNotAvailable()throws Exception{
        Book testBook=new Book("TG001","The Godfather","Mario Puzo",0);          //To initialize with Zero copies- so not available
        assertFalse(testBook.isAvailable());
    }

    @Test public void canReserveIfBookAvailable() throws Exception{

        Book testBook=new Book("TC001","The Confession","John Grisham",5);
        assertTrue(testBook.reserve());
    }

    @Test public void cannotReserveIfBookNotAvailable() throws Exception{
        Book testBook=new Book("TC001","The Confession","John Grisham",0);
        assertFalse(testBook.reserve());
    }
}





