package moolya;
class sushanta{    // acess modifier
    int id; static String surname;
    public void met(int y){
        System.out.println(id);
        System.out.println(surname);
    }

        }

public class sw {
    public static void test1(){

    }
    public static void main(String[] args) {
       sw s=new sw();
        sushanta su=new sushanta();
        su.id=345; sushanta.surname="nandy";
        //su.met();
        su.met(56);


    }
}
