package com.twu28.biblioteca;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/21/12
 * Time: 8:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class AllBooksResultBuilder implements ResultBuilder {

    public String getResult(String libraryNumber) {
        Library biblioteca=new Library();
        ArrayList<LibraryItem> books=biblioteca.getLibraryItems('B');
        StringBuffer booksStringBuffer=new StringBuffer("");
        for(LibraryItem b:books){
            booksStringBuffer.append(b.toString() + "\n");
        }

        return booksStringBuffer.toString();
    }
}
