abstract class x{
//Abstraction is a process of hiding the implementation details and showing only functionality to the user.
    //Abstraction lets you focus on what the object does instead of how it does it.
    //There are two ways to achieve abstraction in java
    //1.Abstract class (0 to 100%)
    //2.Interface (100%)
    public void tc(){
        System.out.println("Inside abstract class we may have concrete method.");
    }
   abstract public void tc1();
}
class y extends x{
    //Mostly, we don't know about the implementation class (which is hidden to the end user),
    // and an object of the implementation class is provided by the factory method.
    public void tc2(){
        System.out.println("india");
    }

    @Override
    public void tc1() {
        System.out.println("hi");
    }
}
abstract class z extends x{
    public void tc3(){
        System.out.println("moolya");
    }
}
public class abstract_class_and_method {
    public static void main(String[] args) {
    x X=new y(); //possible
   // x obj=new x();   not possible because we can't create object of abstract class
    y Y =new y();  //possible
        Y.tc1();
    }
    }

