package moolya;

import java.util.ArrayList;

public class array_list {
    public static void main(String[] args) {
//        int[] j=new int[10];   // static it will not change
//        j[10]=12;   // out of bond

        // array list
        // dynamic in nature
        // .pop----> it will remove the last box element

        ArrayList<Integer> i = new ArrayList<Integer>();
//        i.add(0); //0
       i.add(4); //
        i.add(20); //2
//        i.add(21); // 3
//        i.add(45); // 4
//        i.add(44); //5
//        i.add(5, 10); // it will store in 12 index  // replace the index value and push right the values
//        System.out.println(i);
        i.remove(0);
        System.out.println(i);
        ArrayList<String> j = new ArrayList<String>();

    }
}
