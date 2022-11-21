package Gun05_01;

/*
  1- ContactUs a tıklayınız
  2- Mesaj kutusuna en az 10 karakterlik bir mesaj yazınız.
  3- Submit ettikten sonra Contact US yazısını doğrulayınız.
 */

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class contactUs extends GenelWebDriver {

    @Test
    void contactUs(){
        WebElement contact = driver.findElement(By.linkText("Contact Us"));
        contact.click();

        WebElement yazi = driver.findElement(By.id("input-enquiry"));
        yazi.sendKeys("0123456789");

        WebElement submit = driver.findElement(By.cssSelector("[value='Submit']"));
        submit.click();

        WebElement contactYazi = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("content")));
        Assert.assertTrue(contactYazi.getText().toLowerCase().contains("contact"));
    }

}
