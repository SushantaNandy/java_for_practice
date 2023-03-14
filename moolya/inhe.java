package moolya;
class calcu{
    public int cal_add(int x, int y){
        System.out.println("india");
        return x+y;
    }
}
class calcu1 extends calcu{
    public int cal_sub_add(int x, int y){
        return x-y;
    }
}
public class inhe {
    public static void main(String[] args) {
    calcu1 c2=new calcu1();
    int e=c2.cal_sub_add(5,2);
   int f= c2.cal_add(5,2);
    System.out.println(e);  System.out.println(f);
    }
}
