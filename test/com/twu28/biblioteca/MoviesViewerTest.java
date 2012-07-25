package com.twu28.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/24/12
 * Time: 2:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class MoviesViewerTest {
    @Test
    public void optionNameIsCorrect()throws Exception{
        assertEquals("Movies-View All",new MoviesViewer().getOptionName());
    }

    @Test public void allMoviesDisplayedIfCustomerChoiceIsM() throws Exception{
        String expected="Sholay Ramesh Sippy 8/10\n" +
                "The Departed Martin Scorsese 9/10\n" +
                "Blood Diamond Edward Zwick 8/10\n" +
                "Rockstar Imtiaz Ali N/A\n" +
                "Cocktail Homi Adjania N/A\n" +
                "The Dark Knight Rises Christopher Nolan N/A\n" +
                "Shawshank Redemption Frank Darabont 9/10\n" +
                "The Godfather Francis Ford Coppola 9/10\n" +
                "The Dark Knight Christopher Nolan 8/10\n" +
                "Inception Christopher Nolan 9/10\n" +
                "Forrest Gump Robert Zemeckis 7/10\n" +
                "Memento Christopher Nolan 8/10\n" +
                "Wall-E Andrew Stanton 9/10\n" +
                "The Illusionist Neil Burger 8/10\n" +
                "The Prestige Christopher Nolan 7/10\n";
        assertEquals(expected,new MoviesViewer().getResult(null));
    }

}
