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

    ArrayList<LibraryItem> libraryItems;                       //To store the items available in the library

    Library(){
        libraryItems =new ArrayList<LibraryItem>();
        libraryItems.add(new Book("SH001", "Sherlock Holmes", "Ser Arthur Conan Doyle", 5));
        libraryItems.add(new Book("DP001", "Deception Point", "Dan Brown", 10));
        libraryItems.add(new Book("TG001", "The Godfather", "Mario Puzo", 1));
        libraryItems.add(new Book("TC001", "The Confession", "John Grisham", 5));
        libraryItems.add(new Book("B001", "Brida", "Paolo Coelho", 0));

        libraryItems.add(new Movie("Sholay", "Ramesh Sippy", 8));
        libraryItems.add(new Movie("The Departed", "Martin Scorsese", 9));
        libraryItems.add(new Movie("Blood Diamond", "Edward Zwick", 8));
        libraryItems.add(new Movie("Rockstar", "Imtiaz Ali"));
        libraryItems.add(new Movie("Cocktail", "Homi Adjania"));
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

    //To Display a list of all books available with the Library
    public ArrayList<LibraryItem> getLibraryItems(char entity) {
        return listBuilder(entity);
    }

    public ArrayList<LibraryItem> listBuilder(char requiredItem){
        ArrayList<LibraryItem> itemList=new ArrayList<LibraryItem>();
        switch (requiredItem){
            case 'B':
                for (LibraryItem b:libraryItems)
                {
                    if(b instanceof Book){
                        itemList.add(b);
                    }
                }
                break;
            case 'M':
                for (LibraryItem m:libraryItems)
                {
                    if(m instanceof Movie){
                        itemList.add(m);
                    }
                }
                break;
        }
        return itemList;
    }


}
