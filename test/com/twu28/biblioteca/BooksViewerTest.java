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
        assertEquals("Books-View All",new BooksViewer().getName());
    }
}
