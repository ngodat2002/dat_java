package TEST;

import java.util.Scanner;

public class Triangle {
    public Point p1,p2,p3;

    public static void main(String[] args) {
        System.out.println("Nhap x cua phan tu p1:");
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        System.out.println("Nhap y cua phan tu p1:");
        int y1 = scan.nextInt();

        System.out.println("Nhap x cua phan tu p2:");
        int x2 = scan.nextInt();
        System.out.println("Nhap y cua phan tu p2:");
        int y2 = scan.nextInt();

        System.out.println("Nhap x cua phan tu p3:");
        int x3 = scan.nextInt();
        System.out.println("Nhap y cua phan tu p3:");
        int y3 = scan.nextInt();

        Point p1 = new Point(x1,y1);
        System.out.println("Point1 {" + "x=" + x1 + ", y=" + y1 + '}');

        Point p2 = new Point(x2,y2);
        System.out.println("Point2 {" + "x=" + x2 + ", y=" + y2 + '}');

        Point p3 = new Point(x3,y3);
        System.out.println("Point3 {" + "x=" + x3 + ", y=" + y3 + '}');

        System.out.printf("Distance 12 is : %.2f%n",p1.distance(p2));
        System.out.printf("Distance 23 is: %.2f%n",p2.distance(p3));
        System.out.printf("Distance 31 is: %.2f%n",p3.distance(p1));

        double a = p1.distance(p2);
        double b = p2.distance(p3);
        double c = p3.distance(p1);

        if (a < b+c && b< a+c && c < a+b)
        {
            System.out.println("Day la 3 diem tao nen 1 tam giac");
            System.out.printf("Chu vi cua tam giac do la : %.2f%n",a+b+c);
        }else {
            System.out.println("Day khong phai la 3 diem tao nen 1 tam giac");
        }


    }
}