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

    BookStub bookArray[];

    public void initialize(){
    bookArray=new BookStub[5];
    bookArray[0]=new BookStub("SH001","Sherlock Holmes","Ser Arthur Conan Doyle",5);
    bookArray[1]=new BookStub("DP001","Deception Point","Dan Brown",10);
    bookArray[2]=new BookStub("TG001","The Godfather","Mario Puzo",1);
    bookArray[3]=new BookStub("TC001","The Confession","John Grisham",5);
    bookArray[4]=new BookStub("B001","Brida","Paolo Coelho",5);
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

    @Test public void availableBookIsReserved(){
        initialize();
        Library lib=new Library(bookArray);
               assertEquals("Thank You! Enjoy the book.", lib.reserveBook("TG001"));
               assertEquals("Sorry, all books of this series have been reserved",lib.reserveBook("TG001"));  //Because now TG001 books are out of Stock
    }

    @Test public void outOfStockBookIsNotReserved(){
                initialize();
               bookArray[3].setIssued(5);
               assertEquals("Sorry, all books of this series have been reserved", new Library(bookArray).reserveBook("TC001"));
    }

    @Test public void unavailableBooksAreNotReserved(){
            initialize();
            assertEquals("Sorry we don't have that book yet.",new Library(bookArray).reserveBook("AB001"));
    }

    @Test public void singleAvailableBookIsDisplayed(){
            bookArray=new BookStub[1];
            bookArray[0]=new BookStub("TG002","The girl with the dragon tattoo","Stieg Larrson",5);
            assertEquals("TG002 - The girl with the dragon tattoo by Stieg Larrson\n",new Library(bookArray).displayAllBooks());
    }

    @Test public void notificationOnCheckLibraryNumber(){
        initialize();
        {
            assertEquals("Please talk to Librarian. Thank you.",new Library(bookArray).checkLibraryNumber());
        }
    }


}
