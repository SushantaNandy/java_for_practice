package oops;

class base_class{
	
	 base_class() {		// constructor1
		System.out.println("This is a base class constructor");
	}
}

class derived_class extends base_class{		//this will invoke the base class and it's constructor also
	
	 derived_class() {		// constructor2
		System.out.println("This is a derived class constructor");
	}
}
public class inherientance_with_constructor {

	public static void main(String[] args) {
		
		//base_class bs= new base_class();
		derived_class ds =new derived_class();
	}

}
