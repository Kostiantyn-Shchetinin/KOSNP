package test;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import page.BasePage;
import page.Main;
import page.TaskOne;
import page.TaskSix;

import java.util.concurrent.TimeUnit;

public class TestBase {

    String SITE_URl = "https://testingcup.pgs-soft.com/";
    WebDriver driver;
    public Main main;
    public TaskOne taskOne;
    public TaskSix taskSix;

    public void start(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        main = PageFactory.initElements(driver, Main.class);
        taskOne = PageFactory.initElements(driver, TaskOne.class);
        taskSix = PageFactory.initElements(driver, TaskSix.class);
    }

    public void finish(){
        driver.quit();
    }
}
