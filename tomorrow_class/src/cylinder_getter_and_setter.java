class cylinder{
	public double radius,height;

	public cylinder(double r, double h) {
		this.radius=r;
		this.height=h;
	}
//	public void set_radius(double r) {
//		this.radius=r;
//	}
//	public void set_height(double h) {
//		this.height=h;
//	}
	public double get_area() {
		double area=2*radius*3.14*(radius+height);
		return area;
	}
	public double get_volume() {
		double volume=3.14*radius*radius*height;
		return volume;
	}
}
public class cylinder_getter_and_setter {

	public static void main(String[] args) {
		cylinder cy=new cylinder(2.5,4.8);
//		cy.set_radius(2);
//		cy.set_height(2);
		System.out.println(cy.get_area());
		System.out.println(cy.get_volume());
	}

}
