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


    public User(String userLibraryNumber, String userPassword) {
        libraryNumber =userLibraryNumber;
        password=userPassword;
        }

    public String getPassword() {
        return password;
    }

    public String getLibraryNumber() {
        return libraryNumber;
    }


    public boolean equals(Object obj){
        if(obj instanceof User){
            User user=(User)obj;
            if(libraryNumber.equals(user.getLibraryNumber())&&password.equals(user.getPassword())){
                return true;
            }
        }
        return false;
    }

}
