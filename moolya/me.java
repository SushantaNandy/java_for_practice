package moolya;

public class me {
    public static String cal1(){   // why do we use this methods??   //
       String str="India";
        return str;
    }
    public static int cal1(int z){  // actions inside the methods
        return z%2;
    }
    public static void cal1(String str){
        System.out.println(str.length());
    }

    public static void main(String[] args) {   // main
    me m=new me(); // object initialization
        int str= m.cal1(43);
        System.out.println(str);
       m.cal1(23);
       m.cal1("sushanta");  // dry ---> don't repeat you. don't repeat the locic again and again
    }
}
