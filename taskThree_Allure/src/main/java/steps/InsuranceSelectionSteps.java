package steps;

import pages.InsuranceSelectionPage;
import ru.yandex.qatools.allure.annotations.Step;

public class InsuranceSelectionSteps extends BaseSteps {

    @Step("Выбрана сумму страховой защиты – Минимальная")
    public void chooseMinimalPackage() {
        new InsuranceSelectionPage(driver).minimalPackage.click();
    }

    @Step("выполнено нажатие на Оформить")
    public void clickCheckoutButton() {
        new InsuranceSelectionPage(driver).сheckoutButton.click();
    }
}
