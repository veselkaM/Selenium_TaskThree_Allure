package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class InshurePage extends HalperBase {

    public InshurePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[div[contains(@class, 'bp-widget ') and .//h3[text()='Страхование путешественников']]]/following-sibling::div//a[text()='Оформить онлайн']")
    public
    WebElement issueOnlineButton;

    @FindBy(xpath = "//h3[contains(text(), 'Страхование путешественников')]")
    public
    WebElement headlineName;


}

