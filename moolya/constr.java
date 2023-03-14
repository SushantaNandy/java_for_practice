package moolya;
class susma{
    private int id; private String name; String regex = "^[a-zA-Z]+$";  // access modifier public, pivate, defalut, protected

    protected susma(){   //this is the constructor
      id=234456; name="moolya";
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
public class constr {
    public static void main(String[] args) {
    susma s=new susma();   // automatically invoke the constructor
        System.out.println(s.get());
        System.out.println(s.getSalary());
    }
}
