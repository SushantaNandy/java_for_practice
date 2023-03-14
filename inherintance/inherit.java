package inherintance;
class inherit1 {
    void testcase1(){
        System.out.println("welcome to moolya");
    }
}
public class inherit extends inherit1 {
    void testcase2(){
        System.out.println("welcome to moolyaed");
    }

    public static void main(String[] args) {
inherit i=new inherit();
i.testcase2();
inherit1 i1=new inherit1();
i1.testcase1();
inherit1 i2= new inherit();
i2.testcase1();
inherit i3= new inherit();
i3.testcase1();
// not possible
//inherit i4=new inherit1();


    }
}