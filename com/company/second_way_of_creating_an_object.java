package com.company;

public class second_way_of_creating_an_object {
     int sushant(int x, int y) {
        int z;
        if (x > y) {
            z = x - y;
        } else {
            z = y - x;
        }
        return z;
    }

    public static void main(String[] args) {
        int a=5; int b=8; int c;
        second_way_of_creating_an_object obj= new second_way_of_creating_an_object(); // by creating an object
        c=obj.sushant(a,b);           // awsome way of calling the function by an object
        System.out.println(c);
        int a1=10; int b1=5; int c1;
        c1=obj.sushant(a1,b1);
        System.out.println(c1);
    }
}
