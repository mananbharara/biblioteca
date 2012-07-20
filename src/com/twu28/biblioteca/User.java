package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/20/12
 * Time: 11:47 AM
 * To change this template use File | Settings | File Templates.
 */
public class User {

    private String userId;
    private String password;
    private String role;


    public User(String id, String pwrd, String uRole) {
        userId=id;
        password=pwrd;
        role=uRole;
        }

    public String getPassword() {
        return password;
    }

    public String getUserId() {
        return userId;
    }

    public String getRole() {
        return role;
    }
}
