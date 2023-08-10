import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class contains {
    public static void main(String[] args) {
        String[] arr={"sus","van"};
        List iteam=Arrays.asList(arr);
        // arrays require less space as compared array list
        // runtime =arraylist   while declaring array
        String str="sushanta-nandy";
        String[] arr1= str.split("-");
        System.out.println(arr1[1]);
    }
}
