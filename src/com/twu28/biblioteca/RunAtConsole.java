package com.twu28.biblioteca;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/14/12
 * Time: 7:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class RunAtConsole {

    public static void main(String args[]){
        ArrayList<Book> book=new ArrayList<Book>();
            book.add(new Book("SH001","Sherlock Holmes","Ser Arthur Conan Doyle",5));
            book.add(new Book("DP001","Deception Point","Dan Brown",10));
            book.add(new Book("TG001","The Godfather","Mario Puzo",1));
            book.add(new Book("TC001","The Confession","John Grisham",5));
            book.add(new Book("B001","Brida","Paolo Coelho",5));
        Library biblioteca=new Library(book);
        Menu menu=new Menu(biblioteca);
        menu.startMenu();
    }
}
