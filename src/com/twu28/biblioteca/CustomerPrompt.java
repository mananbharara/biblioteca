package com.twu28.biblioteca;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/14/12
 * Time: 6:26 PM
 * To change this template use File | Settings | File Templates.
 */

/*
Handling all the I/O operations
 */
public class CustomerPrompt {

    Library biblioteca;

   public CustomerPrompt(Library lib){

       biblioteca=lib;
       welcomeDisplay();

   }

    //To display Welcome Screen
    public String welcomeDisplay() {
        return "Welcome to Biblioteca\n";
    }

    //To display a menu to customer to choose from.
    public void menuDisplay() {
        char ch='y';
        do{
            System.out.println("Please choose from the following options: \n\nView All Books\nReserve a Book\nCheck your Library Number\nExit\n\nEnter your choice(V,R,C or E): ");
            Scanner sc=new Scanner(System.in);
            System.out.println(getResultsForOptionSelected(sc.next().charAt(0)));

            System.out.println("Would you like to return to menu: ");
            ch=sc.next().charAt(0);
        }while (ch=='y'||ch=='Y');
    }

    //To handle customer input and perform selected operation
    public String getResultsForOptionSelected(char choice) {
        switch (choice){
            case 'V':
                return (biblioteca.displayAllBooks());

            case 'R':
                System.out.print(biblioteca.displayAllBooks());
                System.out.print("Enter Book Id of the Book to reserve: ");
                Scanner sc=new Scanner(System.in);
                if(biblioteca.reserveBook(sc.nextLine())){
                           return "Thank You! Enjoy the book.";
                }
                return "Sorry we don't have that book yet.";

            case 'E':
                System.out.println("Goodbye, Visit Again");
                System.exit(0);
            case 'C':
                return biblioteca.checkLibraryNumber();
        }
        return "Select a valid option!!";
    }
}
