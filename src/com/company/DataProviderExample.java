package com.company;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

    @Test(dataProvider = "LoginDataProvider")
    public void loginTest(String email, String pass){
        System.out.println(email+ " " +pass);
    }

    @DataProvider(name = "LoginDataProvider")
    public Object[][] getData(){

        Object [][] data = {{"abc@gmail.com", "abc"}, {"xyz@gmail.com", "xyz"}, {"mno@gmail.com", "mno"}};
        return data;

    }

}