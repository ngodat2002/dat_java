package Session4;

import java.util.Scanner;

public class Date {
    int date;
    int month;
    int year;
    void initialize(){
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter Day:");
        date= scan.nextInt();
        System.out.println("Enter Month:");
        month= scan.nextInt();
        System.out.println("Enter Year:");
        year= scan.nextInt();
    }
    void display(){
        System.out.println("Day: "+date);
        System.out.println("Month:"+month);
        System.out.println("Year: "+year);
    }
    public void setDate(int newDate){
        date=newDate;
    }
    public void setMonth(int newMonth){
        month=newMonth;
    }
    public void setYear(int newYear){
        year=newYear;
    }
    public String toString(){
        if (date<10&&month<10) {
            return "0" + date + "/" + "0" + month + "/" + year + "";
        }
        else{
            return + date + "/" + month + "/" + year + "";
        }
    }
    public static void main(String[] args) {
        Date d= new Date();
        Date d2=new Date();
        d.initialize();
        d.display();
        System.out.println(d.toString());
        d2.setDate(10);
        d2.setMonth(15);
        d2.setYear(2020);
        System.out.println(d2.toString());
    }
}
