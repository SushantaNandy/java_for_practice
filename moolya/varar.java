package moolya;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class varar {
    public  int prod(int ...arr){     // int[] arr
        int product=1;
       for (int i=0; i<arr.length; i++){
           product*=arr[i];
       }
       return product;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int x=Integer.parseInt(br.readLine());
        int y=Integer.parseInt(br.readLine());
        varar v=new varar();
        System.out.println(v.prod(x,y));
        //System.out.println(prod(2,3,6));
    }
}
