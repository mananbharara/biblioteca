package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/18/12
 * Time: 12:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class Menu {

    private String optionsMenu;
    private Library biblioteca;
    private Console libraryConsole;

    public Menu(Library lib){
        optionsMenu="Please choose from the following options: \n" +
                "\n" +
                "View All Books\n" +
                "Reserve a Book\n" +
                "View All Movies\n"+
                "Check your Library Number\n" +
                "Exit\n";
        biblioteca=lib;
        libraryConsole=new Console();
    }

    public void startMenu(){
        libraryConsole.display(optionsMenu);
        String optionSelected=libraryConsole.queryUser("Enter your choice(B,R,M,C or E):");
        displayResultsForOption(optionSelected.charAt(0));
    }


    public void displayResultsForOption(char optionSelected) {
        switch (optionSelected){
            case 'B':
                libraryConsole.display(biblioteca.getAllBooks());
                break;
            case 'R':
                //menu.display(getAllBooks());
                String bId = libraryConsole.queryUser("Enter Book Id of the Book to reserve: ");
                if(biblioteca.reserveBook(bId)){
                    libraryConsole.display("Thank You! Enjoy the book.\n");
                }
                else
                    libraryConsole.display("Sorry we don't have that book yet.\n");
                break;
            case 'M':
                libraryConsole.display(biblioteca.getAllMovies());
                break;
            case 'E':
                libraryConsole.exitApplication();
                break;
            case 'C':
                libraryConsole.display("Please talk to Librarian. Thank you.\n");
                break;
            default:
                libraryConsole.display("Select a valid option!!\n");
        }
    }
}
