package moolya;
class suri3 {    // parent
    public int cal(int x, int y){
        int d=4;
        return x+y;
    }
}

class nii1 extends suri3{      //child
    public int cal_adv(int x, int y, int d){
        int sum=d+4;
        System.out.println(sum);
      //  nii1 s=new nii1();
        return x-y;
    }
}
class har1 extends nii1{
    public int cal2(int x,int y){
        return x*y;
    }
}
class  bg2 extends har1{
    public int cal3(int x, int y){
        return x%y;
    }
}
public class inherientance_c {
    public static void main(String[] args) {

        nii1 a=new nii1();   // object of child
        har1 h=new har1();
        bg2 g=new bg2();
        nii1 s=new nii1();
        System.out.println(a.cal(2,5));
        //     System.out.println(h.cal2(5 ,6);
        System.out.println(s.cal_adv(2,9,7));
        System.out.println((g.cal3(10,25)));
        a.cal_adv(2,3,4);

    }
}
