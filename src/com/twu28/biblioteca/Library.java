package com.twu28.biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/13/12
 * Time: 11:07 PM
 * To change this template use File | Settings | File Templates.
 */


public class Library {

    ArrayList<LibraryItem> libraryItems;                       //To store the items available in the library

    Library(ArrayList<LibraryItem> items){

        libraryItems =items;
    }


   //To Reserve a book with Book Id bId
   public boolean reserveBook(String bId) {
        for(LibraryItem b: libraryItems){
            if(b instanceof Book){
                Book bookToReserve= (Book) b;
                if((bookToReserve.getId()).equals(bId)){
                    return bookToReserve.reserve();
                }
            }

        }
             return false;
    }

    //To Display a list of all items available with the Library

    public <T> ArrayList<LibraryItem> getAllItems(Class<T> cl)
    {

        ArrayList<LibraryItem> list=new ArrayList<LibraryItem>();
        for(LibraryItem libraryItem:libraryItems){
            if(cl.isInstance(libraryItem)){
                list.add(libraryItem);
            }
        }

        return list;
    }


}
