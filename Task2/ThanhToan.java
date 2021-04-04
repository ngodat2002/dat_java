package Session1;

import java.util.Scanner;

public class ThanhToan {
    public static void main(String[] args) {
        int Shirts;
        int Trousers;
        int PriceShirts=300;
        int PriceTrousers=700;
        int TotalS;
        int TotalT;
        int Discount;
        int NewTotal;
        int NewTotal1;
        int TotalDis;
        int ToTal;
        int point;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of Shirts to order:");
        Shirts = scan.nextInt();
        System.out.println("Enter the number of Trousers to order:");
        Trousers = scan.nextInt();
        System.out.println("");
        System.out.println("");
        TotalS=Shirts*PriceShirts;
        TotalT=Trousers*PriceTrousers;
        ToTal=TotalS+TotalT;
        NewTotal1=ToTal;
        System.out.println("Item           Quantity        Price       Total");
        System.out.println("=============================================================");
        System.out.printf("Shirts            %d             %d          %d\n",Shirts,PriceShirts,TotalS);
        System.out.printf("Trousers          %d             %d          %d\n",Trousers,PriceTrousers,TotalT);
        if(ToTal > 3000){
            TotalDis = ToTal/10;
            NewTotal = ToTal-TotalDis;
            point = NewTotal/100;
            System.out.printf("Discount                                      %d",TotalDis);
            System.out.println("");
            System.out.println("=============================================================");
            System.out.printf("\nNew Total                                   %d",NewTotal);
            System.out.println("");
            System.out.println("=============================================================");
            System.out.printf("Points Earned     %d\n",point);
            System.out.println("ThanK You!");

        }
        else {
            System.out.println("Xin loi ban khong duoc giam gia :))\n");
            System.out.println("=============================================================");
            System.out.printf("\nNew Total                                   %d",NewTotal1);
            System.out.println("");
            System.out.println("=============================================================");
            System.out.println("Points Earned     0");
            System.out.println("ThanK You!");
        }
    }
}
