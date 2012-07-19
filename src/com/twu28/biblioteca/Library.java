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
    Library(ArrayList<Book> bList){
               book =bList;
                }
    Library(ArrayList<Book> bookList,ArrayList<Movie>movieList){
        book=bookList;
        movies=movieList;
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
    public ArrayList getEntities(char entity) {
        return listBuilder(entity);
    }

    public ArrayList listBuilder(char entity){
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
