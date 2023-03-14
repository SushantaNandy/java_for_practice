package moolya;
class alok{
   static int x=2; static int prod;
    public static int  test(int y){
        prod=y;
        prod=prod*x*x;
        return prod;
    }
}
class saksh extends alok{
    public static void test1(){
        alok a=new alok();
        int num1=a.test(3);
        int num=x+5;
        System.out.println(num);
        System.out.println(a);
    }
}
public class inherit {
    public static void main(String[] args) {
       // saksh s=new saksh();
        saksh.test1();
    }
}
