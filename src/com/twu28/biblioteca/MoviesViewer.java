package com.twu28.biblioteca;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/21/12
 * Time: 8:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class MoviesViewer implements Option {


    public String getResult(String libraryNumber) {
        Library biblioteca=new Library();
        ArrayList<LibraryItem> movies=biblioteca.getAllItems(Movie.class);
        StringBuffer moviesStringBuffer=new StringBuffer("");
        for(LibraryItem b:movies){
            moviesStringBuffer.append(b.toString() + "\n");
        }
        return moviesStringBuffer.toString();

    }
}
