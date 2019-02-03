package steps;

import pages.InsuranceRegistrationPage;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.HashMap;

import static junit.framework.TestCase.assertTrue;

public class InsuranceRegistrationSteps extends BaseSteps {

    @Step("поле {0} заполняется значением {1}")
    public void fillField(String field, String value) {
        new InsuranceRegistrationPage(driver).fillField(field, value);
    }

    @Step("поле {0} заполнено значением {1}")
    public void checkFillField(String field, String value) {
        String actual = new InsuranceRegistrationPage(driver).getFillField(field);
        assertTrue(String.format("Значение поля [%s] равно [%s]. Ожидалось - [%s]", field, actual, value),
                actual.equals(value));
    }

    @Step("заполняются поля")
    public void fillFields(HashMap<String, String> fields) {
        fields.forEach((k, v) -> fillField(k, v));
    }


    @Step("поля заполнены верно")
    public void checkInsuranceForm(HashMap<String, String> fields) {
        fields.forEach((k, v) -> checkFillField(k, v));
    }

    @Step("выбран женский пол")
    public void chooseFemale() {
        new InsuranceRegistrationPage(driver).femaleChekBox.click();
    }

    @Step("выполнено нажатие на Оформить")
    public void conformInsuranceForm() {
        new InsuranceRegistrationPage(driver).confirmButtom.click();
    }

    @Step("Присутствует сообщение об ошибке {0}")
    public void checkErrorMassage(String expectedTitle) {
        String actualTitle = new InsuranceRegistrationPage(driver).errorText.getText();
        assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                actualTitle, expectedTitle), actualTitle.contains(expectedTitle));
    }
}
