package moolya;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class  checking{
    public  void palin(String str){   // sushanta----> .charAt(2)
        String ch=""; long c=3434556;
        int i=str.length();  // sus---> 3 0,1,2
        for (int j=i-1;j>=0;j--){
            ch=ch+str.charAt(j);
        }
        if (ch.equals(str)){
            System.out.println("palindrom string");
        }else {
            System.out.println("not a palindrom");
        }
    }
}
public class method_palindrom {
    public static void main(String[] args) throws IOException {

        //121, 131 , sus---> original sus----> same
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        checking obj=new checking();
        obj.palin(str);

    }
}
