package Task7;

import java.util.Scanner;

public class Test_Flight {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Date d=new Date();
        Time t=new Time();
        System.out.println("Enter the type of cabin:");
        System.out.println("1.Business");
        System.out.println("2.First");
        System.out.println("3.Economy");
        byte typeOfCabin=scan.nextByte();
        System.out.println("Enter the number of ticket(s):");
        byte noOfTickets=scan.nextByte();
        FlightTicket f=new FlightTicket(d,t,noOfTickets,typeOfCabin);
        System.out.println("Following is the information about the ticket(s) booked:");
        System.out.println("--------------------------------------------------------");
        f.displayTicketsInformation();
    }
}
