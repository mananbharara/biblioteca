package com.twu28.biblioteca;

import org.junit.Test;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/24/12
 * Time: 1:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class BookReservationTest
{
    public PipedOutputStream getMockInputStream() throws Exception{
        PipedInputStream testInPipe=new PipedInputStream();
        PipedOutputStream testOutPipe=new PipedOutputStream();
        testInPipe.connect(testOutPipe);
        System.setIn(testInPipe);
        return testOutPipe;
    }

    @Test public void optionNameIsCorrect()throws Exception{
        assertEquals("Reserve a Book",new BookReservation().getOptionName());
    }

    @Test public void bookReservedIfAvailable() throws Exception{

        getMockInputStream().write("TG001\n".getBytes());
        assertEquals("Thank You! Enjoy the book.\n", new BookReservation().getResult(null));
    }

    @Test public void bookNotReservedIfNotAvailable() throws Exception{
        getMockInputStream().write("B001\n".getBytes());
        assertEquals("Sorry we don't have that book yet.\n",new BookReservation().getResult(null));

    }
}
