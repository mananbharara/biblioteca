package com.twu28.biblioteca;

import java.util.Random;

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

    boolean isAvailable(){
        if(numberOfCopies-numberIssued>0){
            return true;
        }
        return false;
    }

    public Book(String bId, String bName, String bAuthor, int bCopies) {
        name=bName;
        author=bAuthor;
        numberOfCopies=bCopies;
        numberIssued=0;
        id=bId;
        }

    String getInfo(){
        return(name+" by "+author);
    }

    String getId(){
        return id;
    }
    boolean decreaseCount(){
        if(isAvailable()){
        ++numberIssued;
        return true;
        }
        return false;
    }


}

