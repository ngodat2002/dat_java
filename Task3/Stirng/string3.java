package Stirng;

public class string3 {
    public static void main(String[] args) {
        String str = "Java is cool!";
        System.out.println(str.length());
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(5));
        //Comparing two string
        String anotherStr = "Java is COOL!";
        System.out.println(str.equals(anotherStr));
        System.out.println(str.equalsIgnoreCase(anotherStr));
        System.out.println(anotherStr.equals(str));
        System.out.println(anotherStr.equalsIgnoreCase(str));
        //
        String strs = "Java is COOL!";
        System.out.println(strs.length());
        System.out.println(strs.charAt(2));
        System.out.println(strs.substring(0,3));
        System.out.println(strs.indexOf('a'));
        System.out.println(strs.lastIndexOf('a'));
        System.out.println(strs.endsWith("cool!"));
        System.out.println(strs.toUpperCase());
        System.out.println(strs.toLowerCase());
    }

}
