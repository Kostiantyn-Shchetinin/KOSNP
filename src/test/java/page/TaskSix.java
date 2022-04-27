package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;


public class TaskSix extends BasePage{
    public TaskSix(WebDriver driver) {
        super(driver);
    }

    public TaskSix checkPageIsCorrect(){
        isElementDisplayed(By.xpath("//li [text() = 'Zadanie 6']"));
        return this;
    }

    public TaskSix fillInLogin(String login){
        writeText(By.xpath("//input[@id = 'LoginForm__username']"), login);
        return this;
    }

    public TaskSix fillInPassword(String password){
        writeText(By.xpath("//input[@id = 'LoginForm__password']"), password);
        return this;
    }

    public TaskSix clickLoginButton(){
        click(By.xpath("//button [@id = 'LoginForm_save']"));
        return this;
    }

    public TaskSix checkIfLoginSuccess(){
        isElementDisplayed(By.xpath("//a [text() = 'Wyloguj']"));
        return this;
    }

    public TaskSix checkIfLoginNotSuccess(){
        isElementNotDisplayed(By.xpath("//a [text() = 'Wyloguj']"));
        return this;
    }

}
