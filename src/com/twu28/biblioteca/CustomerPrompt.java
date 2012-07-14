package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/14/12
 * Time: 6:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class CustomerPrompt {

    Library biblioteca;

   public CustomerPrompt(Library lib){
       biblioteca=lib;
   }

    public String welcomeDisplay() {
        return "Welcome to Biblioteca\n";  //To change body of created methods use File | Settings | File Templates.
    }

    public String menuDisplay() {
        return("Please choose from the following options: \n\n1. View All Books\n2. Reserve a Book\n3. Exit\n\nEnter your choice(V,R or E): ");
    }

    public String performActionSelected(char choice) {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }
}
