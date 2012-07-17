package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/17/12
 * Time: 10:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConsoleMenu {

    private String Optionsmenu;

    public ConsoleMenu(){
        Optionsmenu="Please choose from the following options: \n" +
                "\n" +
                "View All Books\n" +
                "Reserve a Book\n" +
                "Check your Library Number\n" +
                "Exit\n" +
                "\n";
    }

    public void displayOptionsMenu(){
        System.out.print(Optionsmenu);
    }


}
