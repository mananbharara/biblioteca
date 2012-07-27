package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: Manan
 * Date: 7/27/12
 * Time: 8:53 PM
 * To change this template use File | Settings | File Templates.
 */
public interface ILibraryNumberViewer extends Option {
    @Override
    String getResult(String libraryNumber);

    String getOptionName();
}
