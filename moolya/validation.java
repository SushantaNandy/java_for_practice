package moolya;
class vandana{
    private   String name; private String pnumber;
     String regex = "^[a-zA-Z]+$";  // access modifer
    String phoneregex="^\\d{10}$";
   public void setId(String i){
        if (i.matches(regex)){
            name=i;
            System.out.println("correct string set");
        }
        else{
            System.out.println("wrong string set");
        }

    }
    public void setPhonenumber(String number){
       if (number.matches(phoneregex)){
           pnumber=number;
           System.out.println("correct number set");
       }else {
           System.out.println("wrong number set");
       }
    }
}
public class validation {
    public static void main(String[] args) {
      vandana v=new vandana();
      v.setId("nandy");   // 1234 int    "1234"---> string   regex char chracter
        v.setPhonenumber("7488611162");
    }
}
