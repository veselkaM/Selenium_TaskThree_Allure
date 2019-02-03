package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class InsuranceSelectionPage extends HalperBase {
    public InsuranceSelectionPage(WebDriver driver) {
        super(driver);

    }

    @FindBy(xpath = "//div[text()='Минимальная']")
    public
    WebElement minimalPackage;

    @FindBy(xpath = "//span[text()='Оформить']")
    public
    WebElement сheckoutButton;

}
