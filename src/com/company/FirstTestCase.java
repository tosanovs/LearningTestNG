package com.company;

import org.testng.annotations.Test;

public class FirstTestCase {

    // setup
    @Test
    void setup(){
        System.out.println("Opening browser...");
    }

    //test-logging
    @Test
    void login(){
        System.out.println("This is logging test...");
    }

    //teardown
    @Test
    void teardown(){
        System.out.println("Closing browser...");
    }

}