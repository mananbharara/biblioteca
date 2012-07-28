package com.twu28.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/18/12
 * Time: 12:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class Menu {

    ArrayList<Option>options;
    private Console menuConsole;
    String currentUserLibraryNumber;

    public Menu(String loggedInUserNumber, ArrayList<Option> options){
        this.options =options;
        menuConsole =new Console();
        currentUserLibraryNumber =loggedInUserNumber;
    }

    public void startMenu(){
          menuConsole.display("Welcome to Biblioteca!\n\nPlease Choose from the following options: \n");
          for (Option o:options){
              menuConsole.display(o.getOptionName()+"\n");
          }
          Integer userChoice=Integer.parseInt(menuConsole.queryUser("Enter your choice(1-"+options.size()+"):"));
          menuConsole.display(getResultsForOptionSelected(userChoice));
    }

    public String getResultsForOptionSelected(Integer optionSelected){

            if(optionSelected<1||optionSelected>options.size()){
                return "Select a valid option!!\n";
            }
            return ((options.get(optionSelected-1).getResult(currentUserLibraryNumber)));
    }
}
