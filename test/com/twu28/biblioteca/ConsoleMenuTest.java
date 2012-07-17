package com.twu28.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/17/12
 * Time: 11:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConsoleMenuTest {

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
        return testOut;
    }

    @Test public void menuIsDisplayedOnConsole() throws Exception{
        ByteArrayOutputStream receivedOutput=setMockOutputStream();
        new ConsoleMenu().displayOptionsMenu();
        assertEquals("Please choose from the following options: \n\nView All Books\nReserve a Book\nCheck your Library Number\nExit\n\n",receivedOutput.toString());

    }
}
