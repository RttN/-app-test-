package com.example.solartest.pages;

import com.example.solartest.utils.Actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import io.appium.java_client.android.AndroidDriver;

public class MainActivity {
    public static class MainAct{

        //“首页”
        @FindBy(id="image1")
        private WebElement home;

        //“任务”
        @FindBy(id="image2")
        private WebElement task;

        //“选择番茄个数=1”
        @FindBy(id="bt1")
        private WebElement button1;

        //“开始第一个番茄时间”
        @FindBy(className="android.widget.LinearLayout")
        private WebElement begin;

        //“放弃当前番茄时间”
        @FindBy(id="btn_give_up")
        private WebElement giveUp;

        //“添加任务按钮”
        @FindBy(id="jiahao")
        private WebElement addTask;

        //“任务名称”
        @FindBy(id="taskname")
        private WebElement taskName;

        //“任务时长”
        @FindBy(id="tasktime")
        private WebElement taskTime;

        //“提交任务”
        @FindBy(id="finish")
        private WebElement taskFinish;

        //“选择任务”
        @FindBy(id="task_name")
        private WebElement chooseTask;

        //“开始任务”
        @FindBy(id="button3")
        private WebElement beginBtn;

        //“编辑任务”
        @FindBy(id="button2")
        private WebElement editBtn;

        //“删除任务”
        @FindBy(id="button1")
        private WebElement delBtn;


        //“重新计时”
        @FindBy(id="btn_begin")
        private WebElement restartTask;

        //“暂停计时”
        @FindBy(id="zanting")
        private WebElement pauseTask;

        //“停止计时”
        @FindBy(id="stop")
        private WebElement stopTask;

        //“计时页面左上角返回”
        @FindBy(id="clock_back_left")
        private WebElement clock_return;

        //“确认删除”
        @FindBy(id="button1")
        private WebElement delOK;

        //“设置按钮”
        @FindBy(id="setup")
        private WebElement setBtn;

        //“铃声提醒：开始工作”
        @FindBy(id = "tv_sing1")
        private WebElement beginWork;

        //“铃声提醒：开始休息”
        @FindBy(id = "tv_sing2")
        private WebElement beginRest;

        //“铃声类型按键”
        @FindBy(id="sing3")
        private WebElement ringType;

        //“铃声名字”
        @FindBy(id="tv_singname")
        private WebElement ringName;

        //“铃声页面返回”
        @FindBy(id="back1")
        private WebElement ringBack;

        //“震动提醒”
        @FindBy(id= "button3")
        private WebElement shockWarn;

        //“铃声提醒”
        @FindBy(id = "button2")
        private WebElement ringWarn;

        //“震动提醒开关”
        @FindBy(id = "switch1")
        private WebElement shockBtn;

        //“壁纸设置”
        @FindBy(id = "tv_image")
        private WebElement pictureBtn;

        //“左上角返回键”
        @FindBy(id="back")
        private WebElement backBtn;

        //“左上角更多”
        @FindBy(id ="btn_more")
        private WebElement moreBtn;

        //“积分详情”
        @FindBy(id = "ll_score_details")
        private WebElement scoreDtBtn;

        //“积分商城”
        @FindBy(id = "ll_score_mart")
        private WebElement scoreSpBtn;

        //“切换账号”
        @FindBy(id = "ll_change_user")
        private WebElement changeUBtn;

        //“注册新用户”
        @FindBy(id = "ll_zhu_ce")
        private WebElement addUBtn;

        //“退出”
        @FindBy(id = "ll_check_out")
        private WebElement quitBtn;

        //“更多-左上角返回”
        @FindBy(id= "iv_back_eft")
        private WebElement more_BackBtn;

        //“用户名”
        @FindBy(id="login_name")
        private WebElement txt_name;

        //“密码”
        @FindBy(id="password")
        private WebElement txt_password;

        //“登录”
        @FindBy(id = "login")
        private WebElement btn_submit;

        //“注册新用户-用户名”
        @FindBy(id = "username")
        private WebElement add_username;

        //“注册新用户-手机号”
        @FindBy(id = "phone")
        private WebElement add_tel;

        //“注册新用户-邮箱”
        @FindBy(id = "email")
        private WebElement add_Email;

        //“注册新用户-密码”
        @FindBy(id = "password")
        private WebElement add_pwd;

        //“注册新用户-确认密码”
        @FindBy(id = "qpassword")
        private WebElement add_pwd2;

        //“注册按钮”
        @FindBy(id = "register")
        private WebElement add_reg;


        AndroidDriver<WebElement> driver;
        Actions action;
        public MainAct(AndroidDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver,this);
//            PageFactory.initElements(new AppiumFieldDecorator(driver), this);
            action = new Actions(driver);
        }

        //首页-添加番茄时间
        public void addOneTomato(){
            action.click(home);
            action.click(button1);
            action.click(begin);
            action.click(giveUp);
        }


        //更多-查看积分详情
        public void scoreDetail(){
            action.click(home);
            action.click(moreBtn);
            action.click(scoreDtBtn);
            action.click(more_BackBtn);
            action.click(more_BackBtn);

        }

        //更多-积分商城
        public void scoreShop(){
            action.click(home);
            action.click(moreBtn);
            action.click(scoreSpBtn);
            action.click(more_BackBtn);
            action.click(more_BackBtn);
        }

        //更多-切换账号登录
        public void changeUser(){
            action.click(home);
            action.click(moreBtn);
            action.click(changeUBtn);
            action.type(txt_name,"dxy" );
            action.type(txt_password,"111111");
            action.click(btn_submit);
        }

        //更多-注册新用户
        public void addUser(){
            action.click(home);
            action.click(moreBtn);
            action.click(addUBtn);
            action.type(add_username,"11");
            action.type(add_tel,"15222222222");
            action.type(add_Email,"111111@qq.com");
            action.type(add_pwd,"111111");
            action.type(add_pwd2,"111111");
            action.click(add_reg);
            //登录
            action.type(txt_name,"11" );
            action.type(txt_password,"111111");
            action.click(btn_submit);
        }

        //更多-退出
        public void quit(){
            action.click(home);
            action.click(moreBtn);
            action.click(quitBtn);
        }



    }
}
