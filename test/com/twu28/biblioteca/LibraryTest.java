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

    ArrayList<LibraryItem> libraryItems;

    public void initializeBooks(){
        libraryItems=new ArrayList<LibraryItem>();
        libraryItems.add(new Book("SH001", "Sherlock Holmes", "Ser Arthur Conan Doyle", 5));
        libraryItems.add(new Book("DP001", "Deception Point", "Dan Brown", 10));
        libraryItems.add(new Book("TG001", "The Godfather", "Mario Puzo", 1));
        libraryItems.add(new Book("TC001", "The Confession", "John Grisham", 5));
        libraryItems.add(new Book("B001", "Brida", "Paolo Coelho", 5));
    }

    public void initializeMovies(){
        libraryItems=new ArrayList<LibraryItem>();
        libraryItems.add(new Movie("Sholay","Ramesh Sippy",8));
        libraryItems.add(new Movie("The Departed","Martin Scorsese",9));
        libraryItems.add(new Movie("Blood Diamond","Edward Zwick",8));
        libraryItems.add(new Movie("Rockstar","Imtiaz Ali"));
        libraryItems.add(new Movie("Cocktail","Homi Adjania"));
    }

    @Test public void availableBookIsReserved()throws Exception{
        Library lib=new Library();
        assertTrue(lib.reserveBook("TG001"));

    }

    @Test public void outOfStockBookIsNotReserved(){

        assertFalse(new Library().reserveBook("B001"));
    }

    @Test public void unavailableBooksAreNotReserved(){
        assertFalse(new Library().reserveBook("AB001"));
    }

    @Test public void singleAvailableBookIsReturned(){
        initializeBooks();
        assertEquals(libraryItems.toString(),new Library().getEntities('B').toString());
    }

    @Test public void singleAvailableMovieIsReturned(){
        initializeMovies();
        assertEquals(libraryItems.toString(), new Library().getEntities('M').toString());
 }




}
