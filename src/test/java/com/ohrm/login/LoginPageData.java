package com.ohrm.login;

import org.testng.annotations.DataProvider;

public class LoginPageData {

    @DataProvider(name = "negativeLoginData" )
    public Object[][] negativeLoginScenarioData(){
        return new Object[][]{
                {"yoll-student","jhakjdhjksh",  "Invalid credentials" },
                {"jkahsjadhasa", "Bootcamp5#", "Invalid credentials"},
                {"sdfghfgherdf","dfgfghhj","Invalid credentials"},
                {"","Bootcamp5#","Username cannot be empty"},
                {"","dfghhgfjgkh","Username cannot be empty"},
                {"yoll-student","","Password cannot be empty"},
                {"fsgdthyku","","Password cannot be empty"},
                {"","","Username cannot be empty"}
        };
    }



    public String userName = "yoll-student";
    public String pwd = "Bootcamp5#" ;
    public String expectedUserName = "Welcome Yoll";

    /**
     * if you have more than one valid credentials then use dataProvider
     */

    @DataProvider(name = "positiveLoginData" )
    public Object[][] positiveLoginScenarioData(){
        return new Object[][]{
                {"yoll-student","Bootcamp5#",  "Welcome Yoll" },

        };
    }
}
