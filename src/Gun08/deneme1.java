package Gun08;

import Gun07._03_PlaceOrderElements;
import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/*
    Senaryo ;
    1- Siteye gidiniz..
   2- "ipod" ürününü aratınız."ipod" u xml den gönderiniz
   3- çıkan elamnlardan random bir elelamnı Add Wish butonuna tıklayınız.
   4- Daha sonra WishList e tıklatınız
   5- Burada çıkan ürünle tıklanan ürünün isminin aynı olup olmadığını doğrulayınız.
 */
public class deneme1 extends GenelWebDriver {

    @Parameters("urunAdi")
    @Test
    void wishList(String urunAdi) {

        _03_PlaceOrderElements poe1 = new _03_PlaceOrderElements(driver);
        poe1.searchBox.sendKeys(urunAdi);
        poe1.searchButton.click();

        denemeElements doe1 = new denemeElements(driver);
        int randomNumber = Tools.RandomGenerator(doe1.aramaListesi.size());
        String randomUrunAdi = doe1.aramaListesi.get(randomNumber).getText();
        doe1.wishBtnList.get(randomNumber).click();

        doe1.btnWish.click();

        boolean bulundu=false;
        for(WebElement e : doe1.wishListListesi){
            if (e.getText().equals(randomUrunAdi))
            {
                bulundu = true;
                break;
            }
        }

        System.out.println("bulundu = " + bulundu);
        Assert.assertTrue(bulundu);


    }
}
