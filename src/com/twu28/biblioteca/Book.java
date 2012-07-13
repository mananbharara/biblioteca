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
    private int numberIssued;

    boolean isAvailable(){
        if(numberOfCopies-numberIssued>0){
            return true;
        }
        return false;
    }

    public Book(String bName, String bAuthor, int bCopies) {
        name=bName;
        author=bAuthor;
        numberOfCopies=bCopies;
        numberIssued=0;

    }

    String getInfo(){
        return(name+" by "+author);
    }
    boolean decreaseCount(){
        if(isAvailable()){
        ++numberIssued;
        return true;
        }
        return false;
    }

    void setIssued(int bIssued){
        numberIssued=bIssued;
    }
}

