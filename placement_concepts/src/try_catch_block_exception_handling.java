import java.util.Scanner;

public class try_catch_block_exception_handling {
    public static void main(String[] args) {
        for (int i=0;i<5;i++){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();

        try {

                System.out.println(1000/x);
            }
        catch (Exception e){
            System.out.println("Error because of "+e);
        }
            System.out.println("end of code");

    }}}

