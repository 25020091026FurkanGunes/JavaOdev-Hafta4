package time;
import java.util.Date;

public class Time {
    
    private long hour;
    private long minute;
    private long second;

    public Time() {
             this.hour=(System.currentTimeMillis() / 3_600_000)%24;
           long hourMod=System.currentTimeMillis()  % 3_600_000; 
           this.minute=hourMod / 60_000; 
           long minuteMod=hourMod % 60_000; 
           this.second=minuteMod / 1000;
    }

    public Time(long hour, long minute, long second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
        public Time(long gecensure) {
           this.hour=(gecensure / 3_600_000)%24;
           long hourMod=gecensure % 3_600_000; 
           this.minute=hourMod / 600_00; 
           long minuteMod=hourMod % 60_000; 
           this.second=minuteMod / 1000; 
    }
     
    public long getHour() {
        return hour;
    }
    public void setHour(long hour) {
        this.hour = hour;
    }   
    public long getMinute() {
        return minute;
    }
    public void setMinute(long minute) {
        this.minute = minute;
    }   
    public long getSecond() {
        return second;
    }  
    public void setSecond(long second) {
        this.second = second;
    }  
   public void setTime(long elapseTime){
          this.hour=(elapseTime / 3_600_000)%24;
           long hourMod=elapseTime % 3_600_000; 
           this.minute=hourMod / 60_000; 
           long minuteMod=hourMod % 60_000; 
           this.second=minuteMod / 1000; 
   
   }
 
    public static void main(String[] args) {
    Time t1=new Time();
    Time t2 =new Time(555550000);
    Time t3 =new Time(5, 23, 55);

   
    
        
        System.out.println(t1.getHour()+"/"+t1.getMinute()+"/"+t1.getSecond());
        System.out.println(t2.getHour()+"/"+t2.getMinute()+"/"+t2.getSecond());
        System.out.println(t3.getHour()+"/"+t3.getMinute()+"/"+t3.getSecond());
    }

   
}
