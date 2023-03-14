package oops;

class base_class1{
	
	 base_class1() {		// constructor1
		System.out.println("This is a base class constructor");
	}
	 
	 base_class1(int x){
		 System.out.println("This is the overloaded constructor with x value as "+x);
	 }
}

class derived_class1 extends base_class1{		//this will invoke the base class and it's constructors also
	
	 derived_class1() {		// constructor2
		System.out.println("This is a derived class constructor");
	}
}

public class overloaded_constructor_with_inheriantance {

	public static void main(String[] args) {
		//derived_class1 s= new derived_class1();   // In this situation the overloaded constructor will not work
		base_class1 bs= new base_class1(4);
		derived_class1 s= new derived_class1();
		//If we want to invoke the overloaded constructor from derived class we need to have "super" keyword
	}

}
