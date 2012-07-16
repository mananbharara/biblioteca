package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/14/12
 * Time: 7:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class RunAtConsole {

    public static void main(String args[]){
        char ch='y';
        Book book[]=new Book[5];
            book[0]=new Book("SH001","Sherlock Holmes","Ser Arthur Conan Doyle",5);
            book[1]=new Book("DP001","Deception Point","Dan Brown",10);
            book[2]=new Book("TG001","The Godfather","Mario Puzo",1);
            book[3]=new Book("TC001","The Confession","John Grisham",5);
            book[4]=new Book("B001","Brida","Paolo Coelho",5);
        Library lib=new Library(book);
        CustomerPrompt bibliotecaCI=new CustomerPrompt(lib);
        bibliotecaCI.menuDisplay();
    }
}
