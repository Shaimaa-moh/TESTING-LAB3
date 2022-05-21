package myfirstproject;
public class Stop_watch {
    int seconds, minute, hours, day, month, year;

    Stop_watch() {
        this.seconds = 0;
        this.minute = 0;
        this.hours = 0;
        this.day = 1;
        this.month = 1;
        this.year = 2000;
    }
public String SecIncrementing()
{
    this.seconds=this.seconds+1;
    Stop_watch2 w = new Stop_watch2();
    boolean checking = w.check_seconds_stub(this.seconds,this.minute,this.hours);
    if (checking==false)
    {
        return "time is "+"hour is:" +hours +"minutes:"+ minute+"seconds are :"+seconds ;
    }
    else {
        seconds=0;
        return "time is "+"hour is:" +hours +"minutes:"+ minute+"seconds are :"+seconds ;
    }
}
    public void increment_seconds() {
        if (this.seconds >= 60) {
            this.seconds++;
            this.seconds = 0;
            increment_minute();
        }
    }
        public void increment_minute(){
           this.minute++;
            if(this.minute>=60){
                this.minute=0;
                increment_hour();
            }
    }
    public void increment_hour(){
        this.hours++;
        if(this.hours>=24){
            hours=0;
            increment_day();
        }
    }
    public void increment_day(){
        this.day++;
        if(this.day>=31){
            this.day=1;
            increment_month();
        }
    }
    public void increment_month(){
        month++;
        if(this.month>=12){
            this.month=1;
            increment_year();
        }
    }
    public void increment_year(){
        this.year++;
        if(this.year>=2099){
            this.minute=0;
            this.hours=0;
            this.day=1;
            this.month=1;
            this.year=2000;
        }
    }
    public  String returnDate() {return this.year+"-"+this.month+"-"+this.day;}
    public  String returnTIME() {return this.hours+":"+this.minute;}
}
