package Stirng;

public class string5 {
    public static void main(String[] args) {
        String str1 = 123 + "babab";
        String str2 = 12.34 + "5";
        String str3 = 'c' + "5";
        String str4 = true + "5";
        //using string.valueOf
        String str5 = String.valueOf(123456);
        String str6 = String.valueOf(true);
        String str7 = String.valueOf(55.66);
        //string toString()
        String str8 = Integer.toString(1234);
        String str9 = Double.toString(1.23);
        String str10 = Character.toString('z');
    }
}
