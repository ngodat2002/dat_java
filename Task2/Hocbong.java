package Session1;

import java.util.Scanner;

public class Hocbong {
    public static void main(String[] args) {
        int Maths;
        int Science;
        int English;
        int Toan;
        int KhoaHoc;
        int TiengAnh;
        int TotalOfDat;
        int TotalOfDat1;
        int TotalNgoDat;
        int TotalNgoDat1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter marks obtained in Marks: ");
        Maths = scan.nextInt();
        System.out.println("Enter marks Obtained in Science:");
        Science = scan.nextInt();
        System.out.println("Enter marks obtained in English:");
        English = scan.nextInt();
        System.out.println("");
        System.out.println("");
        System.out.println("Enter marks obtained in Marks: ");
        Toan = scan.nextInt();
        System.out.println("Enter marks Obtained in Science:");
        KhoaHoc = scan.nextInt();
        System.out.println("Enter marks obtained in English:");
        TiengAnh = scan.nextInt();

        System.out.println("");
        System.out.println("");
        System.out.println("Marks of Ngo Chi Thanh Dat:");
        System.out.printf("Match = %d\n", Maths);
        System.out.printf("Science = %d\n", Science);
        System.out.printf("Match = %d", English);
        System.out.println("");
        System.out.println("");
        System.out.println("Marks of Ngo Dat:");
        System.out.printf("Match = %d\n", Toan);
        System.out.printf("Science = %d\n", KhoaHoc);
        System.out.printf("Match = %d\n", TiengAnh);
        TotalOfDat = Maths + Science + English;
        TotalOfDat1 = (TotalOfDat/3);
        TotalNgoDat = Toan + KhoaHoc +TiengAnh;
        TotalNgoDat1 = (TotalNgoDat/3);
        System.out.printf("Total marks by Ngo Chi Thanh Dat = %d\n",TotalOfDat);
        System.out.printf("Percentage = %d",TotalOfDat1);
        System.out.print("%");
        System.out.println("");
        System.out.println("");
        System.out.printf("Total marks by Ngo Dat = %d\n",TotalNgoDat);
        System.out.printf("Percentage = %d",TotalNgoDat1);
        System.out.print("%");
        System.out.println("");
        System.out.println("");
        if(TotalOfDat1< TotalNgoDat1){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
        if (TotalOfDat1>TotalNgoDat1){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        if (TotalOfDat1== TotalNgoDat1){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
        if (TotalOfDat1 >75){
            System.out.println("Chuc mung Ngo Chi Thanh Dat da co 20.000VND");
        }
        else if (TotalOfDat1<75 && TotalOfDat1>60){
            System.out.println("De xem da");
        }
        else {
            System.out.println("Thoi hoc lai di ban a!");
        }
        if (TotalNgoDat1<75 && TotalNgoDat1>60){
            System.out.println("Chuc mung Ngo Dat da co 10.00VND");
        }
        else {
            System.out.println("Thoi Hoc lai di");
        }
    }
}
