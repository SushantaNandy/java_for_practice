package moolya;
class sus{
    //it cointains attributes
    int id; String name;  //attributes
    public void met(){   // actions
        System.out.println(id);
        System.out.println(name);
    }
}
public class new_class {
    public static void main(String[] args) {
        sus s=new sus();
        sus s1=new sus();
        s.id=343; s.name="sushanta";  s1.id=324; s1.name="kamla";
//        System.out.println(s.id);
//        System.out.println(s.name);
        s.met(); s1.met();
    }
}
