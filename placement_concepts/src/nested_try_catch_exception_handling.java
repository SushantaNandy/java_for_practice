import java.util.Scanner;

public class nested_try_catch_exception_handling {
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
                try {
                    System.out.println(1000/y);
                }catch (ArithmeticException e){
                    System.out.println("Soory we can't do it because of "+e);
                }
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

