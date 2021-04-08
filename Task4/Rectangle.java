package Session4;

public class Rectangle {
    float length = 1.0f;
    float width =1.0f;

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }
    public void setLength(float newLength){
        length=newLength;
    }

    public void setWidth(float newWidth) {
        width =newWidth;
    }
    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return (length+width)*2;
    }
    public String toString(){
        return  "Rectangle[length="+length+" width="+ width +"]";
    }
    public static void main(String[] args) {
        Rectangle r1= new Rectangle();
        Rectangle r2 = new Rectangle();
        Rectangle r3 =new Rectangle();
        r2.setLength(5);
        r2.setWidth(3);
        System.out.println("The Length is:"+r1.getLength());
        System.out.println("The width is:"+ r1.getWidth());
        System.out.printf("The area is:%n"+r1.getArea());
        System.out.println("");
        System.out.printf("The perimeter is: %n"+r1.getPerimeter());
        System.out.println(r1.toString());
        System.out.println();
        System.out.println("===================================");
        System.out.println("The Length is:"+r2.getLength());
        System.out.println("The width is:"+ r2.getWidth());
        System.out.printf("The area is:%n"+r2.getArea());
        System.out.println("");
        System.out.printf("The perimeter is: %n"+r2.getPerimeter());
        System.out.println("");
        System.out.println("");
        System.out.println(r2.toString());
    }
}
