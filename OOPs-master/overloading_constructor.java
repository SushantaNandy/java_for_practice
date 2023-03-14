package oops;
class rectangle{
	private int length,breath;
	public rectangle() {
		this.length=4; this.breath=2;
	}
	public rectangle(int l, int b) {
		this.length=l; this.breath=b;
	}
	public int get_length() {
		return length;
	}
	public int get_breath() {
		return breath;
	}
}
public class overloading_constructor {

	public static void main(String[] args) {
		rectangle r= new rectangle(5,3);   // for overloading pass this 2 values
		System.out.println(r.get_length());
		System.out.println(r.get_breath());

	}

}
