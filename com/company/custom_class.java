package com.company;
class sushant {              // my custom class  //super class
    String str;
    int id;
    char ch;  int [] marks;
}

class custom_class {
    public static void main(String[] args) {
        System.out.println("this is the main class");
        sushant obj=new sushant();     // creating an new object called obj
        obj.str="moolya123";
        obj.id=1234567;
        obj.ch='a';
        obj.marks= new int[]{12, 32};
        System.out.println(obj.marks[0]);
        System.out.println("name of my company is "+obj.str+" and my id is "+obj.id);
        obj.str="afsgsf123";  //overiding
        obj.id= 1234;
        System.out.println("name of my company is "+obj.str+" and my id is "+obj.id);
    }
}
