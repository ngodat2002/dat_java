package Session4;

import java.util.Scanner;

public class Time {
    int hour;
    int minute;
    int second;
    void initialize(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter hour:");
        hour= scan.nextInt();
        System.out.println("Enter minute:");
        minute=scan.nextInt();
        System.out.println("Enter second:");
        second= scan.nextInt();
    }
    void display(){
        System.out.println("Hour:"+hour);
        System.out.println("Minute:"+minute);
        System.out.println("Second:"+second);
    }
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }
    public void setHour(int newHour){
        hour=newHour;
    }
    public void setMinute(int newMinute){
        minute=newMinute;
    }
    public void setSecond(int newSecond){
        second=newSecond;
    }
    public String toString(){
        if (hour<10&&minute<10&&second<10){
            return "0" +hour+ ":" + "0"+minute+ ":" +"0"+second+"";
        }
        else {
            return  +hour+ ":"  +minute+ ":" +second+"";
        }
    }
    public int nextSecond(){
        return second=second+1;
    }
    public int previousSecond(){
        return second=second-2;
    }

    public static void main(String[] args) {
        Time t=new Time();
        t.initialize();
        t.display();
        System.out.println(t.toString());
        System.out.println("Next Second :"+t.nextSecond());
        System.out.println("Previous Second :"+t.previousSecond());
    }
}
