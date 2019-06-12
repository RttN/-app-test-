package com.example.solartest.pages;



import com.example.solartest.utils.Actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class LoginPage {

    @FindBy(id="login_name")
    private WebElement txt_name;

    @FindBy(id="password")
    private WebElement txt_password;

    @FindBy(id = "login")
    private WebElement btn_submit;


    AndroidDriver driver;
    Actions actions;
    public LoginPage(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
        actions = new Actions(driver);
    }
    public void login(String name,String password) throws InterruptedException {
        Thread.sleep(5000);
        actions.type(txt_name,name);
        actions.type(txt_password,password);
        actions.click(btn_submit);

    }
}
