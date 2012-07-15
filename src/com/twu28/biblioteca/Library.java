package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/13/12
 * Time: 11:07 PM
 * To change this template use File | Settings | File Templates.
 */


public class Library {

    Book bookArray[];
    Library(Book bArray[]){

                 bookArray=bArray;
    }

   //To Reserve a book with Book Id bId
   public String reserveBook(String bId) {

        for(int i=0;i<bookArray.length;++i){
            if((bookArray[i].getId()).equals(bId)){
                if(bookArray[i].decreaseCount()){
                    return "Thank You! Enjoy the book.";
                }
                else{
                    return "Sorry, all books of this series have been reserved";
                }
            }
        }
             return "Sorry we don't have that book yet.";

    }

    //To Display a list of all books available with the Library
    public String displayAllBooks() {
        StringBuffer allBookInfo=new StringBuffer("");
        for(int i=0;i<bookArray.length;++i){
             allBookInfo.append(bookArray[i].getId()+" - "+bookArray[i].getInfo()+"\n");
        }
        return (allBookInfo.toString());
    }

    //To allow the checking of a library number and notify
    public String checkLibraryNumber() {
        return "Please talk to Librarian. Thank you.";
    }
}
