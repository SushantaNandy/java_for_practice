package oops;

class employees{
	int id;
	String name;
	public int printdetails() {			//void= non returning and if I use data type name instead of void 
		int x=0;													//it will return the value of x
		System.out.println("my id is "+id);
		System.out.println("my name is "+name);
		x=id-1;
		return x;		// this statement will return the value 
	}
}

public class creating_own_class {

	public static void main(String[] args) {
		System.out.println("this is own custom class");
		employees Sushant= new employees();		//Inilassiantion of new object
		Sushant.id=11;					//setting attributes
		Sushant.name="sushanta";
//		System.out.println(Sushant.id);
//		System.out.println(Sushant.name);
		
		//for printing the attributes
		
		System.out.println(Sushant.printdetails());	// displaing of the returened value "x" by the method.
	}

}
