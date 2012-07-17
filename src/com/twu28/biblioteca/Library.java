package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/13/12
 * Time: 11:07 PM
 * To change this template use File | Settings | File Templates.
 */


public class Library {

    Book book[];                       //To store the books available in the library
    Library(Book bArray[]){

                 book =bArray;
    }

   //To Reserve a book with Book Id bId
   public boolean reserveBookWithId(String bId) {

        for(int i=0;i< book.length;++i){
            if((book[i].getId()).equals(bId)){
                if(book[i].decreaseCount()){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
             return false;

    }

    //To Display a list of all books available with the Library
    public String displayAllBooks() {
        StringBuffer allBookInfo=new StringBuffer("");
        for(int i=0;i< book.length;++i){
             allBookInfo.append(book[i].getId()+" - "+ book[i].getInfo()+"\n");
        }
        return (allBookInfo.toString());
    }

    //To allow the checking of a library number and notify
    public String checkLibraryNumber() {
        return "Please talk to Librarian. Thank you.";
    }
}
