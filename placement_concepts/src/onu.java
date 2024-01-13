import java.util.*;
public class onu {
    public static void main(String[] args) {
       List<Integer> arr=new ArrayList<>();

       arr.add(2); arr.add(3); arr.add(9); arr.add(0); arr.add(9);
        Object[] az= arr.toArray();
        System.out.println(az[0]);
//       int c=arr.stream().min(Integer::compareTo).orElse(0);
//        System.out.println(c);
        Result r=new Result();
        r.miniMaxSum(arr);
    }
}
class Result {
    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long max=arr.stream().max(Integer::compareTo).orElse(0);
        int min=arr.stream().max(Integer::compareTo).orElse(0);
        long minsum=0,maxsum=0;
        for(int i=0;i<arr.size();i++){
            if(min==arr.get(i)){
                continue;
            }else{
                maxsum=maxsum+arr.get(i);
            }
        }
        for(int j=0;j<arr.size();j++){
            if(max==arr.get(j)){
                continue;
            }else{
                minsum=minsum+arr.get(j);
            }
        }
        System.out.println(minsum+" "+maxsum);
        int [][] a=new int[5][2];
        System.out.println(a[0].length);

        ArrayList<ArrayList<Integer> > x = new ArrayList<ArrayList<Integer> >();
        x.add(new ArrayList<Integer>());
        x.get(0).add(0, 45);
        x.add(new ArrayList<Integer>(Arrays.asList(56, 67, 89)));
        x.get(1).add(0, 67);
        x.get(1).add(4, 456);
        x.add(2, new ArrayList<>(Arrays.asList(23, 32)));
        x.add(new ArrayList<Integer>(Arrays.asList(83, 64, 77)));
        x.add(new ArrayList<>(Arrays.asList(8)));
        System.out.println(x);
        System.out.println(x.get(1).get(2));
    }
}