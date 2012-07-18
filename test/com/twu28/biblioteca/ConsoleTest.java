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
public class ConsoleTest {

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



    @Test public void dataIsDisplayedOnConsole()throws Exception{
        ByteArrayOutputStream receivedOutput=setMockOutputStream();
        new Console().display("This is a test");
        String newLine = System.getProperty("line.separator");
        if (newLine == null) newLine = "\n";
        String expected="This is a test";
        assertEquals(expected,receivedOutput.toString());
    }

    @Test public void inputIsCorrectlyReceivedFromConsole() throws Exception{
        PipedOutputStream setInput=getMockInputStream();
        ByteArrayOutputStream receivedOutput=setMockOutputStream();
        getMockInputStream().write("Test Input\n".getBytes());
        assertEquals("Test Input", new Console().queryUser("Enter Test Input"));
        String newLine = System.getProperty("line.separator");
        if (newLine == null) newLine = "\n";
        String expected="Enter Test Input"+newLine;
        assertEquals(expected,receivedOutput.toString());
    }
}
