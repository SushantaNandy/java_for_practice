package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;

public class lecture1 {


    public static void main(String[] args) throws IOException {

        ArrayList<Character> arr=new ArrayList<>();
        arr.add('r'); arr.add('a'); arr.add('m');
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String str=br.readLine();
    if (arr.size()==str.length()){
        for (int i=0;i<str.length();i++){
            if (arr.contains(str.charAt(i))==true){  // ram --> there mar--->
                System.out.println("anagram");
            }else {
                System.out.println("not anagrom");
            }
        }
    }else {
        System.out.println("not anagram");
    }
// legth==le

// clime=3 m /fall=2 m /has to reach=10 m
        // 1m + 1m =11 days

    }
}


// coder:-AI and programmer:- developer +logic
// anagram
//abbc , cbba, bbca, babc, cabb
//ram , mar, arm, shiva
// there lenth should be equal

// 2logic :- arraylist, for loop, if-else statement







