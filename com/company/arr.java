package com.company;

class arr {
     public static void main(String[] args) {
        int [] marks={23,45,22};       // Declaration of array.
        //System.out.println(marks[0]);// Display or print the array.
        if(marks[0]<marks[1]&&marks[0]<marks[2]){
            System.out.println("1st one is smallest " +marks[0]);
        }else if(marks[1]<marks[0]&&marks[1]<marks[2]){
            System.out.println("2nd one is smallest " +marks[1]);
        }else {
            System.out.println("3rd one is smallest " +marks[2]);
        }
    }
}
