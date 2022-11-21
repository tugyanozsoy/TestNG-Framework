package Gun02;
/*
     1- Siteyi açınız.
     2- Edit Account a tıklatınız.
     3- Yeni isim ve soyisim göndererek Continue yapınız.
     4- İşlem sonucunu kontrol ediniz.
     5- Bu işlemi 2 kez çalıştırarak eski haline getiriniz.
*/

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _deneme03 extends GenelWebDriver {

    By acc = By.linkText("Edit Account");
    By isim = By.id("input-firstname");
    By soyisim = By.id("input-lastname");
    By devam = By.cssSelector("input[value='Continue']");

    @Test
    void Test1(){
        isimDegistirme("Jose","Sosa");
        Tools.Bekle(2);
        isimDegistirme("Mario","Gomez");
    }

    void isimDegistirme(String name, String lastName) {
    WebElement edit = driver.findElement(acc);
    edit.click();

    WebElement ad = driver.findElement(isim);
    ad.clear();
    ad.sendKeys(name);

    WebElement soyad = driver.findElement(soyisim);
    soyad.clear();
    soyad.sendKeys(lastName);

    driver.findElement(devam).click();

    Tools.successMessageValidation();
    }

}
