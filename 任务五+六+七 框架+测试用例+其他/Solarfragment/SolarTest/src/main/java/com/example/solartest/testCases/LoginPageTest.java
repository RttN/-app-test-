package com.example.solartest.testCases;

import com.example.solartest.base.BaseTest;
import com.example.solartest.pages.LoginPage;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginPageTest extends BaseTest {
    @Test
    public void testLoginSuccess() throws InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.login("huhu","1133444");
        assertEquals("com.example.lx.solarfragment",getDriver().getCurrentPackage());
    }
}
