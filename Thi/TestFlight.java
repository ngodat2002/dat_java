package Thi;

public class TestFlight {
    public static void main(String[] args) {
        Flight f1=new Flight();
        f1.display();
        System.out.println("");
        System.out.println(f1);
        System.out.println("");
        Flight f2=new Flight(587,"Toronto");
        f2.display();
        System.out.println(f2);
    }
}
