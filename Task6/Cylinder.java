package Task6;

public class Cylinder extends Circle {
    private double height;
    public Cylinder(){
        super();
        this.height=1.0;
    }
    public Cylinder(double height){
        super(height);
        this.height=height;
    }
    public Cylinder(double height,double radius){
        super(radius);
        this.height=height;
    }
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}';
    }
    public double getVolume(){
        return getArea()*height;
    }

    public static void main(String[] args) {
        Cylinder cy1=new Cylinder();
        System.out.println(cy1);
        System.out.println("Radius is: "+ cy1.getRadius());
        System.out.println("Height is: "+cy1.getHeight());
        System.out.println("Color is: "+cy1.getColor());
        System.out.println("Area is: "+cy1.getArea());
        System.out.println("Volume is: "+cy1.getVolume());
        System.out.println("");
        Cylinder cy2=new Cylinder(5.0,2.0);
        System.out.println("Radius is: "+ cy2.getRadius());
        System.out.println("Height is: "+cy2.getHeight());
        System.out.println("Color is: "+cy2.getColor());
        System.out.println("Area is: "+cy2.getArea());
        System.out.println("Volume is: "+cy2.getVolume());
    }
}
