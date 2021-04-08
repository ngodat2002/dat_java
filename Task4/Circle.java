package Session4;

public class Circle {
    double radius;
    String  color;
    //constructors
    public Circle(){
        radius = 1.0;
        color = "red";
    }
    public Circle(double radius){
        this.radius = radius;
        color = "red";
    }
    public Circle(double r, String c){
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
        return radius*radius*Math.PI;
    }
    //setters for instance
    public void setRadius(double radius){
        this.radius = radius;
    }
    public void setColor(String newColor){
        this.color= color;
    }
    public String toString(){
        return "Circle[radius=" +radius + "color=" +color+ "]";
    }
    public static void main(String[] args) {
        Circle c1= new Circle(2.0,"blue");
        System.out.println("The radius is:" +c1.getRadius());
        System.out.println("The color is:" + c1.getColor());
        System.out.printf("The area is: %.2f%n", c1.getArea());
        //declare and construct another instance of the Circle class called 2
        Circle c2= new Circle(2.0);
        System.out.println("The radius is:" +c2.getRadius());
        System.out.println("The color is:" + c2.getColor());
        System.out.printf("The area is: %.2f%n", c2.getArea());
        //declare and construct another instance of the Circle class called 3
        Circle c3= new Circle();
        System.out.println("The radius is:" +c3.getRadius());
        System.out.println("The color is:" + c3.getColor());
        System.out.printf("The area is: %.2f%n", c3.getArea());
        //
        Circle c4 = new Circle();
        c4.setRadius(5.0);
        System.out.println("radius is:" +c4.getRadius());
        c4.setColor("pink");
        System.out.println("color is:" +c4.getColor());
        Circle c5 =new Circle(5.0,"pink");
        System.out.println(c5.toString());
    }
}

