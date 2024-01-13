class backtrack{
    public static void printper(String str, String perm, int idx){
        for (int i=0;i<str.length();i++){
           // System.out.println(i);
            printper("BC","A",1);
        }
    }
}

public class onubro {
    public static void main(String[] args) {
//        int mask=0x000F;
//        int value=0x2222;
//        System.out.println(value&mask);
        String str="ABC";
        //printper(str,"",0);
        Integer[][] data = new Integer[4][2];
        System.out.println(data[1].length);
        data[0][0] =1;
        data[0][1] =2;
        data[1][0] =3;
        data[1][1] =4;
        data[2][0] =5;
        data[2][1] =6;
       // System.out.println(data[1].length);
    }
}


