import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class removingduplicatesinarray {
    public static void main(String[] args) {
        int[] a1={1,1,3,4,4,5};
        Arrays.sort(a1);
        for (int i:
             a1) {
            System.out.println(i);
        }
        System.out.println();
        int n=a1.length;
        int[] a2={1,1,3,4};
        int m=a2.length;
        LinkedHashSet<Integer> set=new LinkedHashSet<>();

        for (long a: a1) {
            set.add((int) a);
            boolean bn=set.contains(2);
        }
        List<Integer> obj=new ArrayList<>(); List<int[]> ok=Arrays.asList(a1);
        System.out.println(ok);
        obj.size();   obj.add(2);

        System.out.println(obj.contains(2)); obj.get(0);
        System.out.println(obj.indexOf(2));
        System.out.println();
        int kdf=142256176;
        System.out.println(kdf);


    }
}
