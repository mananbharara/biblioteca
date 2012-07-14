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
    bookArray[3]=new BookStub("TC001","The Confession","John Grisham",0);
    bookArray[4]=new BookStub("B001","Brida","Paolo Coelho",5);
    }
    @Test public void customerIsWelcomed(){
        initialize();
        assertEquals("Welcome to Biblioteca\n",new Library(bookArray).welcomeDisplay());

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

               assertTrue(new Library(bookArray).reserveBook("TG001"));
    }

    @Test public void unavailableBookIsNotReserved(){
               assertFalse(new Library(bookArray).reserveBook("TC001"));
    }


}
