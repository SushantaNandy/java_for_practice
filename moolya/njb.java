package moolya;

public class njb {
    public static void main(String[] args) {
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15
//        16 17 18 19 20 21
        int count=1;
        for (int i = 1; i <= 21; i++) {
            for (int j = 1; j <= i; j++) {
                if (j%10==1){
                    System.out.print(j%10);
                }else {
                    System.out.println(j%10);
                }


            }
            System.out.println();

        }

    }
}
//f(x)=x%10;53/43
//key, value