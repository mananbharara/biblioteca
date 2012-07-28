package com.twu28.biblioteca;


import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Test;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/25/12
 * Time: 11:04 AM
 * To change this template use File | Settings | File Templates.
 */
public class MenuTest{

    ArrayList<Option> initialOptions=new ArrayList<Option>();
    Mockery context=new Mockery();
    final IBooksViewer booksViewer=context.mock(IBooksViewer.class);
    final IBookReservation bookReservation=context.mock(IBookReservation.class);
    final ILibraryNumberViewer libraryNumberViewer=context.mock(ILibraryNumberViewer.class);
    final IMoviesViewer moviesViewer=context.mock(IMoviesViewer.class);

    public void initializeOptions(){
        initialOptions.add(booksViewer);
        initialOptions.add(bookReservation);
        initialOptions.add(moviesViewer);
        initialOptions.add(libraryNumberViewer);
    }

    public PipedOutputStream getMockInputStream() throws Exception{
        PipedInputStream testInPipe=new PipedInputStream();
        PipedOutputStream testOutPipe=new PipedOutputStream();
        testInPipe.connect(testOutPipe);
        System.setIn(testInPipe);
        return testOutPipe;
    }

    @Test public void libraryNumberIsCorrectlyAssigned(){
        assertEquals("111-11111",new Menu("111-11111", null).currentUserLibraryNumber);
    }

    @Test public void testFirstOptionCallsIfUserChoiceIs1(){
        initializeOptions();
        final Integer testOption=1;
        context.checking(new Expectations(){
            {
                oneOf(initialOptions.get(testOption-1)).getResult(null);
            }
        });
        new Menu(null,initialOptions).getResultsForOptionSelected(testOption);
    }

    @Test public void testThirdOptionCallsIfUserChoiceIs3AndInvalidMessageNotDisplayed()throws Exception{
        initializeOptions();
        context.checking(new Expectations(){
            {
                oneOf(initialOptions.get(2)).getResult(null);
            }
        });
        assertFalse((new Menu(null,initialOptions).getResultsForOptionSelected(3)).equals("Select a valid option!!\n"));
        context.assertIsSatisfied();
    }

    @Test public void shouldReturnInvalidMessageIfUserChoiceIsBeyondNumberOfOptions()throws Exception{
        initializeOptions();
        assertEquals("Select a valid option!!\n", new Menu(null, initialOptions).getResultsForOptionSelected(5));
    }

    @Test public void shouldReturnInvalidMessageIfUserChoiceIsLessThan1()throws Exception{
        initializeOptions();
        assertEquals("Select a valid option!!\n",new Menu(null,initialOptions).getResultsForOptionSelected(0));
    }


    @Test public void testNameGetterCalledOnEveryOption()throws Exception{
        initializeOptions();
        PipedOutputStream setInput=getMockInputStream();
        context.checking(new Expectations(){{
              for(Option o:initialOptions){
                  oneOf(o).getOptionName();
              }
        }
        });
        setInput.write("5\n".getBytes());
        new Menu(null,initialOptions).startMenu();
        context.assertIsSatisfied();
    }

}
