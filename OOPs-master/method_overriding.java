package oops;
class A{
	
	public void meth2() {
		System.out.println("method 2 of class A");
	}
}
class B extends A{
	@Override     //method over-riding annotation (not mandatory) but recommended  
	public void meth2() {	// method over-riding accesess modifier of the method should not to be private
		System.out.println("method 2 of class B");	
	}
	public void meth3() {
		System.out.println("method 3 of class B");
	}
}
public class method_overriding {

	public static void main(String[] args) {
		B b= new B();
		b.meth2();
	}

}
