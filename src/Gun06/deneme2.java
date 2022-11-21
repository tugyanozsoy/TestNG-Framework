package Gun06;

/*
   Senaryo
   1- Siteye gidiniz
   2- Specials tiklayiniz
   3- Cikan urun sayisi ile indirimli urun sayisi ayni mi dogrulayiniz
   4- Yukarıdaki işlemden sonra her ürünün önceki fiyatının şu andaki fiyattan
      yüksek olduğunu doğrulayınız.
*/

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class deneme2 extends GenelWebDriver {

    @Test
    void test1(){
        WebElement firsat = driver.findElement(By.linkText("Specials"));
        firsat.click();

        List<WebElement> urunler = driver.findElements(By.className("product-thumb"));
        List<WebElement> fiyatEski = driver.findElements(By.className("price-old"));

        Assert.assertEquals(urunler.size(), fiyatEski.size());

        List<WebElement> fiyatYeni = driver.findElements(By.className("price-new"));

        for (int i = 0; i < urunler.size(); i++) {
            Assert.assertTrue(Tools.WebElementToDouble(fiyatYeni.get(i))<Tools.WebElementToDouble(fiyatEski.get(i)));
        }
    }
}
