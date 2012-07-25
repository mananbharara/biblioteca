package com.twu28.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/24/12
 * Time: 1:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class BooksViewerTest {
    @Test public void optionNameIsCorrect()throws Exception{
        assertEquals("Books-View All",new BooksViewer().getOptionName());
    }

    @Test public void allBooksAreDisplayed() throws Exception{
        String expected="SH001 - Sherlock Holmes by Ser Arthur Conan Doyle\n" +
                "DP001 - Deception Point by Dan Brown\n" +
                "TG001 - The Godfather by Mario Puzo\n" +
                "TC001 - The Confession by John Grisham\n" +
                "B001 - Brida by Paolo Coelho\n";
        assertEquals(expected,new BooksViewer().getResult(null));
    }
}
