package moolya;

public class class12 {
    public static void main(String[] args)
    {// ARRAY AND STRING
        String a="AMERICA";   // I ---> 0 N---> 1  D---> 2 A---> 4    [I,N,D,I,A]---> [0,1,2,3,4]
        // methods
        // 1. finding the length of string
        System.out.println(a.length());//----> find the length of string

        System.out.println(a.toLowerCase());
        System.out.println(a.trim());  // remove the spaces from left and right
       System.out.println(a.substring(1));   //MERICA
        System.out.println(a.replace('I','S'));
        System.out.println(a.charAt(2));
        System.out.println(a.equals("America"));
        System.out.println(a.equalsIgnoreCase("AMERICa"));
    }

}
