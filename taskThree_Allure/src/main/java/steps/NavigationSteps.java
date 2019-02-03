package steps;

import pages.NavigationHelper;
import ru.yandex.qatools.allure.annotations.Step;

public class NavigationSteps extends BaseSteps {

    @Step("выбран пункт меню {0}")
    public void selectMenuItem(String menuItem){
        new NavigationHelper(driver).selectMenuItem(menuItem);
    }

    @Step("выбран вид страхования {0}")
    public void selectSubMenuItem(String menuItem){
        new NavigationHelper(driver).selectSubMenuItem(menuItem);
    }
}
