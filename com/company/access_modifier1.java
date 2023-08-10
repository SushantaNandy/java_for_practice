package com.company;

import org.w3c.dom.ls.LSOutput;

public class access_modifier1 {
     public void sum(int a,int b){

         System.out.println(a+b);
     }

    public static void main(String[] args) {
         access_modifier1 ac= new access_modifier1();
         ac.sum(10,5);
    }
    class sir{
        int prod;
        access_modifier1 bc= new access_modifier1();

    }
}
