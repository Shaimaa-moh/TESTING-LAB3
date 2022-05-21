package myfirstproject;
import org.junit.Test;
import static org.junit.Assert.*;
public class ATMTest {
@Test
    public void int_test1()
    {
        ATM a = new ATM();
        assertEquals(1,a.withdraw(200));

    }
    @Test
    public void int_test2()
    {
        ATM a = new ATM();
        assertEquals(1,a.withdraw(600));

    }
    @Test
    public void int_test3()
    {
        ATM a = new ATM();
        assertEquals(0,a.withdraw(1500));
    }
}