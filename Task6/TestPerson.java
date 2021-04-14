package Task6;

public class TestPerson {
    public static void main(String[] args) {
        Student s1= new Student("Ngo Dat","Bac Ninh");
        s1.addCourseGrade("T2010A",97);
        s1.addCourseGrade("T2010B",98);
        s1.printGrades();
        System.out.println("Average is:" +s1.getAverageGrade());
        //test teacher class
        Teacher t1= new Teacher("Thanh Dat","Ha Noi");
        System.out.println(t1);
        String [] courses = {"T2010A","T2010B","T2010C"};
        for (String course:courses){
            if (t1.addCourse(course)){
                System.out.println(course+"added");
            }else {
                System.out.println(course +" cannot be added");
            }
        }
        for (String course:courses){
            if(t1.removeCourse(course)){
                System.out.println(course + "removed");
            }else {
                System.out.println(course + "cannot be removed");
            }
        }
    }
}
