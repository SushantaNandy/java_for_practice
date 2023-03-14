package oops;

class test{
	private int id;			// changing the access modifier to private will directly not accept the values 
	private String name;	// in the form of t.id
	
	public String getname() {
		return name;
	}
	
	// for this i have to create one another method setter method which can accept values from main method
	public void setname(String n) {		
		name=n;
	}
	public void setid(int i) {
		id=i;
	}
	public int getid() {
		return id;
	}
}

public class getter_and_setter {

	public static void main(String[] args) {
		test t= new test();
//		t.id=23;
//		t.str="sushant";
		
		t.setid(12);
		t.setname("sushanta");
		System.out.println(t.getname());
	}

}
