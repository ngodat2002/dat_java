package Task7;

import java.util.Scanner;

public class Time {
     private byte hour;
     private byte minute;

    public Time(byte hour, byte minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public Time(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter departure time(hh mm)");
        this.hour= scan.nextByte();
        this.minute=scan.nextByte();
    }

}