package access_modifier;

public class acm4 {
     static int a=5;
     static int b;
     static void testcase2(int x){
          System.out.println("x= "+x);
          System.out.println("a= "+a);
          System.out.println("b= "+b);
     }
     static {
          b=a*4;
     }

     public static void main(String[] args) {
          acm4.a=20;
          testcase2(20);
     }
}
