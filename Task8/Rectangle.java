package Task8;

public class Rectangle implements Shape {
    private int length,width;

    public Rectangle( int length, int width) {
        super();
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return length*width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width + " " +
                '}';
    }
}
