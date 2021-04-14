package Task6;

public class Point3D extends Point2D{
    private int z;
    public Point3D(){
        super();
        this.z=0;
    }
    public Point3D(int x,int y,int z){
        super(x,y);
        this.z=z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "("+super.getX()+","+super.getY()+","+this.z+")";
    }

    public static void main(String[] args) {
        Point2D p2a=new Point2D(1,2);
        System.out.println(p2a);
        Point2D p2b=new Point2D();//default Constructor
        System.out.println(p2b);
        System.out.println("");
        //test get and setter
        p2a.setX(3);
        p2a.setY(4);
        System.out.println(p2a);
        System.out.println("X is:"+p2a.getX());
        System.out.println("Y is:"+p2a.getY());
        System.out.println("");
        //Test Point 3D
        Point3D p3a=new Point3D(11,12,13);
        System.out.println(p3a);
        Point3D p3b=new Point3D();//default constructor
        System.out.println(p3b);
        System.out.println("");
        //test get and setter
        p3a.setX(14);
        p3a.setY(15);
        p3a.setZ(16);
        System.out.println(p3a);
        System.out.println("X is:"+p3a.getX());
        System.out.println("Y is:"+p3a.getY());
        System.out.println("Z is:"+p3a.getZ());

    }
}
