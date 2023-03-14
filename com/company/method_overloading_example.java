package com.company;

public class method_overloading_example {
    static void output(){
        System.out.println("good morning brother");          // 1st one
    }
    static void output(int a){                               // this one is parameter=> int a
        System.out.println("good morning brother number "+a);       // 2nd one
    }
    static void output(int a,int b){                               // this one is parameter=> int a
        System.out.println("good morning brother number " +a +"and " +b);       // 3rd one
    }
    static void output(String str){                                             // 4th one
        System.out.println("good morning "+str);
    }

    public static void main(String[] args) {
        output();         // calling my first function inside the method
        output(2);     //calling my second function inside the method  output(2)=>this one is argument, arguments are actuals
        output(2,3);
        output("sushant");
    }
}
