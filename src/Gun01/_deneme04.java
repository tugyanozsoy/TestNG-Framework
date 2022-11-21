package Gun01;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class _deneme04 {

    @Test
    void test1(){
        System.out.println("Test 1 başladı");
    }

    @Test(enabled = false)
    void test2(){
        System.out.println("Test 2 başladı");
    }

    @Test
    void test3(){
        System.out.println("Test 3 başladı");
    }

    public static WebDriver driver;

    public static WebDriverWait wait;

    @BeforeClass
    void baslangicIslerimleri(){
        System.out.println("Driver başlatıldı");
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        //driver.manage().window().maximize(); // max
        driver.manage().deleteAllCookies();  //
        driver.manage().window().setPosition(new Point(990,0));

        wait=new WebDriverWait(driver, Duration.ofSeconds(30));

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); // sadece ana sayfa yüklenirken en başta
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // bütün webElement için geçerli
    }

    @BeforeClass
    void bitisIslemleri(){
        System.out.println("Bitiriliyor");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }





















}
