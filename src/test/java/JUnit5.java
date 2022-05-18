
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
@TestClassOrder(ClassOrderer.OrderAnnotation.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)// Metodları verilen order sırasına göre taşınır.
@Order(2) //classın orderı
public class JUnit5 extends JUnit5Base{

    @Order(7)
   @ParameterizedTest // parametrik test yapacaz
   @ValueSource(ints = {1,2,4,6}) //vereceğmiz paramaetler için kulllanacaz
    public void paramTest (int param){
       System.out.println("Test " + param);
   }
    @Order(6)
    @ParameterizedTest
    @ValueSource(strings = {"ali","veli","deli"})
    public void stringParamTest(String str ){
        System.out.println(" "+ str);
    }
    String getUserName(){return "Kullanıcı 1<br>";}
    @Order(5)
    @Test
    public void assertEquals(){
       String userName=getUserName().trim().replaceAll("<br>","");// br yi boşluk yapacak.A
    Assertions.assertEquals("Kullanıcı 1",userName,"Mesaj");
        System.out.println("pass");
    }
    @Order(4)
    @Test
    public void assertNotEquals(){
     Assertions.assertNotEquals(1,2,"Değerlendir");
        System.out.println("pass");
    }
    @Order(3)
    @Test
    public void arrayExample(){
       String [] arr1 = {"Testinium","Test","Qa"};
       String[] arr2= {"Testinium","Qa","Test"};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Assertions.assertArrayEquals(arr1,arr2,"eşit değil karşim");
        System.out.println("Eşit knki");
    }
    @Order(2)
    @Test
    @DisplayName("Testinium Unit") // bu metodun ismini değişir.Raporlamada kullanılır.
    public void isim(){
        System.out.println("Test isim");
    }
    @Order(1)
    @RepeatedTest(3)
    @DisplayName("Testinium Unit2")
    public void isim1(){
        System.out.println("Repeated");
    }

   }

