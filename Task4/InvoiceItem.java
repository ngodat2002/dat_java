package Session4;

import java.util.Scanner;

public class InvoiceItem {
    String id;
    String desc;
    int qty;
    double unitPrice;
    void initialize(){
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter ID:");
        id= scan.next();
        System.out.println("Enter desc:");
        desc= scan.next();
        System.out.println("Enter Qty:");
        qty= scan.nextInt();
        System.out.println("Enter Price:");
        unitPrice= scan.nextDouble();
    }
    void display(){
        System.out.println("ID:"+id);
        System.out.println("Desc:"+desc);
        System.out.println("Qty:"+qty);
        System.out.println("Price:"+"$"+unitPrice);
    }
    public void setQty(int newQty){
        qty=newQty;
    }
    public void setUnitPrice(double newUnitPrice){
        unitPrice=newUnitPrice;
    }
    public double getTotal(){
        return qty*unitPrice;
    }
    public String toString(){
        return "InvoiceItem[id="+id+" "+desc+" "+qty+" "+unitPrice+"]";
    }
    public static void main(String[] args) {
        InvoiceItem i=new InvoiceItem();
        InvoiceItem i2=new InvoiceItem();
        i.initialize();
        i.display();
        System.out.printf("The total is:%n"+"$"+i.getTotal());
        System.out.println("");
        System.out.println(i.toString());
        System.out.println("=====================================");
        i2.setQty(15);
        i2.setUnitPrice(12.20);
    }
}
