package steps;

import pages.InshurePage;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.ArrayList;

import static junit.framework.TestCase.assertTrue;

public class InshureSteps extends  BaseSteps {

    @Step("заголовок страницы - равен {0}")
    public void checkPageTitle(String expectedTitle) {
        String actualTitle = new InshurePage(driver).headlineName.getText();
        assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                actualTitle, expectedTitle), actualTitle.contains(expectedTitle));
    }

    @Step("выполнено нажатие на Оформить Онлайн")
    public void goToSendAppPage() {
        new InshurePage(driver).issueOnlineButton.click();
    }


}
