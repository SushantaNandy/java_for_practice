import java.util.InputMismatchException;
import java.util.Scanner;

public class try_catch_clock2_exceptional_handling {
    public static void main(String[] args) {
        int[] arr={2,4,6,7,8,3};
        for (int i=0;i<5;i++){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the number in array which you want to access");
            int x=sc.nextInt();
            System.out.println("number you want to divide");
            int y=sc.nextInt();

            try {

                System.out.println(arr[x]/y);
            }
            catch (ArithmeticException e){
                System.out.println("error because of ArithmeticException "+e);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("error because of ArrayIndexOutOfBoundsException "+e);
            }
            catch (Exception e){
                System.out.println("Error because of "+e);
            }

        }System.out.println("end of code");
    }
}
