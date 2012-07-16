package com.twu28.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/13/12
 * Time: 11:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class LibraryTest {

    Book book[];                           //To store a collection of books

    //To store 5 sample books in library
    public void initialize(){
    book=new Book[5];
    book[0]=new Book("SH001","Sherlock Holmes","Ser Arthur Conan Doyle",5);
    book[1]=new Book("DP001","Deception Point","Dan Brown",10);
    book[2]=new Book("TG001","The Godfather","Mario Puzo",0);
    book[3]=new Book("TC001","The Confession","John Grisham",5);
    book[4]=new Book("B001","Brida","Paolo Coelho",5);
    }


    /*@Test public void invalidMessageWhenCustomerChoiceIsIncorrect(){
        assertFalse(new Library().getCustomerChoice('X'));
    }

    @Test public void trueIfCustomerChoiceIsV(){
        assertTrue(new Library().getCustomerChoice('V'));
    }

    @Test public void trueIfCustomerChoiceIsR(){
        assertTrue(new Library().getCustomerChoice('R'));
    }

    @Test public void trueIfCustomerChoiceIsE(){
        assertTrue(new Library().getCustomerChoice('E'));
    }   */

    //
    @Test public void availableBookIsReserved(){
        initialize();
        Library lib=new Library(book);
               assertTrue(lib.reserveBook("TC001"));

    }

    @Test public void outOfStockBookIsNotReserved(){
                initialize();

                assertFalse(new Library(book).reserveBook("TG001"));
    }

    @Test public void unavailableBooksAreNotReserved(){
            initialize();
            assertFalse(new Library(book).reserveBook("AB001"));
    }

    @Test public void singleAvailableBookIsDisplayed(){
            book=new Book[1];
            book[0]=new Book("TG002","The girl with the dragon tattoo","Stieg Larrson",5);         //To store only one book in Library
            assertEquals("TG002 - The girl with the dragon tattoo by Stieg Larrson\n",new Library(book).displayAllBooks());
    }

    @Test public void notificationOnCheckLibraryNumber(){
        initialize();
        {
            assertEquals("Please talk to Librarian. Thank you.",new Library(book).checkLibraryNumber());
        }
    }


}
