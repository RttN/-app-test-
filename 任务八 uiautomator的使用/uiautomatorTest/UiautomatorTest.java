package uiautomatorTest;


import android.os.RemoteException;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;
import android.support.test.InstrumentationRegistry;
import org.junit.Test;

public class UiautomatorTest {
    private UiDevice device;
    @Test
    //登录系统
    public  void test1() throws UiObjectNotFoundException, RemoteException {
        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        device.pressHome();
        UiObject logo = device.findObject(new UiSelector().text("Solar"));
        logo.click();
        UiObject username =device.findObject(new UiSelector().resourceId("com.example.lx.solarfragment:id/login_name"));
        username.click();
        username.setText("huhu");
        UiObject password =device.findObject(new UiSelector().resourceId("com.example.lx.solarfragment:id/password"));
        password.click();
        password.setText("1133444");
        UiObject submit=device.findObject(new UiSelector().text(" 登  录 "));
        submit.click();
    }
    @Test
    //开启一个番茄闹钟并关闭
    public  void test2() throws UiObjectNotFoundException,RemoteException {
        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        UiObject homeBtn =device.findObject(new UiSelector().resourceId("com.example.lx.solarfragment:id/image1"));
        homeBtn.click();
        UiObject oneBtn =device.findObject(new UiSelector().resourceId("com.example.lx.solarfragment:id/bt1"));
        oneBtn.click();
        UiObject tomatoBtn =device.findObject(new UiSelector().text("25"));
        tomatoBtn.click();
        UiObject giveupBtn =device.findObject(new UiSelector().text("GIVE UP"));
        giveupBtn.click();
    }
    @Test
    //编辑更改一个任务名称
    public void test3() throws UiObjectNotFoundException,RemoteException{
        device = UiDevice.getInstance(Instrumenta);
        UiObject taskBtn =device.findObject(new UiSelector().resourceId("com.example.lx.solarfragment:id/image2"));
        taskBtn.click();
        UiObject taskone =device.findObject(new UiSelector().resourceId("com.example.lx.solarfragment:id/task_name"));
        taskone.click();
        UiObject edit = device.findObject(new UiSelector().text("编辑"));
        edit.click();
        UiObject taskName =device.findObject(new UiSelector().resourceId("com.example.lx.solarfragment:id/taskname"));
        taskName.setText("test");
        UiObject finishBtn =device.findObject(new UiSelector().resourceId("com.example.lx.solarfragment:id/finish"));
        finishBtn.click();




    }


}
