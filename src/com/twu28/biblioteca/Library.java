package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/13/12
 * Time: 11:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class Library {

    Book bookArray[];
    Library(){
        bookArray=new Book[5];
        bookArray[0]=new Book("Sherlock Holmes","Ser Arthur Conan Doyle",5);
        bookArray[1]=new Book("Deception Point","Dan Brown",10);
        bookArray[2]=new Book("The Godfather","Mario Puzo",1);
        bookArray[3]=new Book("The Confession","John Grisham",2);
        bookArray[4]=new Book("Brida","Paolo Coelho",5);
    }

    public String welcomeDisplay() {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }
}