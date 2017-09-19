package com.javarticles.dagger.daggerExample;

/**
 * Simple app to test injection via dagger
 */
public class App 
{
    public static void main( String[] args )
    {
        AppComponent appComponent = DaggerAppComponent.create();
        System.out.println(appComponent.foo());
    }
}