package com.twu28.biblioteca;

import java.util.Scanner;

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
        switch (choice){
            case 'V':
                biblioteca.displayAllBooks();
                break;
            case 'R':
                biblioteca.displayAllBooks();
                System.out.print("Enter Book Id of the Book to reserve: ");
                Scanner sc=new Scanner(System.in);
                biblioteca.reserveBook(sc.nextLine());
                break;
            case 'E':
                System.exit(0);

        }
        return "Select a valid option!!";  //To change body of created methods use File | Settings | File Templates.
    }
}
