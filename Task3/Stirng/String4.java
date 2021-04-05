package Stirng;

public class String4 {
    public static void main(String[] args) {
        String inStr = "5566";
        int number = Integer.parseInt(inStr);
        float aFloat =  Float.parseFloat(inStr);
        double aDouble = Double.parseDouble("1.2345");
        aDouble = Double.parseDouble("1.2e-3");
        //string to char
        String msg = "Hello, world";
        char msgChar;
        for (int idx = 0;idx<msg.length();++idx){
            msgChar = msg.charAt(idx);
        }
        //string boolean
        String boolStr = "true";
        boolean done =Boolean.parseBoolean(boolStr);
        boolean valid = Boolean.parseBoolean("false");

    }
}
