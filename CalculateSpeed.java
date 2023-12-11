// WAP to calculate speed.

import java.util.Scanner;

public class CalculateSpeed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Distance(Metres):- ");
        float dis = sc.nextFloat();
        System.out.print("Enter Hours taken:- ");
        float hrs = sc.nextFloat();
        System.out.print("Enter Minutes Taken:- ");
        float mins = sc.nextFloat();
        System.out.print("Enter Seconds:- ");
        float secs = sc.nextFloat();

        fun(hrs, mins, secs,dis);
    }
    public static void fun(float hrs, float mins, float secs, float dis){
        // For meter per second
        float timesec = hrs*3600 + mins*60 + secs;
        float meter = dis/timesec;
        System.out.println("Speed:- ");
        System.out.println(meter+" m/s");
        // For kilometer per hour
        float timehr = hrs + mins/60 + secs/3600;
        float diskm = dis/1000;
        float mhr = diskm/timehr;
        System.out.println(mhr+" km/hr");
        // For miles per hour
        float dism = dis/1609;
        float miles = dism/timehr;
        System.out.println(miles+" miles/hr");
    }
}
