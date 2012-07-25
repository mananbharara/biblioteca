package com.twu28.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/24/12
 * Time: 3:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class OptionsTest {

    @Test public void allOptionsAreDisplayed()throws Exception{
        String expected="Books-View All\n" +
                "Reserve a Book\n" +
                "Movies-View All\n"+
                "Check Library Number\n"+
                "Enter your choice(B,R,M or C):";
        assertEquals(expected,new Options().getAllOptions());
    }

    @Test public void InvalidMessageIfIncorrectOptionSelected()throws Exception{
        assertEquals("Select a valid option!!\n",new Options().getResultsForOptionSelected('X',null));
    }


}
