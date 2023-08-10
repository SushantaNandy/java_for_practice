interface phon{  // In java interface is a group of relatable method with empty bodies.
    int a=56;

     void ring() ;

     void call();
     static  void tc(){
         System.out.println("Just checking");
     }
//A static method is declared using the static keyword and it will be loaded into the memory
// along with the class. You can access static methods using class name without instantiation.
}
class smartphon implements phon{
    @Override
    public void ring() {
        System.out.println("my smartphone will ring");
    }
    @Override
    public void call() {
        System.out.println("my smartphone will make a call");
    }
    public void cal2() {
        System.out.println("I am cal2");
    }
}

public class interface01 {
    public static void main(String[] args) {
//        phon obj=new phon();  ---> not allowed
    phon.tc();
    }
}
