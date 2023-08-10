import java.util.Scanner;

public class class30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        for (int i=0;i<=2;i++){
            int j=sc.nextInt();
            int[] k={2,3,4,5};
            try {
                System.out.println(k[j]);
            }catch (Exception e){
                System.out.println(e);
            }


            try {
                System.out.println(100/j);
            }
            catch (Exception e){
                System.out.println(e);
            }

        }

    }
}
// try-catch block