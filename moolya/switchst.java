package moolya;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class switchst {
    public static void main(String[] args) throws IOException {
        int num1, num2, ch;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your day");
        num1=Integer.parseInt(br.readLine());
        num2=Integer.parseInt(br.readLine());
        ch=Integer.parseInt(br.readLine());
       switch (ch){
           case  1:
               if (num1>num2){
                   System.out.println(num1-num2);
               }

               break;
           case  2:
               if (num2>num1){
                   System.out.println(num2-num1);
               }

               break;
//           case  3:
//               System.out.println("wednesday");
//               break;
//           case  4:
//               System.out.println("Thursday");
//               break;
//           case  5:
//               System.out.println("Friday");
//               break;
//           case  6:
//               System.out.println("saturday");
//               break;
//           case  7:
//               System.out.println("sunday");
//               break;
//           default:
//               System.out.println("you have entered a wrong day");
       }


    }
}