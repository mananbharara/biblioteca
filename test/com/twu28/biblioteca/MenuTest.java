package com.twu28.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/18/12
 * Time: 12:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class MenuTest {

    String newLine;
    Library lib;

    public void initialize(){
        ArrayList<Book> book=new ArrayList<Book>();
        book.add(new Book("TG001","The Godfather","Mario Puzo",1));
        lib=new Library(book);
    }

    public PipedOutputStream getMockInputStream() throws Exception{
        PipedInputStream testInPipe=new PipedInputStream();
        PipedOutputStream testOutPipe=new PipedOutputStream();
        testInPipe.connect(testOutPipe);
        System.setIn(testInPipe);
        return testOutPipe;
    }

    public ByteArrayOutputStream setMockOutputStream(){
        ByteArrayOutputStream testOut=new ByteArrayOutputStream();
        PrintStream testOutPrintStream=new PrintStream(testOut);
        System.setOut(testOutPrintStream);
        newLine=System.getProperty("line.separator");
        if(newLine==null){newLine="\n"; }
        return testOut;
    }

    @Test public void allBooksDisplayedIfCustomerChoiceIsV() throws Exception{
        initialize();
        ByteArrayOutputStream receivedOutput=setMockOutputStream();
        new Menu(lib).displayResultsForOption('B');
        assertEquals("TG001 - The Godfather by Mario Puzo\n",receivedOutput.toString());
    }

    @Test public void bookReservedIfAvailableAndOptionIsR() throws Exception{
        initialize();
        getMockInputStream().write("TG001\n".getBytes());
        ByteArrayOutputStream receivedOutput=setMockOutputStream();
        new Menu(lib).displayResultsForOption('R');
        assertEquals("Enter Book Id of the Book to reserve: " + newLine + "Thank You! Enjoy the book.\n", receivedOutput.toString());
        }

    @Test public void bookNotReservedIfNotAvailable() throws Exception{
        ArrayList<Book> book=new ArrayList<Book>();
        book.add(new Book("TG001","The Godfather","Mario Puzo",0));
        lib=new Library(book);
        getMockInputStream().write("TG001\n".getBytes());
        ByteArrayOutputStream receivedOutput=setMockOutputStream();
        new Menu(lib).displayResultsForOption('R');
        assertEquals("Enter Book Id of the Book to reserve: "+newLine+"Sorry we don't have that book yet.\n",receivedOutput.toString());

    }

    @Test public void allMoviesDisplayedIfCustomerChoiceIsM() throws Exception{
        ArrayList<Movie>movies=new ArrayList<Movie>();
        movies.add(new Movie("The Terminal","Steven Spielsberg",8));
        lib=new Library(null,movies);
        ByteArrayOutputStream receivedOutput=setMockOutputStream();
        new Menu(lib).displayResultsForOption('M');
        assertEquals("The Terminal Steven Spielsberg 8/10\n",receivedOutput.toString());
    }

    @Test public void InvalidMessageIfIncorrectOptionSelected()throws Exception{

            initialize();
            ByteArrayOutputStream receivedOutput=setMockOutputStream();
            new Menu(lib).displayResultsForOption('X');
            assertEquals("Select a valid option!!\n",receivedOutput.toString());
    }

    @Test public void notificationOnCheckLibraryNumber(){
        initialize();
        ByteArrayOutputStream receivedOutput=setMockOutputStream();
        new Menu(lib).displayResultsForOption('C');
        assertEquals("Please talk to Librarian. Thank you.\n",receivedOutput.toString());
    }
}
