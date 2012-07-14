package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/14/12
 * Time: 3:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class BookStub extends Book {
    String id;
    public BookStub(String bId, String bName, String bAuthor, int bCopies) {
        super(bName, bAuthor, bCopies);
        id=bId;
    }

    void setIssued(int bIssued){
        numberIssued=bIssued;
    }
}
