package com.example.solartest.testCases;



import com.example.solartest.base.BaseTest;
import com.example.solartest.pages.LoginPage;
import com.example.solartest.pages.MainActivity;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MainActivityTest extends BaseTest {

    @BeforeClass
    //登录
    public void login() throws InterruptedException {
            LoginPage loginPage = new LoginPage(getDriver());
        loginPage.login("huhu","1133444");
    }

    @Test(testName = "test02")
    //首页-添加番茄时间
    public void testAddOneTomato(){
        com.example.solartest.pages.MainActivity.MainAct ma = new com.example.solartest.pages.MainActivity.MainAct(getDriver());
        ma.addOneTomato();
        assertEquals("com.example.lx.solarfragment",getDriver().getCurrentPackage());
    }

    @Test(testName = "test16")
    //更多-查看积分详情
    public void testScoreDetail() throws InterruptedException {
        com.example.solartest.pages.MainActivity.MainAct ma = new com.example.solartest.pages.MainActivity.MainAct(getDriver());
        ma.scoreDetail();
        assertEquals("com.example.lx.solarfragment",getDriver().getCurrentPackage());
    }
    @Test(testName = "test17")
    //更多-积分商城
    public void testScoreShop() throws InterruptedException {
        com.example.solartest.pages.MainActivity.MainAct ma = new com.example.solartest.pages.MainActivity.MainAct(getDriver());
        ma.scoreShop();
        assertEquals("com.example.lx.solarfragment",getDriver().getCurrentPackage());
    }
    @Test(testName = "test18")
    //更多-切换账号登录
    public void testChangeUser() throws InterruptedException {
        com.example.solartest.pages.MainActivity.MainAct ma = new com.example.solartest.pages.MainActivity.MainAct(getDriver());
        ma.changeUser();
        assertEquals("com.example.lx.solarfragment",getDriver().getCurrentPackage());
    }
   @Test(testName = "test19")
    //更多注册新用户
    public void testAddUser() throws InterruptedException {
        com.example.solartest.pages.MainActivity.MainAct ma = new com.example.solartest.pages.MainActivity.MainAct(getDriver());
        ma.addUser();
        assertEquals("com.example.lx.solarfragment",getDriver().getCurrentPackage());
    }

    @AfterClass
    //更多-退出
    public void testQuit() throws InterruptedException {
        com.example.solartest.pages.MainActivity.MainAct ma = new com.example.solartest.pages.MainActivity.MainAct(getDriver());
        ma.quit();
        assertEquals("com.example.lx.solarfragment",getDriver().getCurrentPackage());
    }



}
