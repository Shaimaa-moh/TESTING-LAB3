package myfirstproject;
import org.junit.Test;
import static org.junit.Assert.*;
public class Coffee_MachineTest {

   @Test
     public void test1()
     {
         Coffee_Machine c1 =new Coffee_Machine();
         assertEquals(1,c1.Order_coffee(60,30));
     }
    @Test
    public void test2()
    {
        Coffee_Machine c1 =new Coffee_Machine();
        assertEquals(1,c1.Order_coffee(200,90));
    }
    @Test
    public void test3()
    {
        Coffee_Machine c1 =new Coffee_Machine();
        assertEquals(0,c1.Order_coffee(209,900));
    }
}