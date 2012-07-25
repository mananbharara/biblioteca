package com.twu28.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/25/12
 * Time: 11:04 AM
 * To change this template use File | Settings | File Templates.
 */
public class MenuTest {
    @Test public void libraryNumberIsCorrectlyAssigned(){
        assertEquals("111-11111",new Menu("111-11111").currentUserLibraryNumber);
    }
}
