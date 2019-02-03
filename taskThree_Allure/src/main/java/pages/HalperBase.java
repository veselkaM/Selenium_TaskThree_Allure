package pages;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

import java.util.ArrayList;


public class HalperBase {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public HalperBase(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    protected void click(By locator) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", driver.findElement(locator));
        Wait<WebDriver> wait = new WebDriverWait(driver, 10, 1000);
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();

    }

    protected void type(WebElement element, String text) {
        if (text != null) {
            String existingTest = element.getAttribute("value");
            if (!text.equals(existingTest)) {
                element.clear();
                element.sendKeys(text);
            }
        }
    }
}
