package com.twu28.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/24/12
 * Time: 3:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class Options {
    ArrayList<Option> options;
    Console console;

    public Options(){
        options=new ArrayList<Option>();
        options.add(new BooksViewer());
        options.add(new BookReservation());
        options.add(new MoviesViewer());
        options.add(new LibraryNumberViewer());
        console=new Console();
    }

    public String getAllOptions(){
        StringBuffer optionsBuffer=new StringBuffer("");
        for (Option o:options){
            optionsBuffer.append(o.getOptionName() + "\n");
        }
        optionsBuffer.append("Enter your choice(B,R,M or C):");
        return optionsBuffer.toString();
    }


    public String getResultsForOptionSelected(Character userInput, String libraryNumber) {
        try{
            return (chooseCorrectOption(userInput).getResult(libraryNumber));
        }catch (RuntimeException e){
            return (e.getMessage());
        }
    }

    private Option chooseCorrectOption(Character optionSelected) throws RuntimeException {

        if(optionSelected!='B'&&optionSelected!='R'&&optionSelected!='M'&&optionSelected!='C')
        {
            throw new RuntimeException("Select a valid option!!\n");
        }
        HashMap<Character,Option> options = new HashMap<Character,Option>();
        options.put('B', new BooksViewer());
        options.put('R', new BookReservation());
        options.put('M', new MoviesViewer());
        options.put('C', new LibraryNumberViewer());

        return options.get(optionSelected);
    }
}
