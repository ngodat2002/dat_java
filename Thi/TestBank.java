package Thi;

import java.util.Scanner;

public class TestBank {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Nhap so tien :");
        double bal= scan.nextDouble();
        System.out.println("Nhap lai suat");
        double rat= scan.nextDouble();
        Bank b1=new Bank(bal,rat);
        System.out.println(b1);
        System.out.println("");
        System.out.printf("Interest : $%.2f%n ",b1.calculateInterest());
    }
}
