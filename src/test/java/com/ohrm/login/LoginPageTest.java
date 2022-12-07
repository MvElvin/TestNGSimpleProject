package com.ohrm.login;

import com.ohrm.home.HomePage;
import com.ohrm.utilities.Base;
import com.ohrm.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends Base {

    @Test(dataProvider = "negativeLoginData", dataProviderClass = LoginPageData.class, groups = {"regression"})
    public void negativeLoginScenarioExecution(String username, String pwd, String expectedMessage) throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.login(username, pwd);

        // driver.findElement(By.id("spanMessage")) is equal to loginPage.errorMessage
        String actualMessage = loginPage.errorMessage.getText();
        Assert.assertEquals(actualMessage, expectedMessage, "Error message verification failed!");

    }

    @Test(groups = {"regression", "smoke"})
    public void positiveScenarioExecution() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        LoginPageData loginPageData = new LoginPageData();

        loginPage.login(loginPageData.userName, loginPageData.pwd);
        HomePage homePage = new HomePage();

        String actualText = homePage.userNameInHeader.getText();
        String expectedText = loginPageData.expectedUserName;

        Assert.assertEquals(actualText, expectedText, "UserName verification failed!");
    }

}
