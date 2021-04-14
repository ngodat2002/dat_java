package Task6;

import java.util.Arrays;

public class Line extends Point {
    Point end;
    //constructors a line instance given 2 points at(x1,x2) and (y1,y2)
    public Line (int x1,int y1,int x2,int y2){
       super(x1,y1);
        end=new Point(x2,y2);
    }
    //Constructors a Line instance given 2 Point instance
    public Line(Point begin,Point end){
        super(begin.getX(), begin.getY());
        this.end=end;
    }

    public Point getBegin() {
        return this;
    }

    public void setBegin(Point begin) {
        super.setX(begin.getX());
        super.setY(begin.getY());
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }
    public int getBeginX(){
        return super.getX();
    }
    public void setBeginX(int x){
        super.setX(x);
    }
    public int getBeginY(){
        return super.getY();
    }
    public void setBeginY(int y){
        super.setY(y);
    }
    public int[] getBeginXY(){
        return super.getXY();
    }
    public void setBeginXY(int x,int y){
        super.setXY(x,y);
    }
    public int getEndX(){
        return end.getX();
    }
    public void setEndX(int x){
        end.setX(x);
    }
    public int getEndY(){
        return end.getY();
    }
    public void setEndY(int y){
        end.setY(y);
    }
    public int[] getEndXY(){
        return end.getXY();
    }
    public void setEndXY(int x,int y){
        end.setXY(x,y);
    }

    @Override
    public String toString() {
        return "Line{" +
                "begin=" + super.toString() +
                ", end=" + end +
                '}';
    }
    public double getLength(){
        return super.distance(end);
    }

    public static void main(String[] args) {
        Line l1=new Line(1,2,3,4);
        System.out.println(l1);
        System.out.println("");
        Line l2=new Line(new Point(5,6),new Point(7,8));
        System.out.println(l2);
        System.out.println("");
        //Test setters and getter
        l1.setBegin(new Point(11,12));
        l1.setEnd(new Point(13,14));
        System.out.println(l1);
        System.out.println("Begin is :"+l1.getBegin());
        System.out.println("End is :"+l1.getEnd());
        System.out.println("");
        l1.setBeginX(21);
        l1.setBeginY(22);
        l1.setEndX(23);
        l1.setEndY(24);
        System.out.println(l1);
        System.out.println("begin's x is:"+l1.getBeginX());
        System.out.println("begin's y is:"+l1.getBeginY());
        System.out.println("end x is:"+l1.getEndX());
        System.out.println("end y is:"+l1.getEndY());
        System.out.println("");
        l1.setBeginXY(31,32);
        l1.setEndXY(33,34);
        System.out.println(l1);
        System.out.println("begin's x is:"+l1.getBeginXY()[0]);
        System.out.println("begin's y is:"+l1.getBeginXY()[1]);
        System.out.println("end's x is:"+l1.getEndXY()[0]);
        System.out.println("end's y is:"+l1.getEndXY()[1]);
        System.out.println("");
        System.out.printf("length is : %.2f%n",l1.getLength());
    }
}
