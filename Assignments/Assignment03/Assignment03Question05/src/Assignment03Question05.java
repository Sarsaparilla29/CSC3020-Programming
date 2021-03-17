//import java.util.*;
public class Assignment03Question05 {
    public static void main(String[] args) {
        Time obj1 = new Time();
        System.out.printf("%02d", obj1.getHour());
        System.out.printf(":%02d", obj1.getMinute());
        System.out.printf(":%02d\n", obj1.getSeconds());

        Time obj2 = new Time(555550000);
        System.out.printf("%02d", obj2.getHour());
        System.out.printf(":%02d", obj2.getMinute());
        System.out.printf(":%02d\n", obj2.getSeconds());
        //System.out.println(obj2.getHour() + ":"+ obj2.getMinute() + ":"+obj2.getSeconds());
        Time obj3 = new Time(5, 23, 55);
        System.out.printf("%02d", obj3.getHour());
        System.out.printf(":%02d", obj3.getMinute());
        System.out.printf(":%02d\n", obj3.getSeconds());
        //System.out.println(obj3.getHour() + ":"+ obj3.getMinute() + ":"+obj3.getSeconds());
    }
}

class Time {
    long hour;
    long minute;
    long seconds;
    Time() {
        //Time T = new Time();
        setTime(System.currentTimeMillis());
    }
    Time(long time) { // seconds from 1970
        //Time T = new Time();
        setTime(time);
    }
    Time(long h, long m, long s){
        hour = h;
        minute = m;
        seconds = s;
    }
    long getHour() {
        return hour;
    }
    long getMinute() {
        return minute;
    }
    long getSeconds() {
        return seconds;
    }
    void setTime(long elapseTime) {
        long s;
        long m;
        long h;
        s = (elapseTime) / 1000;
        seconds = s % 60;
        m = s / 60;
        minute = m % 60;
        h = m / 60;
        hour = h % 24;
    }
}