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
       char ch='y';
       biblioteca=lib;
       welcomeDisplay();
       do{
            menuDisplay();
            Scanner sc=new Scanner(System.in);
            System.out.println(performActionSelected(sc.next().charAt(0)));
            System.out.println("Would you like to return to menu: ");
            ch=sc.next().charAt(0);
       }while (ch=='y'||ch=='Y');
   }

    public String welcomeDisplay() {
        return "Welcome to Biblioteca\n";  //To change body of created methods use File | Settings | File Templates.
    }

    public void menuDisplay() {
        System.out.println("Please choose from the following options: \n\nView All Books\nReserve a Book\nExit\n\nEnter your choice(V,R or E): ");
    }

    public String performActionSelected(char choice) {
        switch (choice){
            case 'V':
                return (biblioteca.displayAllBooks());

            case 'R':
                System.out.print(biblioteca.displayAllBooks());
                System.out.print("Enter Book Id of the Book to reserve: ");
                Scanner sc=new Scanner(System.in);
                return biblioteca.reserveBook(sc.nextLine());

            case 'E':
                System.out.println("Goodbye, Visit Again");
                System.exit(0);

        }
        return "Select a valid option!!";  //To change body of created methods use File | Settings | File Templates.
    }
}
