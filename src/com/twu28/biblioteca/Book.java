package com.twu28.biblioteca;


/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/13/12
 * Time: 5:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class Book {

    private String name;
    private String author;
    private int numberOfCopies;
    int numberIssued;
    private String id;

    public Book(String bId, String bName, String bAuthor, int bCopies) {
        name=bName;
        author=bAuthor;
        numberOfCopies=bCopies;
        numberIssued=0;
        id=bId;
        }

    //To check if a book is available
    boolean isAvailable(){
        if(numberOfCopies-numberIssued>0){
            return true;
        }
        return false;
    }

    //To return book info
    String getInfo(){
        return(name+" by "+author);
    }

    //To return book id
    String getId(){
        return id;
    }

    //To decrease the available book count and increase the issued book count
    boolean decreaseCount(){
        if(isAvailable()){
        ++numberIssued;
        return true;
        }
        return false;
    }


}

