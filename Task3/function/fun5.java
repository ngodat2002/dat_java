package function;

public class fun5 {
    public static void main(String[] args) {
        int number =8, result;
        System.out.println("In caller, before calling the method,numer is:" +number);
        result=increment(number);
        System.out.println("In caller, after calling the method, number is:" +number);
        System.out.println("The result is" + result);
    }
    public  static int increment(int number){
        System.out.println("Inside method, before,number is" +number);
        ++number;
        System.out.println("Inside method,after, number is" + number);
        return number;
    }
}
