package myfirstproject;
import org.junit.Test;
import static org.junit.Assert.*;
public class Stop_watchTest {
    @Test
    public void minutetest() {
        Stop_watch tm = new Stop_watch();
        for(int i=0;i<60;i++)
            tm.increment_minute();
        String tmp=tm.returnTIME();
        assertEquals("1:0",tmp);
    }
   @Test
    public void SecTest()
   {
       Stop_watch w1 = new Stop_watch();
       assertEquals("time is hour is:0minutes:0seconds are :1",w1.SecIncrementing());
   }

}