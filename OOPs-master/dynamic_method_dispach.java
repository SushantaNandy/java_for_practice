package oops;
class yug{		// this is a super-class
	public void sus() {  
		System.out.println("I am sushant of class yud");
	}
	public void narayana() {
		System.out.println("I am narayana father of yug");
	}
}
class kalyug extends yug{  // this is a sub-clas of yug
	@Override
	public void sus() {
		System.out.println("I am sushant of class kalyug");
	}
	public void subrata() {
		System.out.println("I am subrata from kalyug");
	}
}
public class dynamic_method_dispach {

	public static void main(String[] args) {
		yug y=new kalyug();  //we can point sub-clss from super-class
		y.sus();  // this will invoke sub-class method  //this is only known as run time polymerphism
		y.narayana();
		//y.subrata();  // not allowed
	}

}
