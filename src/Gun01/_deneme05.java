package Gun01;

/*
   Senaryo ;
     1- http://opencart.abstracta.us/index.php?route=account/login  sitesini açınız.
     2- asd@gmail.com  ve 123qweasd   bilgileri ile login olan test metodunu yazınız.
     3- Login olup olmadığınızı assert ile kontrol ediniz.

 */

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;


public class _deneme05 extends GenelWebDriver {

    @Test
    void loginTest(){
        WebElement kullaniciAdi = driver.findElement(By.id("input-email"));
        kullaniciAdi.sendKeys("mariogomez@gmail.com");

        WebElement sifre = driver.findElement(By.id("input-password"));
        sifre.sendKeys("bjk159753");

        WebElement giris = driver.findElement(By.cssSelector("input[type='submit']"));
        giris.click();
    }

}
