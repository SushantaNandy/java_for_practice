package oops;

class cal{
	int num1,num2;
	int sum=0,pro=1; double div;
	public void cal1() {
		sum=num1+num2;
		System.out.println(sum);
	}
	public void cal2() {
		if(num1>num2) {
			sum=num1-num2;
			System.out.println(sum);
		}
	}
	public void cal3() {
		pro=num1*num2;
		System.out.println(pro);
	}
	public void cal4() {
		div=num1/num2;
		System.out.println(div);
	}
}

public class calculator {

	public static void main(String[] args) {
		cal c= new cal();
		c.num1=4;
		c.num2=2;
		c.cal1();
		c.cal2();
		c.cal3();
		c.cal4();
	}

}
