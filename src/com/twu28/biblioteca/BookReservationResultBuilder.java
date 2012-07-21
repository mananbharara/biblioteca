package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/21/12
 * Time: 8:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class BookReservationResultBuilder implements ResultBuilder {


    @Override
    public String getResult(String libraryNumber) {
        Library biblioteca=new Library();
        String result;
        String bId = new Console().queryUser("Enter Book Id of the Book to reserve: ");
        if(biblioteca.reserveBook(bId)){
            result="Thank You! Enjoy the book.\n";
        }
        else
            result="Sorry we don't have that book yet.\n";
        return result;
    }
}
