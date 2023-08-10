package com.company;

class MyException extends Exception{
    @Override
    public String toString() {    // Exception---> .toString()   .getMessage    Exception---> throwbale.java
        return "Radius is negative";
    }

    @Override
    public String getMessage() {
        return "Radius can't be negative";
    }
}
class moolya{
    public  double area(double r) throws MyException {
        if (r<0){
            throw new MyException();
        }else {
            return Math.PI*r*r;
        }
    }

}
public class oops_lecture {
    //throw and throws

    public static void main(String[] args) {
        try {
            moolya obj=new moolya();
            double k=obj.area(-3);
            System.out.println(k);
        }
        catch (Exception e){
            System.out.println("Exception "+e.toString());
            System.out.println("Exception "+e.getMessage());
        }

        }
    }

