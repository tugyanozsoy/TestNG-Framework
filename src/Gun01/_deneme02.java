package Gun01;

import org.testng.annotations.*;

public class _deneme02 {
       /*
         @BeforeClass --> // Her class çalışıyorken önce burası çalışır
           @BeforeMethod --> // Her metoddan(test metod) önce çalışır
              @Test     -->  testlerin çalıştığı metodlar
              @Test     -->  testlerin çalıştığı metodlar
           @AfterMethod --> // Her metoddan(test metod) sonra çalışır
         @AfterClass --> // Her class çalışıyorken sonra burası çalışır
     */
    @BeforeClass
    void beforeClass(){
        System.out.println("Her classtan önce çalışacak");
    }
    @BeforeMethod
    void beforeMethod(){
        System.out.println("Her methoddan önce çalışacak");
    }
    @Test
    void test1(){
        System.out.println("Test 1 çalıştı");
    }
    @Test
    void test2(){
        System.out.println("Test 2 çalıştı");
    }
    @AfterMethod
    void afterMethod(){
        System.out.println("Her methoddan sonra çalışacak");
    }
    @AfterClass
    void afterClass(){
        System.out.println("Her classtan sonra çalışacak");
    }














}
