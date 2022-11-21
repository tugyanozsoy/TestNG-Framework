package Gun06;

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Daha önceki derslerde yaptğımı Search fonksiyonunu
 * mac,ipod ve samsung için Dataprovider ile yapınız.
 */

public class deneme1 extends GenelWebDriver {


    @Test(dataProvider = "data")
    void search(String data){

        WebElement searchInput = driver.findElement(By.name("search"));
        searchInput.clear();
        searchInput.sendKeys(data);

        WebElement searchButton = driver.findElement
                (By.cssSelector("[class='btn btn-default btn-lg']"));
        searchButton.click();

        //h4>a
        List<WebElement> captions = driver.findElements
                (By.cssSelector("[class='product-thumb'] [class='caption'] a"));

        for (WebElement e : captions) {
            Assert.assertTrue(e.getText().toLowerCase().contains(data));
        }

    }

    @DataProvider
    public Object[] data(){
        Object[] veri={"mac","ipod","samsung"};
        return veri;
    }

}
