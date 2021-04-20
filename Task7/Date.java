package Task7;

import java.util.Scanner;

public class Date {
     private byte day;
     private byte month;
     private short year;

    public Date(byte day, byte month, short year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter departure date (mm dd yyyy):");
        this.day=scan.nextByte();
        this.month=scan.nextByte();
        this.year=scan.nextShort();
    }
}