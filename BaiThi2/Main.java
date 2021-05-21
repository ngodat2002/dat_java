package BaiThi2;

import Task6.Person;

import java.sql.*;
import java.util.Scanner;

public class Main {
    private static Scanner scanner= new Scanner(System.in);
    private static StudenList studentlist = new StudenList("T2010A");
    public static void main(String[] args) {
        boolean quit=false;
        while (!quit){
            System.out.println("\nMenu management :\npress");
            System.out.println("1.Add Student Records\n"+
                    "2.Display student records.\n"+
                    "3.Save.\n"+
                    "4.Exit.");
            System.out.println("Choose your action:");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 1:
                    addNewStudent();
                    break;
                case 2:
                    studentlist.printStudent();
                    break;
                case 3:
                    saveStudent();
                    break;
                case 4:
                    System.out.println("Exit App!");
                    quit= true;
            }
        }
    }
    private static void addNewStudent(){
        System.out.println("Enter StudentID :");
        String id= scanner.nextLine();
        System.out.println("Enter StudentName:");
        String name= scanner.nextLine();
        System.out.println("Enter Address:");
        String address= scanner.nextLine();
        System.out.println("Enter Phone");
        int phone = scanner.nextInt();
        Student newStudent = Student.createStudent(id,name,address,phone);
        if (studentlist.addNewStudent(newStudent)){
            System.out.println("New Student added id ="+id+", name="+name+", address ="+address+", phone ="+phone);
        }else {
            System.out.println("Cannot Add");
        }
    }
    public static void saveStudent(){
        try {
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","");
            Statement stmt = conn.createStatement();
            {
                Student stu= new Student();
                String select = "insert into students_school values (?,?,?,?)";
                PreparedStatement pstmt = conn.prepareStatement(select);
                pstmt.setString(1, stu.getId());
                pstmt.setString(2,stu.getName());
                pstmt.setString(3,stu.getAddress());
                pstmt.setInt(4,stu.getNumber());
                int rowsInsert = pstmt.executeUpdate();
                System.out.println(rowsInsert+"Student Save");
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
