package Gun05_01;

import org.testng.annotations.Test;

public class deneme01 {

    @Test(groups = "SmokeTest")
    void test1(){System.out.println("Test 1 Smoke Test");}

    @Test(groups = "Regression")
    void test3(){System.out.println("Test 3 Regression");}

    @Test(groups = "Regression")
    void test5(){System.out.println("Test 5 Regression");}

    @Test(groups = "Regression")
    void test2(){System.out.println("Test 2 Regression");}

    @Test(groups = "SmokeTest")
    void test4(){System.out.println("Test 4 Smoke Test");}

    @Test(groups = "SmokeTest")
    void test6(){System.out.println("Test 6 Smoke Test");}

    @Test
    void test7(){System.out.println("Test 7");}


}
