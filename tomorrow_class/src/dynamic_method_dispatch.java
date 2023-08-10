class phone{
    public void tc1(){
        System.out.println("Method 1 of class A");
    }
    public void tc3(){
        System.out.println("Method 2 of class A");
    }
}
class smartphone extends phone{
    public void tc1(){
        System.out.println("Method 1 of class B");
    }
    public void tc2(){
        System.out.println("Method 2 of class B");
    }
}
public class dynamic_method_dispatch {
    public static void main(String[] args) {
        phone p=new smartphone();  // this is used in run time polymerphism. one object multiple form.
     //phone p----> super class (phone) reference and name of object is p
     //new smartphone()----> run time object creation . Because of new keyword .
     // new ---> object is created in run-time.
        // so if we run tc1() method it will run the method present in the sub-class becuse object is of sub-class.
      p.tc1();
      // but reverse is not allowed . meaning  smartphone s=new phone();
        //Run time polymorphism is also known as Dynamic Method Dispatch as the method functionality is decided
        // dynamically at run time based on the object. It is also called “Late Binding” as the process of binding the
        // method with the object occurs late after compilation.
    }
}
