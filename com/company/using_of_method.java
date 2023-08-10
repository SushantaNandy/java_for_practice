package com.company;

public class using_of_method {
   static private int a;
    static int sushant(int x, int y) {       // this basically create a copy of the main variables
        int z;
        if (x > y) {                   // if any changes are made in this method variables it will not alter the original main variable
            z = x - y;
        } else {
            z = y - x;
        }
        return z+a;
    }

    public static void main(String[] args) {
        int a=5; int b=8; int c;
        using_of_method u=new using_of_method();
        u.a=5;
        //c=sushant(a,b);    // calling of function
      //  System.out.println(c);
        int a1=10; int b1=5; int c1;
      //  c1=sushant(a1,b1);
       // System.out.println(c1);
    }
}
