package com.company;

import org.testng.annotations.Test;

public class FirstTestCase {

    // setup
    @Test(priority = 1)
    void setup(){
        System.out.println("Opening browser...");
    }

    //test-logging
    @Test(priority = 2)
    void login(){
        System.out.println("This is logging test...");
    }

    //teardown
    @Test(priority = 3)
    void teardown(){
        System.out.println("Closing browser...");
    }

}