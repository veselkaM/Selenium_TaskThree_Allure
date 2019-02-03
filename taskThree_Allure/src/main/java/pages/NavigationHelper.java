package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HalperBase {

    public NavigationHelper(WebDriver driver) {
        super(driver);
    }

    public void selectMenuItem(String itemName) {
        click(By.xpath("//*[@class = 'lg-menu__text' and text() = '" + itemName + "']"));
    }

    public void selectSubMenuItem(String itemName) {
        click(By.xpath("//*[@class = 'lg-menu__sub-link' and text() = '" + itemName + "']"));
    }
}
