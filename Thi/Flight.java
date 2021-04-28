package Thi;

public class Flight {
    private int number;
    private String destination;

    public Flight(){
    }
    public Flight(int number, String destination) {
        this.number = number;
        this.destination = destination;
    }

    public int getNumber() {
        return this.number;
    }

    public String getDestination() {
        return this.destination;
    }
    public void display(){
        System.out.println("Number:"+number);
        System.out.println("Destination:"+destination);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "number=" + number +
                ", destination='" + destination + '\'' +
                '}';
    }
}
