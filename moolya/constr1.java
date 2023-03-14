package moolya;
class susm{
    private int id; private String name; String regex = "^[a-zA-Z]+$";  // access modifier public, pivate, defalut, protected

    protected susm(String str){   //this is the constructor
        id=234456; name=str;
    }

    public void set(int i,String j){
        id=i;  name=j;
        if (j.matches(regex)) {
            name=j;
        }else {
            System.out.println("it is not a string");
        }

    }
    public int get(){
        return id;

    }
    public String getSalary(){
        return name;
    }
}
public class constr1 {
    public static void main(String[] args) {
        susm s=new susm("ed");   // automatically invoke the constructor
        s.set(2345,"moolya");
        System.out.println(s.get());
        System.out.println(s.getSalary());
    }
}
