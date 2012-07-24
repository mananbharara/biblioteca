package com.twu28.biblioteca;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/14/12
 * Time: 7:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class Application {

    static ArrayList<User> users;


    public static void main(String args[]){
        initializeUserList();
        loginAndCreateMenu();
    }

    private static void loginAndCreateMenu() {
        Console console=new Console();
        console.display("Login:\n");
        String libraryNumber=console.queryUser("Enter your Library Number: ");
        String password=console.queryUser("Enter Password: ");
        Menu menu;
        if(new UserManager(users).validateUser(libraryNumber, password)){
            console.display("Login Successful!\n");
            menu=new Menu(libraryNumber);
        }
        else {
            console.display("Login Failed!\n");
            menu=new Menu(null);
        }
        menu.startMenu();
    }

    public static void initializeUserList(){
        users=new ArrayList<User>();
        users.add(new User("111-11111", "aaaaa", "Librarian"));
        users.add(new User("111-11112", "aaaab", "Customer"));
    }

}
