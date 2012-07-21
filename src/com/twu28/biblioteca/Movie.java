package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/18/12
 * Time: 11:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class Movie implements LibraryItem {

    private String name;
    private String director;
    private int rating;
    private boolean isRated;

    public Movie(String movieName,String movieDirector,int movieRating){
        name=movieName;
        director=movieDirector;
        isRated=true;
        rating=movieRating;
    }

    public Movie(String movieName, String movieDirector) {
        name=movieName;
        director=movieDirector;
        isRated=false;
    }

    @Override
    public String toString() {
        if(isRated){
            return name+" "+director+" "+rating+"/10";
        }
        return name+" "+director+" "+"N/A";
    }
}
