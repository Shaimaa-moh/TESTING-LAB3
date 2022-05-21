package myfirstproject;
public class Stop_watch2 {
    public String Counter () {
        int CountMin = 0;
        {
            if (CountMin >= 60) {
                return "counterMin is restarted";
            }
            else {
                  return "the counter is incremented";
            }
        }
    }
    public boolean check_seconds_stub(int seconds, int minutes , int hours)
    {
        if (seconds==60)
        {

            Check_min_stub(minutes,hours);
            return true ;
        }
        else
            return false;
    }
    public void Check_min_stub(int minutes , int hours)
    {
        if (minutes==60) {
            minutes = 0;
            Check_hour_stub(hours);
        }
    }
    public void Check_hour_stub( int hours) {
        if (hours == 24) {
            hours = 0;
            Check_hour_stub(hours);
        }
    }
}
