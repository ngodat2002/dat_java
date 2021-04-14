package Task6;

public class Teacher extends Person {
    private int numCourses;
    private String[] courses;
    private static final int MAX_COURSES=5;
    //CONSTRUCTOR A TEACHER INSTANCE WITH THE GIVEN NAME AND ADDRESS
    public Teacher(String name,String address){
        super(name, address);
        numCourses=0;
        courses = new String[MAX_COURSES];
    }
    public String toString(){
        return "Teacher:"+super.toString();
    }
    //adds a course.Return false if the course has already existed
    public boolean addCourse(String course){
        for (int i=0;i<numCourses;i++){
            if (courses[i].equals(course)) return false;
        }
        courses[numCourses]=course;
        numCourses++;
        return true;
    }
    //Remove
    public boolean removeCourse(String course){
        boolean found =false;
        int courseIndex=-1;
        for (int i=0;i<numCourses;i++){
            if(courses[i].equals(course)){
                courseIndex=i;
                found=true;
                break;
            }
        }
        if (found){
            for (int i= courseIndex;i<numCourses-1;i++){
                courses[i]=courses[i+1];
            }
            numCourses--;
            return true;
        }
        else {
            return false;
        }
    }
}
