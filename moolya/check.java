package moolya;
class chw{
    private int id; private int salary;
    public void setId(int i){
        this.id=i;
    }
    public int getId(){
        return id;
    }

}
public class check {
    public static void main(String[] args) {
       chw c=new chw();
       //c.id=12; c.salary=21333;
        c.setId(321);
        System.out.println(c.getId());
    }
}
