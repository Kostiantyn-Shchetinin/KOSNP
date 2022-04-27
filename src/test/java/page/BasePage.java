package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    //Wait wrapper method
    public void waitVilibility(By elementBy){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    //Click method
    public void click(By elementBy){
        waitVilibility(elementBy);
        driver.findElement(elementBy).click();
    }

    //Is element displayed method
    public void isElementDisplayed(By elementBy){
        waitVilibility(elementBy);
        assertTrue(driver.findElement(elementBy).isDisplayed());
    }

    //Is element not displayed
    public void isElementNotDisplayed(By elementBy){
        assertFalse(driver.findElements(elementBy).size() > 0);
    }

    //Write text method
    public void writeText(By elementBy, String text){
        isElementDisplayed(elementBy);
        WebElement element = driver.findElement(elementBy);
        element.clear();
        element.sendKeys(text);
    }
}
