package moolya;
class vandana{
      String name;  String regex = "^[a-mA-M]+$";  // access modifer
   public void setId(String i){
        if (i.matches(regex)){
            name=i;
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
      v.setId("nandy");   // 1234 int    "1234"---> string   regex char chracter
    }
}
