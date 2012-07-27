package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/27/12
 * Time: 8:54 PM
 * To change this template use File | Settings | File Templates.
 */
public interface IMoviesViewer extends Option {
    String getOptionName();

    @Override
    String getResult(String libraryNumber);
}
