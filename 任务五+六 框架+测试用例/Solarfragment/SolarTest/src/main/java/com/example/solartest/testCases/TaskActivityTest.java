package com.example.solartest.testCases;

import com.example.solartest.base.BaseTest;
import com.example.solartest.pages.LoginPage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TaskActivityTest extends BaseTest {
    @BeforeClass
    //登录
    public void login() throws InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.login("huhu","1133444");
    }
    @Test(testName = "test03")
    //任务-添加任务
    public void testAddTask() throws InterruptedException {
        com.example.solartest.pages.TaskActivity.TaskAct ma = new com.example.solartest.pages.TaskActivity.TaskAct(getDriver());
        ma.addTask();
        assertEquals("com.example.lx.solarfragment",getDriver().getCurrentPackage());
    }
    @Test(testName = "test04")
    //任务-开始任务-重新开始
    public void testRestartTask() throws InterruptedException {
        com.example.solartest.pages.TaskActivity.TaskAct ma = new com.example.solartest.pages.TaskActivity.TaskAct(getDriver());
        ma.restartTask();
        assertEquals("com.example.lx.solarfragment",getDriver().getCurrentPackage());
    }
    @Test(testName = "test05")
    //任务-开始任务-暂停任务
    public void testpauseTask() throws InterruptedException {
        com.example.solartest.pages.TaskActivity.TaskAct ma = new com.example.solartest.pages.TaskActivity.TaskAct(getDriver());
        ma.pauseTask();
        assertEquals("com.example.lx.solarfragment",getDriver().getCurrentPackage());
    }
    @Test(testName = "test06")
    //任务-开始任务-提前完成计时
    public void testBeginTask() throws InterruptedException {
        com.example.solartest.pages.TaskActivity.TaskAct ma = new com.example.solartest.pages.TaskActivity.TaskAct(getDriver());
        ma.beginTask();
        assertEquals("com.example.lx.solarfragment",getDriver().getCurrentPackage());
    }
    @Test(testName = "test07")

    //任务-开始任务-放弃完成计时
    public void testForgiveTask() throws InterruptedException {
        com.example.solartest.pages.TaskActivity.TaskAct ma = new com.example.solartest.pages.TaskActivity.TaskAct(getDriver());
        ma.forgiveTask();
        assertEquals("com.example.lx.solarfragment",getDriver().getCurrentPackage());
    }
    @Test(testName = "test08")
    //任务-开始任务-取消停止
    public void testForgiveStop() throws InterruptedException {
        com.example.solartest.pages.TaskActivity.TaskAct ma = new com.example.solartest.pages.TaskActivity.TaskAct(getDriver());
        ma.forgiveStop();
        assertEquals("com.example.lx.solarfragment",getDriver().getCurrentPackage());
    }
    @Test(testName = "test09")
    //任务-删除任务
    public void testDeleteTask() throws InterruptedException {
        com.example.solartest.pages.TaskActivity.TaskAct ma = new com.example.solartest.pages.TaskActivity.TaskAct(getDriver());
        ma.deleteTask();
        assertEquals("com.example.lx.solarfragment",getDriver().getCurrentPackage());
    }
    @Test(testName = "test10")
    //任务-编辑任务
    public void testEditTask() throws InterruptedException {
        com.example.solartest.pages.TaskActivity.TaskAct ma = new com.example.solartest.pages.TaskActivity.TaskAct(getDriver());
        ma.editTask();
        assertEquals("com.example.lx.solarfragment",getDriver().getCurrentPackage());
    }
    @Test(testName = "tast11")
    //设置开始工作铃声提醒-震动提醒
    public void testSetRing_work() throws InterruptedException {
        com.example.solartest.pages.TaskActivity.TaskAct ma = new com.example.solartest.pages.TaskActivity.TaskAct(getDriver());
        ma.setRing_work();
        assertEquals("com.example.lx.solarfragment",getDriver().getCurrentPackage());
    }
    @Test(testName = "test12")
    //设置开始休息铃声提醒-铃声提醒
    public void testSetRing_rest() throws InterruptedException {
        com.example.solartest.pages.TaskActivity.TaskAct ma = new com.example.solartest.pages.TaskActivity.TaskAct(getDriver());
        ma.setRing_rest();
        assertEquals("com.example.lx.solarfragment",getDriver().getCurrentPackage());
    }
    @Test(testName = "test13")
    //铃声类型设置
    public void testSetRingType() throws InterruptedException {
        com.example.solartest.pages.TaskActivity.TaskAct ma = new com.example.solartest.pages.TaskActivity.TaskAct(getDriver());
        ma.setRingType();
        assertEquals("com.example.lx.solarfragment",getDriver().getCurrentPackage());
    }
    @Test(testName = "test14")
    //打开+关闭震动提醒开关
    public void testSetShockBtn() throws InterruptedException {
        com.example.solartest.pages.TaskActivity.TaskAct ma = new com.example.solartest.pages.TaskActivity.TaskAct(getDriver());
        ma.setShockBtn();
        assertEquals("com.example.lx.solarfragment",getDriver().getCurrentPackage());
    }
    @Test(testName = "test15")
    //更改壁纸（系统不完整，只做到打开更改壁纸页面+关闭页面）
    public void testSetPicture() throws InterruptedException {
        com.example.solartest.pages.TaskActivity.TaskAct ma = new com.example.solartest.pages.TaskActivity.TaskAct(getDriver());
        ma.setPicture();
        assertEquals("com.example.lx.solarfragment",getDriver().getCurrentPackage());
    }
    @AfterClass
    //更多-退出
    public void testQuit() throws InterruptedException {
        com.example.solartest.pages.TaskActivity.TaskAct ma = new com.example.solartest.pages.TaskActivity.TaskAct(getDriver());
        ma.quit();
        assertEquals("com.example.lx.solarfragment",getDriver().getCurrentPackage());
    }
}
