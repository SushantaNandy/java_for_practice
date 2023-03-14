package moolya;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
class scan{
    public static boolean read(int x){
        // it is performing some oprations
        return false;
    }
}
class buffer{
   public static boolean readli(String str){
        // it is performing some oprations
        return true;
    }
}

public class scanner {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String str= br.readLine();
//        System.out.println(str);
        buffer b=new buffer();
        b.readli("india");
        scan s= new scan();
        s.read(54);



    }
}
