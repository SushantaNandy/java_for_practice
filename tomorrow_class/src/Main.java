class employee{
   private int id; String name;

    employee(){
        id=12345;
        name="susma";

    }
    employee(int your_id,String your_name){
        id=your_id;
        name=your_name;
    }
    public void setid(int i){
        this.id=i;
    }
    public int getid(){
        return id;
    }
    public void setname(String n){
        this.name=n;
    }
    public String getname(){
        return name;
    }

}

public class Main {

    public static void main(String[] args) {
        employee e= new employee(123,"nandy");
//        e.name="sushant";
//        e.setid(123);
        System.out.println(e.getid());
        System.out.println(e.getname());
    }
}