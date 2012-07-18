package com.twu28.biblioteca;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/13/12
 * Time: 11:07 PM
 * To change this template use File | Settings | File Templates.
 */


public class Library {

    ArrayList<Book> book;                       //To store the books available in the library
    Library(ArrayList<Book> bList){

                book =bList;
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
    public String getAllBooks() {
        StringBuffer allBookInfo=new StringBuffer("");
        for(Book b:book){
             allBookInfo.append(b.getId()+" - "+ b.getInfo()+"\n");
        }
        return (allBookInfo.toString());
    }
}
