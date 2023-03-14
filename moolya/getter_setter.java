package moolya;
class ch{
    private int id; private String name;
    public void set(int i,String j){
        this.id=i;  this.name=j;
        }
   public int get(){
        return id;

   }
   public String getSalary(){
        return name;
   }
}
public class getter_setter {
    public static void main(String[] args) {
        ch c=new ch();
       c.set(345, "234tfdd");
        System.out.println(c.getSalary());
        System.out.println(c.get());

    }
}
