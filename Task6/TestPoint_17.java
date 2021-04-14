package Task6;

public class TestPoint_17 {
    public static void main(String[] args) {
        //Test Point2D
        Point2D_17  p1= new Point2D_17(5.3f,6.4f);
        System.out.println(p1);
        Point2D_17 p2 =new Point2D_17();
        System.out.println(p2);
        //test setter
        p1.setX(6.2f);
        p1.setY(6.9f);
        System.out.println(p1);
        p1.setGetXY(9.2f,4.3f);
        System.out.println(p1);
        System.out.println("X is:"+p1.getXY()[0]);
        System.out.println("Y is:"+p1.getXY()[1]);
        /*Test Point 3D*/
        Point3D_17 pi1=new Point3D_17(2.2f,5.5f,6.6f);
        System.out.println(pi1);
        //test setter
        pi1.setX(1.1f);
        pi1.setY(2.2f);
        pi1.setZ(3.3f);
        System.out.println(pi1);
        pi1.setGetXYZ(7.7f,8.8f,9.9f);
        System.out.println(pi1);
        System.out.println("X is:"+pi1.getXYZ()[0]);
        System.out.println("Y is:"+pi1.getXYZ()[1]);
        System.out.println("Z is:"+pi1.getXYZ()[2]);
    }
}
