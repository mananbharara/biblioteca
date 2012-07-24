package com.twu28.biblioteca;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/18/12
 * Time: 12:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class Menu {

    private String optionsMenu;
    private Console menuConsole;
    String currentUserLibraryNumber;

    public Menu(String loggedInUserNumber){
        optionsMenu="Please choose from the following options: \n" +
                "\n" +
                "Books-View All\n" +
                "Reserve a Book\n" +
                "Movies-View All\n"+
                "Check your Library Number\n";
        menuConsole =new Console();
        currentUserLibraryNumber =loggedInUserNumber;
    }

    public void startMenu(){
        menuConsole.display(optionsMenu);
        String optionString= menuConsole.queryUser("Enter your choice(B,R,M or C):");
        displayResultsForOption(optionString.charAt(0));
    }

    public void displayResultsForOption(Character optionSelected){
        try{
            menuConsole.display(getCorrectResultBuilder(optionSelected).getResult(currentUserLibraryNumber));
        }catch (RuntimeException e){
            menuConsole.display(e.getMessage());
        }
    }

    private Option getCorrectResultBuilder(Character optionSelected) throws RuntimeException {

            if(optionSelected!='B'&&optionSelected!='R'&&optionSelected!='M'&&optionSelected!='C')
            {
                throw new RuntimeException("Select a valid option!!\n");
            }
        HashMap<Character,Option> builders = new HashMap<Character,Option>();
        builders.put('B',new BooksViewer());
        builders.put('R',new BookReservation());
        builders.put('M',new MoviesViewer());
        builders.put('C',new LibraryNumberViewer());

        return builders.get(optionSelected);
    }


}
