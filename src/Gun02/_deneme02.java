package Gun02;

/*
  Senaryo
  1- Siteyi açınız.
  2- Newsletter  Subscribe ve UnSubscribe işlemlerini ayrı ayı testlerde yapınız.
  3- Newsletter  üyelik işlemini, üye ise , üyelikten çıkma, değilse ekleme şeklinde yapınız
*/

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class _deneme02 extends GenelWebDriver {

    By link = By.linkText("Newsletter");
    By yes = By.cssSelector("input[value='1']");
    By no = By.cssSelector("input[value='0']");
    By devam = By.cssSelector("input[value='Continue']");

    @Test(priority = 1)
    void yesTusu(){

        wait.until(ExpectedConditions.elementToBeClickable(link));

        WebElement newsLink = driver.findElement(link);
        newsLink.click();

        WebElement evet = driver.findElement(yes);
        evet.click();

        WebElement devamTusu = driver.findElement(devam);
        devamTusu.click();

        Tools.successMessageValidation();
    }

    @Test(priority = 2)
    void noTusu(){

        wait.until(ExpectedConditions.elementToBeClickable(link));

        WebElement newsLink = driver.findElement(link);
        newsLink.click();

        WebElement evet = driver.findElement(no);
        evet.click();

        WebElement devamTusu = driver.findElement(devam);
        devamTusu.click();

        Tools.successMessageValidation();
    }

    @Test(priority = 3)
    void tersi(){

        wait.until(ExpectedConditions.elementToBeClickable(link));

        WebElement newsLink = driver.findElement(link);
        newsLink.click();

        if (driver.findElement(yes).isSelected()){
            driver.findElement(no).click();
        }
        else driver.findElement(yes).click();

        WebElement continueButton = driver.findElement(devam);
        continueButton.click();

        Tools.successMessageValidation();
    }














}
