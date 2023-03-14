package oops;

class circle{
	public double radius;
	public void area(double r) {  //passing the radius only.
		this.radius=r;          // this keyword is same is pointing to which element it should focus
		double check=3.14*radius*radius;
		if(check==153.86) {         // it will check weather the provided radius is correct or not
			System.out.println("correct radius provided");
		}
		else{
			System.out.println("wrong radius");
		}
	}
}

public class getter_and_setter_example {

	public static void main(String[] args) {
		circle circle=new circle();
		circle.area(9);
		

	}

}
