package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/14/12
 * Time: 7:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class Application {


    public static void main(String args[]){
        loginAndCreateMenu();
    }

    private static void loginAndCreateMenu() {
        Console console=new Console();
        console.display("Login:\n");
        String libraryNumber=console.queryUser("Enter your Library Number: ");
        String password=console.queryUser("Enter Password: ");
        Menu menu;
        if(new UserManager().validateUser(libraryNumber, password)){
            console.display("Login Successful!");
            menu=new Menu(libraryNumber);
        }
        else {
            console.display("Login Failed!");
            menu=new Menu(null);
        }
        menu.startMenu();
    }

}
