package Gun02;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/*
        Senaryo;
        1- Siteyi açınız
        2- Top Menudeki menu elemanlarının olduğunu doğrulayınız.(menuValidation)
*/

public class _deneme01 extends GenelWebDriver {

    @Test
    void menuValidation() {
        List<String> menuExpected = new ArrayList<>();
        menuExpected.add("Desktops");
        menuExpected.add("Laptops & Notebooks");
        menuExpected.add("Components");
        menuExpected.add("Tablets");
        menuExpected.add("Software");
        menuExpected.add("Phones & PDAs");
        menuExpected.add("Cameras");
        menuExpected.add("MP3 Players");

        By menuFinder = By.cssSelector("ul[class='nav navbar-nav']>li");
        List<WebElement> menuActual = driver.findElements(menuFinder);

        Tools.compareToList(menuExpected,menuActual);
}















}
