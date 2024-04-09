// Deƒne Time class with constructor to initialize hour and minute. Also deƒne addition method to add two time objects.
import java.util.*;

class Time{
    int hour, minute , sacond;

    Time(int hour, int minute , int sacond){
        this.hour = hour;
        this.minute = minute;
        this.sacond = sacond;
    }    
    public void addTime(Time t1, Time t2){
        this.hour = t1.hour + t2.hour;
        this.minute = t1.minute + t2.minute;
        this.sacond=t1.sacond + t2.sacond;

        if(this.sacond>=60){
            this.minute = this.minute + (this.sacond/60);
            this.sacond = this.sacond % 60;
        }
        if(this.minute>=60){
            this.hour = this.hour + (this.minute/60);
            this.minute = this.minute % 60;
        }
    }
}

public class Lab_5_2 {
    public static void main(String[] args) {
        Time t1 = new Time(3,70,78);
        Time t2 = new Time(2,300,798);
        Time t3 = new Time(0,0,0);
        t3.addTime(t1, t2); 
        System.out.println(t3.hour+":"+t3.minute+":"+t3.sacond);
    }
}
