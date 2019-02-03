package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class InsuranceRegistrationPage extends HalperBase {

    public InsuranceRegistrationPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(name = "insured0_surname")
    WebElement insuredSurname;

    @FindBy(name = "insured0_name")
    WebElement insuredName;

    @FindBy(name = "insured0_birthDate")
    WebElement insuredBirth;

    @FindBy(name = "surname")
    WebElement surname;

    @FindBy(name = "name")
    WebElement name;

    @FindBy(name = "middlename")
    WebElement middlename;

    @FindBy(name = "birthDate")
    WebElement birthDate;

    @FindBy(xpath = "//input[@name='female']/parent::span[1]")
    public
    WebElement femaleChekBox;

    @FindBy(name = "passport_series")
    WebElement passportSeries;

    @FindBy(name = "passport_number")
    WebElement passportNumber;

    @FindBy(name = "issueDate")
    WebElement issueDate;

    @FindBy(name = "issuePlace")
    WebElement issuePlace;

    @FindBy(name = "phone")
    WebElement phone;

    @FindBy(name = "email")
    WebElement email;

    @FindBy(name = "emailValid")
    WebElement emailValid;

    @FindBy(xpath = "//*[@ng-click = 'save()']")
    public
    WebElement confirmButtom;

    @FindBy(xpath = "//*[@ng-show = 'tryNext && myForm.$invalid']")
    public
    WebElement errorText;

    public void fillField(String fieldName, String value) {
        switch (fieldName) {
            case "Фамилия застрахованного":
                type(insuredSurname, value);
                break;
            case "Имя застрахованного":
                type(insuredName, value);
                break;
            case "Дата рождения застрахованного":
                type(insuredBirth, value);
                break;
            case "Фамилия страхователя":
                type(surname, value);
                break;
            case "Имя страхователя":
                type(name, value);
                break;
            case "Отчество страхователя":
                type(middlename, value);
                break;
            case "Дата рождения страхователя":
                type(birthDate, value);
                break;
            case "Серия паспорта":
                type(passportSeries, value);
                break;
            case "Номер паспорта":
                type(passportNumber, value);
                break;
            case "Дата выдачи паспорта":
                type(issueDate, value);
                break;
            case "Место выдачи паспорта":
                type(issuePlace, value);
                break;
            case "Телефон":
                type(phone, value);
                break;
            case "email":
                type(email, value);
                break;
            case "Подтверждение email":
                type(emailValid, value);
                break;
            default:
                throw new AssertionError("Поле '" + fieldName + "' не объявлено на странице");
        }
    }

    public String getFillField(String fieldName) {
        switch (fieldName) {
            case "Фамилия застрахованного":
                return insuredSurname.getAttribute("value");
            case "Имя застрахованного":
                return insuredName.getAttribute("value");
            case "Дата рождения застрахованного":
                return insuredBirth.getAttribute("value");
            case "Фамилия страхователя":
                return surname.getAttribute("value");
            case "Имя страхователя":
                return name.getAttribute("value");
            case "Отчество страхователя":
                return middlename.getAttribute("value");
            case "Дата рождения страхователя":
                return birthDate.getAttribute("value");
            case "Серия паспорта":
                return passportSeries.getAttribute("value");
            case "Номер паспорта":
                return passportNumber.getAttribute("value");
            case "Дата выдачи паспорта":
                return issueDate.getAttribute("value");
            case "Место выдачи паспорта":
                return issuePlace.getAttribute("value");
        }
        throw new AssertionError("Поле не объявлено на странице");
    }
}
