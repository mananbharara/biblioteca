package com.twu28.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/13/12
 * Time: 11:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class LibraryTest {

    @Test public void availableBookIsReserved()throws Exception{
        ArrayList<LibraryItem>libraryItems=new ArrayList<LibraryItem>();
        libraryItems.add(new Book("SH001", "Sherlock Holmes", "Ser Arthur Conan Doyle", 5));
        assertTrue(new Library(libraryItems).reserveBook("SH001"));

    }

    @Test public void outOfStockBookIsNotReserved(){
        ArrayList<LibraryItem>libraryItems=new ArrayList<LibraryItem>();
        libraryItems.add(new Book("B001", "Brida", "Paolo Coelho", 0));
        assertFalse(new Library(libraryItems).reserveBook("B001"));
    }

    @Test public void unavailableBooksAreNotReserved(){
        assertFalse(new Library(new ArrayList<LibraryItem>()).reserveBook("AB001"));
    }

    @Test public void AllBooksAreReturned(){
        ArrayList<LibraryItem>libraryItems=new ArrayList<LibraryItem>();
        libraryItems.add(new Book("SH001", "Sherlock Holmes", "Ser Arthur Conan Doyle", 5));
        libraryItems.add(new Book("B001", "Brida", "Paolo Coelho", 0));
        assertEquals(libraryItems.toString(),new Library(libraryItems).getAllItems(Book.class).toString());
    }

    @Test public void singleAvailableMovieIsReturned(){
        ArrayList<LibraryItem> libraryItems =new ArrayList<LibraryItem>();
        libraryItems.add(new Movie("Sholay", "Ramesh Sippy", 8));
        libraryItems.add(new Movie("The Departed", "Martin Scorsese", 9));
        assertEquals(libraryItems.toString(), new Library(libraryItems).getAllItems(Movie.class).toString());
 }




}
