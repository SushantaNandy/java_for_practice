import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class sep {
    public static void main(String[] args) {
        int[] arr=new int[3];
        arr[0]=3; arr[1]=2; arr[2]=1;
        Scanner sc=new Scanner(System.in);
        for (int i=0; i<5;i++){
            System.out.println("Enter the index for the element :");
            int index=sc.nextInt();
            System.out.println("enter the number u want to divid from :");
            int num=sc.nextInt();
            try {
                System.out.println(arr[index]);
                System.out.println("after dividing u will get :"+arr[index]/num);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Error occurs because of array index outof bond");
            }
            catch (ArithmeticException e){
                System.out.println("Error occurs because of arithematical exceptio"+e.getMessage());
            }
            catch (Exception e){
                System.out.println("Exception occurs because of :"+e.getMessage());
            }


        }

    }
}
