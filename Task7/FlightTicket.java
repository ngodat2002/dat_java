package Task7;

import java.util.Scanner;

public class FlightTicket {
    private Date departureDate;
    private Time departureTime;
    private byte noOfTickets;
    private byte typeOfCabin;
    private double price=1000;

    public FlightTicket(Date departureDate, Time departureTime, byte noOfTickets, byte typeOfCabin) {
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.noOfTickets = noOfTickets;
        this.typeOfCabin = typeOfCabin;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Time getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }
    public double totalPrice(){
        if (typeOfCabin==1){
            return noOfTickets*price;
        }else if (typeOfCabin==2){
            return noOfTickets*2*price;
        }else if (typeOfCabin==3){
            return noOfTickets*3*price;
        }
        return 0;
    }
    public void displayTicketsInformation(){
        System.out.println("Cơ Trưởng: Ngô Chí Thành Đạt :))");
        System.out.println("Departure Date: "+getDepartureDate());
        System.out.println("Departure Time: "+getDepartureTime());
        System.out.println("Number of tickets:"+noOfTickets);
        if (typeOfCabin==1){
            System.out.println("Type of cabin: Business class");
            System.out.println("Total cost of the ticket:"+"$"+totalPrice());
        }else if(typeOfCabin==2){
            System.out.println("Type of cabin: First class");
            System.out.println("Total cost of the ticket:"+"$"+totalPrice());
        }else if(typeOfCabin==3){
            System.out.println("Type of cabin: Economy class");
            System.out.println("Total cost of the ticket:"+"$"+totalPrice());
        }

    }
}
