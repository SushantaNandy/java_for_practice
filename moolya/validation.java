package moolya;
class vandana{
    private String id; private String name;  String regex = "^[a-zA-Z]+$";  // access modifer public, private getter and setters for set or attributes


   public void setId(String i){
        if (i.matches(regex)){
            this.name=i;
            System.out.println("correct string set");
        }
        else{
            System.out.println("wrong string set");
        }
    }

}
public class validation {
    public static void main(String[] args) {
      vandana v=new vandana();
      v.setId("nandy123");   // 1234 int    "1234"---> string   regex char chracter
    }
}
