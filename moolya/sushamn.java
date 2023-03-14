package moolya;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sushamn {

    public static void main(String[] args) throws IOException  // main method
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int x=Integer.parseInt(br.readLine());
        int y=Integer.parseInt(br.readLine());


        System.out.println(10/x);

        int[] z=new int[5];
        z[0]=1;
        z[1]=2;
        z[3]=3;
        z[4]=12;
        System.out.println(z[y]);
    }
}


