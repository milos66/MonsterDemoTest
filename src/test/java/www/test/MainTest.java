package www.test;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeSuite;

public class MainTest {

    @BeforeSuite
    public void configSelenide() {

        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://www.monsterworksdemo.com";
        //Configuration.startMaximized = true;
    }

}
