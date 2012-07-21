package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/20/12
 * Time: 11:47 AM
 * To change this template use File | Settings | File Templates.
 */
public class User {

    private String libraryNumber;
    private String password;
    private String role;


    public User(String userLibraryNumber, String userPassword, String userRole) {
        libraryNumber =userLibraryNumber;
        password=userPassword;
        role=userRole;
        }

    public String getPassword() {
        return password;
    }

    public String getLibraryNumber() {
        return libraryNumber;
    }

    public String getRole() {
        return role;
    }
}
