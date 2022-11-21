package Gun01;

import org.testng.annotations.Test;

public class _deneme01 {

    @Test(priority = 1)
    void testBasladi(){
        System.out.println("Test başladı");
    }

    @Test(priority = 2)
    void testDevamEdiyor(){
        System.out.println("Test devam ediyor");
    }
    @Test(priority = 3)
    void testBitti(){
        System.out.println("Test bitti");
    }

















}
