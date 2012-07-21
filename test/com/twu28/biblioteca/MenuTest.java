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
        String expected="SH001 - Sherlock Holmes by Ser Arthur Conan Doyle\n" +
                "DP001 - Deception Point by Dan Brown\n" +
                "TG001 - The Godfather by Mario Puzo\n" +
                "TC001 - The Confession by John Grisham\n" +
                "B001 - Brida by Paolo Coelho\n";
        ByteArrayOutputStream receivedOutput=setMockOutputStream();
        new Menu(null).displayResultsForOption('B');
        assertEquals(expected,receivedOutput.toString());
    }

    @Test public void bookReservedIfAvailableAndOptionIsR() throws Exception{

        getMockInputStream().write("TG001\n".getBytes());
        ByteArrayOutputStream receivedOutput=setMockOutputStream();
        new Menu(null).displayResultsForOption('R');
        assertEquals("Enter Book Id of the Book to reserve: " + newLine + "Thank You! Enjoy the book.\n", receivedOutput.toString());
        }

    @Test public void bookNotReservedIfNotAvailable() throws Exception{
        getMockInputStream().write("B001\n".getBytes());
        ByteArrayOutputStream receivedOutput=setMockOutputStream();
        new Menu(null).displayResultsForOption('R');
        assertEquals("Enter Book Id of the Book to reserve: "+newLine+"Sorry we don't have that book yet.\n",receivedOutput.toString());

    }

    @Test public void allMoviesDisplayedIfCustomerChoiceIsM() throws Exception{
        String expected="Sholay Ramesh Sippy 8/10\n" +
                "The Departed Martin Scorsese 9/10\n" +
                "Blood Diamond Edward Zwick 8/10\n" +
                "Rockstar Imtiaz Ali N/A\n" +
                "Cocktail Homi Adjania N/A\n";
        ByteArrayOutputStream receivedOutput=setMockOutputStream();
        new Menu(null).displayResultsForOption('M');
        assertEquals(expected,receivedOutput.toString());
    }

    @Test public void InvalidMessageIfIncorrectOptionSelected()throws Exception{
        ByteArrayOutputStream receivedOutput=setMockOutputStream();
        new Menu(null).displayResultsForOption('X');
        assertEquals("Select a valid option!!\n",receivedOutput.toString());
    }

    @Test public void notificationOnCheckLibraryNumber(){

        ByteArrayOutputStream receivedOutput=setMockOutputStream();
        new Menu(null).displayResultsForOption('C');
        assertEquals("Please talk to Librarian. Thank you.\n",receivedOutput.toString());
    }
}
