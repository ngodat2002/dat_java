package Session1;

public class ex4 {
    public static void main(String[] args) {
        int lowerbound = 1;
        int upperbound = 1000;
        int sum = 0;
        int number = lowerbound;
        while (number <= upperbound){
            sum = sum + number;
            ++number;
        }
        System.out.println("The sum from "+ lowerbound + " to " + upperbound +" is " + sum);
    }
}
