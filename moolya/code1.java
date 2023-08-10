package moolya;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class code1 {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("ravi"); arr.add("harshia"); arr.add("saran"); arr.add("karan");
        arr.add("haritha"); arr.add("balacharan"); arr.add("rajeshwari"); arr.add("krishna");
        //filter all the name start with letter 'h'
//        int cout=0;
//        for(String str: arr){
//            if (str.startsWith("h")){
//                cout++;
//            }
//        }System.out.println(cout);

        //stream api and lambda expression
        // s.startsWith("h") ----> terminal operation
       long count= arr.stream().filter(s -> s.startsWith("h")).count();
        System.out.println(count);

//    long count=    arr.stream().filter(s ->{
//            s.startsWith("h");
//            return false;
//                }
//        ).count();
//
//        System.out.println(count);
        // print me the names which is greater than 5 .
        //arr.stream().filter(s -> s.length()>5).forEach(s -> System.out.println(s));
        //only show me the first element
        //.limit
        //arr.stream().filter(s -> s.length()>5).limit(2).forEach(s -> System.out.println(s));
        //map method
//        arr.stream().filter(s -> s.endsWith("a")).
//                map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
        //sorted method
        //lexogrocal manner
        // apple, abx, acd, bcd,bbd----> abx,acd,apple,bbd,bcd
        arr.stream().map(s -> s.toUpperCase()).
                sorted().forEach(s -> System.out.println(s));
        //anymatch method
       boolean bn= arr.stream().anyMatch(s -> s.equalsIgnoreCase("SARAN"));
        System.out.println(bn);
       // to convert back the output in list again
        List<String> newList= arr.stream().map(s -> s.toUpperCase()).
                sorted().collect(Collectors.toList());

        newList.add("sushanta");
        System.out.println(newList);


        }

}
