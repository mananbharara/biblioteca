package com.twu28.biblioteca;


import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Test;

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



    @Test public void libraryNumberIsCorrectlyAssigned(){
        assertEquals("111-11111",new Menu("111-11111", null).currentUserLibraryNumber);
    }

    @Test public void testBooksViewerCallsIfUserInput1()throws Exception{
        initializeOptions();
        context.checking(new Expectations(){
            {
                oneOf(booksViewer).getResult(null);
            }
        });
        new Menu(null,initialOptions).getResultsForOptionSelected(1);
        context.assertIsSatisfied();
    }

    @Test public void testBookReservationCallsIfUserInput2()throws Exception{
        initializeOptions();
        context.checking(new Expectations(){
            {
                oneOf(bookReservation).getResult(null);
            }
        });
        new Menu(null,initialOptions).getResultsForOptionSelected(2);
        context.assertIsSatisfied();
    }

    @Test public void testMoviesViewerCallsIfUserInput3()throws Exception{
        initializeOptions();
        context.checking(new Expectations(){
            {
                oneOf(moviesViewer).getResult(null);
            }
        });
        new Menu(null,initialOptions).getResultsForOptionSelected(3);
        context.assertIsSatisfied();
    }

    @Test public void testLibraryNumberViewCallsIfUserInput4()throws Exception{
        initializeOptions();
        final String libraryNumber="testNumber";
        context.checking(new Expectations(){
            {
                oneOf(libraryNumberViewer).getResult(libraryNumber);
            }
        });
        new Menu(libraryNumber,initialOptions).getResultsForOptionSelected(4);
        context.assertIsSatisfied();
    }

    @Test public void shouldNotDisplayInvalidMessageIfInputWithinOptionRange()throws Exception{
        initializeOptions();
        context.checking(new Expectations(){
            {
                oneOf(moviesViewer).getResult(null);
            }
        });
        assertFalse((new Menu(null,initialOptions).getResultsForOptionSelected(3)).equals("Select a valid option!!\n"));
        context.assertIsSatisfied();
    }

    @Test public void shouldReturnInvalidMessageIfUserChoiceIsBeyondNumberOfOptions()throws Exception{
        initializeOptions();
        assertEquals("Select a valid option!!\n", new Menu(null, initialOptions).getResultsForOptionSelected(5));
    }
}
