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
    private Console libraryConsole;
    String currentUserLibraryNumber;

    public Menu(String loggedInUserNumber){
        optionsMenu="Please choose from the following options: \n" +
                "\n" +
                "Books-View All\n" +
                "Reserve a Book\n" +
                "Movies-View All\n"+
                "Check your Library Number\n";
        libraryConsole=new Console();
        currentUserLibraryNumber =loggedInUserNumber;
    }

    public void startMenu(){
        libraryConsole.display(optionsMenu);
        String optionString=libraryConsole.queryUser("Enter your choice(B,R,M or C ):");
        displayResultsForOption(optionString.charAt(0));
    }

    public void displayResultsForOption(Character optionSelected){
        try{
            libraryConsole.display(getCorrectResultBuilder(optionSelected).getResult(currentUserLibraryNumber));
        }catch (RuntimeException e){
            libraryConsole.display(e.getMessage());
        }
    }

    private ResultBuilder getCorrectResultBuilder(Character optionSelected) throws RuntimeException {

            if(optionSelected!='B'&&optionSelected!='R'&&optionSelected!='M'&&optionSelected!='C')
            {
                throw new RuntimeException("Select a valid option!!\n");
            }

        ResultBuilder builder;
        HashMap<Character,ResultBuilder> builders = new HashMap<Character,ResultBuilder>();
        builders.put('B',new AllBooksResultBuilder());
        builders.put('R',new BookReservationResultBuilder());
        builders.put('M',new AllMoviesResultBuilder());
        builders.put('C',new LibraryNumberResultBuilder());

        return builders.get(optionSelected);
    }


}
