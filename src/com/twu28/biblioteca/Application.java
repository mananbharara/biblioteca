package com.twu28.biblioteca;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/14/12
 * Time: 7:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class Application {

    static ArrayList<Book> book;
    static ArrayList<Movie> movies;

    public static void main(String args[]){
        initializeBookAndMovieCollection();
        Library biblioteca=new Library(book,movies);
        Menu menu=new Menu(biblioteca);
        menu.startMenu();
    }

    public static void initializeBookAndMovieCollection(){
        book=new ArrayList<Book>();
        book.add(new Book("SH001","Sherlock Holmes","Ser Arthur Conan Doyle",5));
        book.add(new Book("DP001","Deception Point","Dan Brown",10));
        book.add(new Book("TG001","The Godfather","Mario Puzo",1));
        book.add(new Book("TC001","The Confession","John Grisham",5));
        book.add(new Book("B001","Brida","Paolo Coelho",5));

        movies=new ArrayList<Movie>();
        movies.add(new Movie("Sholay","Ramesh Sippy",8));
        movies.add(new Movie("The Departed","Martin Scorsese",9));
        movies.add(new Movie("Blood Diamond","Edward Zwick",8));
        movies.add(new Movie("Rockstar","Imtiaz Ali"));
        movies.add(new Movie("Cocktail","Homi Adjania"));
    }
}
