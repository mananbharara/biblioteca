package com.twu28.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/13/12
 * Time: 11:07 PM
 * To change this template use File | Settings | File Templates.
 */


public class Library {

    ArrayList<Book> book;                       //To store the books available in the library
    ArrayList<Movie> movies;
    Library(){
        book=new ArrayList<Book>();
        book.add(new Book("SH001","Sherlock Holmes","Ser Arthur Conan Doyle",5));
        book.add(new Book("DP001","Deception Point","Dan Brown",10));
        book.add(new Book("TG001","The Godfather","Mario Puzo",1));
        book.add(new Book("TC001","The Confession","John Grisham",5));
        book.add(new Book("B001","Brida","Paolo Coelho",0));

        movies=new ArrayList<Movie>();
        movies.add(new Movie("Sholay","Ramesh Sippy",8));
        movies.add(new Movie("The Departed","Martin Scorsese",9));
        movies.add(new Movie("Blood Diamond","Edward Zwick",8));
        movies.add(new Movie("Rockstar","Imtiaz Ali"));
        movies.add(new Movie("Cocktail","Homi Adjania"));

    }


   //To Reserve a book with Book Id bId
   public boolean reserveBook(String bId) {
        for(Book b:book){
            if((b.getId()).equals(bId)){
                return b.reserve();
            }
        }
             return false;
    }

    //To Display a list of all books available with the Library
    public ArrayList<LibraryItem> getEntities(char entity) {
        return listBuilder(entity);
    }

    public ArrayList<LibraryItem> listBuilder(char entity){
        ArrayList entityList = null;
        switch (entity){
            case 'B':
                entityList=book;
                break;
            case 'M':
                entityList= movies;
                break;
        }
        return entityList;
    }


}
