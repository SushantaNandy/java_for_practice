class xyz{
    public int x=5;
    private int y=6;  // can't be acess under same package but can be access under same class
    int z=7;
    protected int a=8;
    public void tc(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
class xy extends xyz{
    public void tc1(){
        System.out.println(x);
        System.out.println(a);
       // System.out.println(y);
        System.out.println(z);
    }
}
public class acm_details {
    public static void main(String[] args) {
    xyz obj=new xyz();
        System.out.println(obj.x);
        // System.out.println(obj.y); can't be use because it has private acm
        System.out.println(obj.z);
        System.out.println(obj.a);

    }
}
