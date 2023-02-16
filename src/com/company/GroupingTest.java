package com.company;

import org.testng.annotations.Test;

public class GroupingTest {


    @Test(groups = {"regression"})
    void test1(){
        System.out.println("This is test1");
    }

    @Test(groups = {"smoke"})
    void test2(){
        System.out.println("This is test2");
    }

    @Test(groups = {"regression", "smoke"})
    void test3(){
        System.out.println("This is test3");
    }

    @Test(groups = "smoke")
    void test4(){
        System.out.println("This is test4");
    }

    @Test(groups = {"regression"})
    void test5(){
        System.out.println("This is test5");
    }

}
