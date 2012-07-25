package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/18/12
 * Time: 12:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class Menu {

    private Options options;
    private Console menuConsole;
    String currentUserLibraryNumber;

    public Menu(String loggedInUserNumber){
        options=new Options();
        menuConsole =new Console();
        currentUserLibraryNumber =loggedInUserNumber;
    }

    public void startMenu(){
        String userChoiceString=menuConsole.queryUser("Please choose from the following options: \n" + options.getAllOptions());
        menuConsole.display(options.getResultsForOptionSelected(userChoiceString.charAt(0), currentUserLibraryNumber));
    }
}
