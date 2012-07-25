package com.twu28.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/24/12
 * Time: 2:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class LibraryNumberViewerTest {

    @Test public void optionNameIsCorrect() throws Exception{
        assertEquals("Check Library Number",new LibraryNumberViewer().getOptionName());
    }

    @Test public void notificationOnCheckLibraryNumberIfNotLoggedIn()throws Exception{
        assertEquals("Please talk to Librarian. Thank you.\n",new LibraryNumberViewer().getResult(null));
    }

    @Test public void notificationOnCheckLibraryNumberIfLoggedIn() throws Exception{
        assertEquals("111-11111\n",new LibraryNumberViewer().getResult("111-11111"));
    }
}
