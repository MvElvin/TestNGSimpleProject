package com.ohrm.login;

import com.ohrm.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "txtUsername")
    public WebElement usernameTxtBox;

    @FindBy(id = "txtPassword")
    public WebElement pwdTxtBox;

    @FindBy(id = "btnLogin")
    public WebElement loginButton;

    @FindBy(id = "spanMessage")
    public WebElement errorMessage;

    public void login(String userName, String pwd) throws InterruptedException {
        usernameTxtBox.sendKeys(userName);
        pwdTxtBox.sendKeys(pwd);
        loginButton.click();
        Thread.sleep(2000);
    }

}
