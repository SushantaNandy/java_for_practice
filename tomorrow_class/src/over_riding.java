class a{
    public void tc1(){
        System.out.println("I am method 1 of class a");
    }
}
class b extends a{
    public void tc1(){   // over-riding the method present in the parent class. Redefining the method in parent class
        System.out.println("I am method 1 of class b");
    }
}
public class over_riding {
    public static void main(String[] args) {
        b B=new b();
        B.tc1();
//        a A =new a();
//        A.tc1();
    }
}
//Run-Time Polymorphism: Whenever an object is bound with the functionality at run time, this is known as runtime
// polymorphism. The runtime polymorphism can be achieved by method overriding.