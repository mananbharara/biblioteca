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
        libraryItems.add(new Movie("The Dark Knight Rises", "Christopher Nolan"));
        libraryItems.add(new Movie("Shawshank Redemption", "Frank Darabont",9));
        libraryItems.add(new Movie("The Godfather", "Francis Ford Coppola",9));
        libraryItems.add(new Movie("The Dark Knight", "Christopher Nolan",8));
        libraryItems.add(new Movie("Inception", "Christopher Nolan",9));
        libraryItems.add(new Movie("Forrest Gump", "Robert Zemeckis",7));
        libraryItems.add(new Movie("Memento", "Christopher Nolan",8));
        libraryItems.add(new Movie("Wall-E", "Andrew Stanton",9));
        libraryItems.add(new Movie("The Illusionist", "Neil Burger",8));
        libraryItems.add(new Movie("The Prestige", "Christopher Nolan",7));
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

    @Test public void AllBooksAreReturned(){
        initializeBooks();
        assertEquals(libraryItems.toString(),new Library().getAllItems(Book.class).toString());
    }

    @Test public void singleAvailableMovieIsReturned(){
        initializeMovies();
        assertEquals(libraryItems.toString(), new Library().getAllItems(Movie.class).toString());
 }




}
