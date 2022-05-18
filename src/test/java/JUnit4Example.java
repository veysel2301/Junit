import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JUnit4Example extends JUnit4Base {
    @Test
    public void assertEquals(){
        Assert.assertEquals("Değerler eşit değil",1,1);//actual kısmı 2 olursa assert çalışır.
        //System.out.println("pass");

    }
    @Test
    public void assertNotEquals(){
       Assert.assertNotEquals("asdfs",1,2);
        //System.out.println("Değerler eşit");
    }
    @Test
    public void assertArrayEquals(){
        String[] array1= {"Testinium","Test","Qa"};
        String[] array2= {"Testinium","Qa","Test"};

        Arrays.sort(array1);
        Arrays.sort(array2);

        Assert.assertArrayEquals(array1,array2);
        System.out.println("Array karşılaştırma başarılı");

    }
    @Test
    public void assertArrayNotEquals(){
        String[] array1= {"Testinium","Test","QA"};
        String[] array2= {"Testinium","Qa","Test"};
        Arrays.sort(array1);
        Arrays.sort(array2);
        Assert.assertFalse(Arrays.equals(array1,array2));
        System.out.println("Array karşılaştırma başarılı");

    }
    @Test
    public void listEquals() {
        List<Integer> intList1=new ArrayList<Integer>(){
            {
                add(1);
                add(2);
                add(3);

            }
        };
        List<Integer> intList2=new ArrayList<Integer>(){
            {
                add(2);
                add(1);
                add(3);//assertion çalışır ama başka bir değer olursa çalışmaz

            }
        };
        Collections.sort(intList1);
        Collections.sort(intList2);
        Assert.assertEquals("test fail oldu",intList1,intList2);//assertion seçilir
        System.out.println("Başarılı");
    }
    @Test
    public void listNotEquals() {
        List<Integer> intList1=new ArrayList<Integer>(){
            {
                add(1);
                add(2);
                add(3);

            }
        };
        List<Integer> intList2=new ArrayList<Integer>(){
            {
                add(2);
                add(1);
                add(5);//assertion çalışır amaaynı değer olursa çalışmaz

            }
        };
        Collections.sort(intList1);
        Collections.sort(intList2);
        Assert.assertNotEquals("eşit ",intList1,intList2);
        System.out.println("Başarılı");
    }
    @Test
    public void assertTrue(){
        int a=3;
        Assert.assertTrue("doğrudur karşim",a==1 || a<10);// patlaması a>10 olursa olur.
    }
    @Test
    public void assertFalse(){
        int b=8;
        Assert.assertFalse("karşim yanlış bu ya sorry",b==7);// b==8 olursa assertion çalışır.
        System.out.println("eşit değil bunlar bravo bro");
    }
    @Test
    public void assertNull(){
        String a=null; // "" olursa assertion çalışır.
        Assert.assertNull("Değer null değil",a);
    }
    @Test
    public void assertNotNull(){
        String s="";
        Assert.assertNotNull("doğru değil  kardeş",s);
        System.out.println("null değer yok bro");
    }
    @Test
    @Ignore
    public void testIgnore(){
        System.out.println("Ignore oldu");
    }



}
