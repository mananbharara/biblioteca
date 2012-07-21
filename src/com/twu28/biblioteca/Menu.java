package com.twu28.biblioteca;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/18/12
 * Time: 12:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class Menu {

    private String optionsMenu;
    public Library biblioteca;
    private Console libraryConsole;
    char optionSelected;
    String currentUserLibraryNumber;


    public Menu(String loggedInUserNumber){
        optionsMenu="Please choose from the following options: \n" +
                "\n" +
                "Books-View All\n" +
                "Reserve a Book\n" +
                "Movies-View All\n"+
                "Check your Library Number\n";
        biblioteca=new Library();
        libraryConsole=new Console();
        currentUserLibraryNumber =loggedInUserNumber;
    }

    public void startMenu(){
        libraryConsole.display(optionsMenu);
        String optionString=libraryConsole.queryUser("Enter your choice(B,R,M,C or E):");
        optionSelected=optionString.charAt(0);
        displayResultsForOption(optionSelected);
    }

    public Library getLibrary(){
        return biblioteca;
    }

    public void displayResultsForOption(char optionSelected) {
        switch (optionSelected){
            case 'B':
                libraryConsole.display(getAllBooksAsString());
                break;
            case 'R':
                //menu.display(getEntities());
                libraryConsole.display(getResultsForOptionR());
                break;
            case 'M':
                libraryConsole.display(getAllMoviesAsString());
                break;
            case 'C':
                libraryConsole.display(getLibraryNumberString());
                break;
            default:
                libraryConsole.display("Select a valid option!!\n");
        }
    }

    private String getAllMoviesAsString() {
        ArrayList<LibraryItem> movies=biblioteca.getEntities('M');
        StringBuffer moviesStringBuffer=new StringBuffer("");
        for(LibraryItem b:movies){
            moviesStringBuffer.append(b.toString() + "\n");
        }
        return moviesStringBuffer.toString();

    }

    private String getAllBooksAsString() {
        ArrayList<LibraryItem> books=biblioteca.getEntities('B');
        StringBuffer booksStringBuffer=new StringBuffer("");
        for(LibraryItem b:books){
            booksStringBuffer.append(b.toString() + "\n");
        }

        return booksStringBuffer.toString();
    }

    private String getLibraryNumberString() {
        if(currentUserLibraryNumber==null){
        return "Please talk to Librarian. Thank you.\n";
        }
        return currentUserLibraryNumber;
    }

    private String getResultsForOptionR() {
        String result;
        String bId = libraryConsole.queryUser("Enter Book Id of the Book to reserve: ");
        if(biblioteca.reserveBook(bId)){
            result="Thank You! Enjoy the book.\n";
        }
        else
            result="Sorry we don't have that book yet.\n";
        return result;
    }


}
