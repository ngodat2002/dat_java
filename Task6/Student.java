package Task6;

public class Student extends Person{
    private String [] courses;
    private int[] grades;
    private int numCourses;
    private static final int MAX_COURSES =30;
    public Student(String name,String address){
        super(name,address);
        numCourses=0;
        courses=new String[MAX_COURSES];
        grades=new int[MAX_COURSES];
    }
    public String toString(){
        return "Student:"+super.toString();
    }
    public void addCourseGrade(String course,int grade){
        courses[numCourses]= course;
        grades[numCourses]=grade;
        numCourses++;
    }
    //Print all course4s taken and their grades
    public void printGrades(){
        System.out.println(this);
        for (int i=0;i<numCourses;i++){
            System.out.println(" " +courses[i]+ ":"+grades[i]);
        }
        System.out.println();
    }
    //compute the average grade

    public double getAverageGrade(){
        int sum=0;
        for (int i=0;i<numCourses;i++){
            sum +=grades[i];
        }
        return (double) sum/numCourses;
    }
}
