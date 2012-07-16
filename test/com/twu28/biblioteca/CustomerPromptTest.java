package com.twu28.biblioteca;

import org.junit.Test;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

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
        assertEquals("Select a valid option!!",new CustomerPrompt(lib).getResultsForOptionSelected('X'));
    }

    @Test public void allBooksDisplayedIfViewOptionSelected() throws Exception{
        Book bookCollection[]=new Book[1];
        bookCollection[0]=new Book("TC001","The Confession","John Grisham",5);
        Library lib=new Library(bookCollection);
        assertEquals("TC001 - The Confession by John Grisham\n",new CustomerPrompt(lib).getResultsForOptionSelected('V'));
    }

    @Test public void bookReservedIfReserveOptionSelectedAndBookAvailable() throws Exception{
        Book bookCollection[]=new Book[1];
        bookCollection[0]=new Book("TC001","The Confession","John Grisham",5);
        Library lib=new Library(bookCollection);

        //To Fix input to Book id: TC001
        PipedInputStream testInPipe=new PipedInputStream();
        PipedOutputStream testOutPipe=new PipedOutputStream();
        testInPipe.connect(testOutPipe);
        System.setIn(testInPipe);


        String withLine="TC001"+"\n";
        testOutPipe.write(withLine.getBytes(),0,withLine.length());

        assertEquals("Thank You! Enjoy the book.",new CustomerPrompt(lib).getResultsForOptionSelected('R'));

    }

    @Test public void bookNotReservedIfReserveOptionSelectedAndBookNotAvailable() throws Exception{
        Book bookCollection[]=new Book[1];
        bookCollection[0]=new Book("TC001","The Confession","John Grisham",0);
        Library lib=new Library(bookCollection);
        PipedInputStream testInPipe=new PipedInputStream();
        PipedOutputStream testOutPipe=new PipedOutputStream();
        testInPipe.connect(testOutPipe);
        System.setIn(testInPipe);


        String withLine="TC001"+"\n";
        testOutPipe.write(withLine.getBytes(),0,withLine.length());

        assertEquals("Sorry we don't have that book yet.",new CustomerPrompt(lib).getResultsForOptionSelected('R'));

    }
}
