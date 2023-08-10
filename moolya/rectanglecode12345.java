package moolya;
class rectangle{
    int length;
    int breath;
    int a;
    public void set_len(int l,int b){
        length=l;
        breath=b;
    }
    public int get_area(){
        return length*breath;
    }

}
public class rectanglecode12345 {
    public static void main(String[] args) {
        rectangle r=new rectangle();
       r.set_len(4,2);
       int c=r.get_area();
        System.out.println(c);
    }
}
