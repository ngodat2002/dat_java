package Session4;

public class Circlee {
    double radius;
    String  color;
    //constructors
    public Circlee(){
        radius = 1.0;
        color = "red";
    }
    public Circlee(double radius){
        this.radius = radius;
        color = "red";
    }
    public Circlee(double r, String c){
        radius = r;
        color = c;
    }
    //public methods
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public double getArea(){
        return radius * radius *Math.PI;
    }
    public static void main(String[] args) {
        Circlee c1= new Circlee(2.0,"blue");
        System.out.println("The radius is:" +c1.getRadius());
        System.out.println("The color is:" + c1.getColor());
        System.out.printf("The area is: %.2f%n", c1.getArea());
        //declare and construct another instance of the Circle class called 2
        Circlee c2= new Circlee(2.0);
        System.out.println("The radius is:" +c2.getRadius());
        System.out.println("The color is:" + c2.getColor());
        System.out.printf("The area is: %.2f%n", c2.getArea());
        //declare and construct another instance of the Circle class called 3
        Circlee c3= new Circlee();
        System.out.println("The radius is:" +c3.getRadius());
        System.out.println("The color is:" + c3.getColor());
        System.out.printf("The area is: %.2f%n", c3.getArea());
        //
    }
}

