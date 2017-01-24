package com.fmr.AP0123;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Client Application 1.0" );
        Login login = new Login();
        System.out.println( "Utils 2.0" +login.getUser("hello"));
    }
}
