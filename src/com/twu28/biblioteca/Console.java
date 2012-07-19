package com.twu28.biblioteca;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/17/12
 * Time: 10:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class Console {
    public void display(String displayData){
        System.out.print(displayData);
    }

    public String queryUser(String query) {
        System.out.println(query);
        Scanner sc=new Scanner(System.in);
        return(sc.nextLine());
    }

    public void exitApplication() {
        System.out.println("Goodbye, Visit Again");

    }
}
