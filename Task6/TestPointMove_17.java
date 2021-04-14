package Task6;

public class TestPointMove_17 {
    public static void main(String[] args) {
        Point_17  pp= new Point_17();
        System.out.println(pp);
        Point_17 pp1=new Point_17(5.5f,6.6f);
        System.out.println(pp1);
        //test get and setter
        pp1.setX(1.1f);
        pp1.setY(2.2f);
        pp1.setXY(3.3f,4.4f);
        System.out.println(pp1);
        System.out.println("X is:"+pp1.getX());
        System.out.println("Y is:"+pp1.getY());
        System.out.println("XY[0] is:"+pp1.getXY()[0]);
        System.out.println("XY[1] is:"+pp1.getXY()[1]);
        System.out.println("================================================================");
        /*test movablepoint*/
        MovablePoint m=new MovablePoint();
        System.out.println(m);
        MovablePoint m1=new MovablePoint(4.4f,5.5f);
        System.out.println(m1);
        //test setter and getter
        m1.setXStep(6.6f);
        m1.setYStep(7.7f);
        System.out.println(m1);
        m1.setXYStep(8.8f,9.9f);
        System.out.println(m1);
        System.out.println("XStep is:"+m1.getXStep());
        System.out.println("YStep is:"+m1.getYStep());
        System.out.println("XYStep[0] is:"+m1.getXYStep()[0]);
        System.out.println("XYStep[1] is:"+m1.getXYStep()[1]);
        System.out.println("=================================================================");
        //test move
        System.out.println(m1.move());
        System.out.println(m1.move().move().move());
    }
}
