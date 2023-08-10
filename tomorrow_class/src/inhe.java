class calcu{
    calcu(){
        System.out.println("I am a const of parent class");
    }
    calcu(int i){
        System.out.println("I am a overloaded const of parent class having the value of i"+i);
    }
    public static void tc1(){

    }
}
class su{
    public static void tc1(){

    }
}
class calcu1 extends calcu {
   calcu1(){
       super(7);
       System.out.println("I am constructor of child class");
   }
}
public class inhe {
    public static void main(String[] args) {
    calcu1 c2=new calcu1();

    }
}
