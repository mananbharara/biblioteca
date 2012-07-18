package com.twu28.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/18/12
 * Time: 11:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class MovieTest {

    @Test public void movieInfoIsDisplayedWhenRatingAvailable()throws Exception{
        assertEquals("Sholay Ramesh Sippy 8/10",new Movie("Sholay","Ramesh Sippy",8).toString());
    }

    @Test public void NAIsDisplayedWhenRatingNotAvailable() throws  Exception{
        assertEquals("Prometheus Ridley Scott N/A",new Movie("Prometheus","Ridley Scott").toString());

    }
}
