package oops;

class circle1{
	private double radius;
	private double perimetre;
	public void area(double r,double p) {  //passing the radius and perimetre both
		this.radius=r;          // this keyword is same is pointing to which element it should focus
		this.perimetre=p;
		double check=3.14*r*r;
		if(check==153.86 && perimetre==43.96) {         // it will check weather the provided radius is correct or not
			System.out.println("correct radius and perimetre provided");
		}
		else{
			System.out.println("wrong radius and perimetre");
		}
	}
}

public class getter_and_setter_example2 {

	public static void main(String[] args) {
		circle1 circle=new circle1();
		circle.area(7,43.96);
	}

}
