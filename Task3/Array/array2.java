package Array;

public class array2 {
    public static void main(String[] args) {
        int[] marks = {74,43,58,60,90,64,70};
        int sum = 0;
        int sumSq= 0 ;
        double mean, stdDev;
        //compute
        for (int i =0 ;i< marks.length;i++){
            sum += marks[i];
            sumSq += marks[i] * marks[i];
        }
        mean = (double) sum/ marks.length;
        stdDev = Math.sqrt((double) sumSq / marks.length - mean * mean);
        //print results
        System.out.printf("Mean is : %.2f%n",mean);
        System.out.printf("Standard deviation id: %2.2f%n ",stdDev);
    }
}
