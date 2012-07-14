package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/13/12
 * Time: 11:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class Library {

    Book bookArray[];
    Library(Book bArray[]){

                 bookArray=bArray;
    }

    public String welcomeDisplay() {
        return "Welcome to Biblioteca\n";  //To change body of created methods use File | Settings | File Templates.
    }

    public String menuDisplay() {
        return("Please choose from the following options: \n\n1. View All Books\n2. Reserve a Book\n3. Exit\n\nEnter your choice(V,R or E): ");
    }

    /*public boolean getCustomerChoice(char choice) {
        switch (choice){
            case 'V':
                displayAllBooks();
                return true;
            case 'R':
                return true;
            case 'E':
                return true;
        }
        return false;  //To change body of created methods use File | Settings | File Templates.
    }*/




    public String reserveBook(String bId) {

        for(int i=0;i<bookArray.length;++i){
            if((bookArray[i].getId()).equals(bId)){
                if(bookArray[i].decreaseCount()){
                    return "Thank You! Enjoy the book.";
                }
                else{
                    return "Sorry, all books of this series have been reserved";
                }
            }
        }
             return "Sorry we don't have that book yet.";

    }

    public String displayAllBooks() {
        StringBuffer allBookInfo=new StringBuffer("");
        for(int i=0;i<bookArray.length;++i){
             allBookInfo.append(bookArray[i].getInfo()+" "+bookArray[i].getId()+"\n");
        }
        return (allBookInfo.toString());
    }
}
