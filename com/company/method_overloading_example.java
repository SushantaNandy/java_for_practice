package com.company;

public class method_overloading_example {
    static void output(){
        System.out.println("good morning brother");
    }
    static void output(int a){                               // this one is parameter=> int a
        System.out.println("good morning brother number "+a);
    }
    static void output(int a,int b){                               // this one is parameter=> int a
        // This method ---->output and it have signature ----> (int a,int b)
        //no two method have same method name and signature.
        System.out.println("good morning brother number " +a +"and " +b);
    }
    static void output(String str){
        System.out.println("good morning "+str);
    }

    public static void main(String[] args) {
        output();         // calling my first function inside the method
        output(2);     //calling my second function inside the method
        // output(2)=>this one is argument, arguments are actuals
        output(2,3);
        output("sushant");
    }
}
//Method Signature in java is defined as the structure of a method that is designed by the programmer.
// Method Signature is the combination of a method's name and its parameter list.
// A class cannot have two methods with the same signature.

//Compile Time Polymorphism: Whenever an object is bound with its functionality at the compile time, this
// is known as the compile-time polymorphism. At compile-time, java knows which method to call by
// checking the method signatures. So this is called compile-time polymorphism or static or early binding.
// method -overloading is type of compile tyme polymerphism.
