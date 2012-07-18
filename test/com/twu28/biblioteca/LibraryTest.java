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
        ArrayList<Book> book=new ArrayList<Book>();
        book.add(new Book("TG001","The Godfather","Mario Puzo",1));
        Library lib=new Library(book);
        assertTrue(lib.reserveBook("TG001"));

    }

    @Test public void outOfStockBookIsNotReserved(){

        ArrayList<Book> book=new ArrayList<Book>();
        book.add(new Book("TG001","The Godfather","Mario Puzo",0));
        assertFalse(new Library(book).reserveBook("TG001"));
    }

    @Test public void unavailableBooksAreNotReserved(){
        ArrayList<Book> book=new ArrayList<Book>();
        book.add(new Book("TG001","The Godfather","Mario Puzo",1));
            assertFalse(new Library(book).reserveBook("AB001"));
    }

    @Test public void singleAvailableBookIsReturned(){
        ArrayList<Book> book=new ArrayList<Book>();
        book.add(new Book("TG002","The girl with the dragon tattoo","Stieg Larrson",5));         //To store only one book in Library
        assertEquals("TG002 - The girl with the dragon tattoo by Stieg Larrson\n",new Library(book).getAllBooks());
    }

    @Test public void singleAvailableMovieIsReturned(){
        ArrayList<Movie> movies=new ArrayList<Movie>();
        movies.add(new Movie("The Terminal","Steven Spielsberg",8));
        assertEquals("The Terminal Steven Spielsberg 8\n",new Library(null,movies).getAllMovies());
 }




}
