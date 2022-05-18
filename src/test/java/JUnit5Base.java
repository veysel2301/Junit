import org.junit.jupiter.api.*;

public class JUnit5Base {
    @BeforeAll
    public static void beforeAll(){
        //System.out.println("Before all çalıştı.");
    }
    @BeforeEach
    public void beforeEach(){
       // System.out.println("Before each çalıştı");
    }
//    @Test
//    public void testJUnit1(){
//        System.out.println("Junit1 test çalıştı");
//    }
//    @Test
//    public void testJUnit2(){
//        System.out.println("Junit2 test çalıştı");
//    }


   @AfterEach
    public void afterEach(){
       //System.out.println("After each çalıştı.");
   }
   @AfterAll
    public static void afterAll(){
      // System.out.println("After all çalıştı.");
   }
}
