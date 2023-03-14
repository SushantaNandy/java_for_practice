package oops;

class base_class2{
	
	 base_class2() {		
		System.out.println("This is a base class constructor");
	}
	 
	 base_class2(int x){
		 System.out.println("This is the overloaded constructor with x value as "+x);
	 }
}

class derived_class2 extends base_class2{		//this will invoke the base class and it's constructors also
	
	 derived_class2() {		
		// super(8);			// super keyword will invoke base-class overloaded constructor
		System.out.println("This is a derived class constructor");
	}
	 derived_class2(int x,int y){	//overloaded derived class constructor
		  super(x);			//this will invoke base class overloaded constructor
		 System.out.println("This is the overloaded constructor with y value as "+y);
	 }
}

class child_class extends derived_class2{
	
	child_class(){
		System.out.println("This is a child class constructor");
	}
	child_class(int x, int y,int z){
		super(x,y);
		System.out.println("This is the overloaded constructor with z value as "+z);	
	}
}
public class super_keyword_with_overloaded_constructor {

	public static void main(String[] args) {
		//derived_class2 ds =new derived_class2(6,12);
		//child_class c= new child_class();  // this will run normal constructors of all above class
		child_class c= new child_class(11,12,13);  // this will run all overloaded constructor
	}

}
