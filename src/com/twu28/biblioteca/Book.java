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

    public Book(String bName, String bAuthor, int bCopies, int bIssued) {
        name=bName;
        author=bAuthor;
        numberOfCopies=bCopies;
        numberIssued=bIssued;

    }

    String getInfo(){
        return(name+" by "+author);
    }
}

