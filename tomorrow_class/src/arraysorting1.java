import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;

public class arraysorting1 {
    public static void main(String[] args) {
        int[] arr={5,3,2,4,1};

        long sush=9L;
        int n=arr.length;
        int temp=0; long sum=0; int re;

        Arrays.sort(arr);
            for (int i=0;i<n;i++){
                sum=sum+((long) i *arr[i]);

        }
            System.out.println((int) ((int) sum%(Math.pow(10,9)+7)));
        System.out.println(Long.valueOf((long) (sush%(Math.pow(10,9)+7))));
        BigInteger bg=new BigInteger(String.valueOf(sush));
        long k=bg.longValue();
        System.out.println();
}
}


