package Session4;

import java.util.Scanner;

public class Employee {
    int id;
    String firstName;
    String lastName;
    int salary;
    void initialize(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter ID:");
        id= scan.nextInt();
        System.out.println("Enter first name:");
        firstName= scan.next();
        System.out.println("Enter last name:");
        lastName= scan.next();
        System.out.println("Enter salary:");
        salary= scan.nextInt();
    }
    void display(){
        System.out.println("Id is:"+id);
        System.out.println("First name is:"+firstName);
        System.out.println("Last name is:"+lastName);
        System.out.println("Salary is:"+salary+"VND");
    }
    public void setSalary(int newSalary){
        salary=newSalary;
    }
    public int getAnnualSalary(){
        return salary*12;
    }
    public String toString(){
        return "Employee[id="+id+"  name="+firstName + lastName+" salary="+salary+"]";
    }
  /*  public int raiseSalary(){

    }*/
  public static void main(String[] args) {
      Employee e=new Employee();
      e.initialize();
      e.display();
      Employee e1= new Employee();
      System.out.printf("The AnnualSalary is: %n"+e.getAnnualSalary()+"VND");
      System.out.println("");
      System.out.println(e.toString());
  }
}
