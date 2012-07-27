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
    static ArrayList<Option>options;


    public static void main(String args[]){
        initializeUserList();
        initializeOptions();
        loginAndCreateMenu();
    }

    private static void loginAndCreateMenu() {
        Console console=new Console();
        console.display("Login:\n");
        String libraryNumber=console.queryUser("Enter your Library Number: ");
        String password=console.queryUser("Enter Password: ");
        Menu menu;
        if(new UserManager(users).validateUser(new User(libraryNumber, password))){
            console.display("Login Successful!\n");
            menu=new Menu(libraryNumber, options);
        }
        else {
            console.display("Login Failed!\n");
            menu=new Menu(null, options);
        }
        menu.startMenu();
    }

    public static void initializeUserList(){
        users=new ArrayList<User>();
        users.add(new User("111-11111", "aaaaa"));
        users.add(new User("111-11112", "aaaab"));
    }

    public static void initializeOptions(){
        options=new ArrayList<Option>();
        options.add(new BooksViewer());
        options.add(new BookReservation());
        options.add(new MoviesViewer());
        options.add(new LibraryNumberViewer());
    }

}
