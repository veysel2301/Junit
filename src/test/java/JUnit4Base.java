import org.junit.*;

public class JUnit4Base {
    @BeforeClass
    public static void beforClass(){
       // System.out.println("Before Class çalıştı.");
    }
    @Before
    public void before(){
        //System.out.println("Before çalıştı.");
    }
//    @Test
//    public void test1(){
//        System.out.println("TEst 1");
//    }
//    @Test
//    public void test2(){
//        System.out.println("Test 2");
//    }
    @After
    public void after(){
        //System.out.println("after kodu çalıştı.");
    }
    @AfterClass
    public static void afterClass(){
        //System.out.println("After class çalıştı.");
    }

}
