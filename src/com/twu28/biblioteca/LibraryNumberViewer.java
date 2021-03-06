package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/21/12
 * Time: 8:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class LibraryNumberViewer implements ILibraryNumberViewer {


    private String name;

    public LibraryNumberViewer(){
        name="Check Library Number";
    }

    @Override
    public String getResult(String libraryNumber) {
        if(libraryNumber==null){
        return "Please talk to Librarian. Thank you.\n";
        }
        return libraryNumber+"\n";
    }

    @Override
    public String getOptionName() {
        return name;
    }
}
