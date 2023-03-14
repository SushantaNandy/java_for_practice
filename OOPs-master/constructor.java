package oops;

class test2{
	private int id;			// changing the access modifier to private will directly not accept the values 
	private String name;	// in the form of t.id
	
	
	public test2(int id_to_be_set,String name_to_be_set){
		id=id_to_be_set;
		name=name_to_be_set;
	}
	
	public String getname() {
		return name;
	}
	
	// for this i have to create one another method setter method which can accept values from main method
//	public void setname(String n) {		
//		name=n;
//	}
//	public void setid(int i) {
//		id=i;
//	}
	public int getid() {
		return id;
	}
}

public class constructor {

	public static void main(String[] args) {
		
		test2 t= new test2(23,"sushanta");
//		t.setname("sunil");    // this both t.setname("sunil") and t.setid(1) is used for method over riding
//		t.setid(1);
		System.out.println(t.getid());
		System.out.println(t.getname());
	}


	}
