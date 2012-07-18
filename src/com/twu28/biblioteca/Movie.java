package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/18/12
 * Time: 11:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class Movie {

    String name;
    String director;
    int rating;
    boolean isRated;

    Movie(String movieName,String movieDirector,int movieRating){
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

    public String getMovieInfo() {
        if(isRated){
            return name+" "+director+" "+rating;
        }
        return name+" "+director+" "+"N/A";
    }
}
