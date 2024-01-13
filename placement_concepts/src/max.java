class Solution{
    public int minJumps(int[] arr)
    {
        int i=0, jumps=0;
        while(i<arr.length-1)
        {
            //System.out.println("i="+i);
            if(arr[i]==0)
                return -1;
            if(arr[i]+i>=arr.length-1)
                return ++jumps;
            int reach=-1, pos=-1;
            for(int j=i+1;j<=i+arr[i] && j<arr.length;j++)
            {
                //System.out.println(j+" "+(arr[j]+j));
                if(j+arr[j]>reach)
                {
                    reach=j+arr[j];
                    pos=j;
                }
            }
            i=pos;
            jumps++;
        }
        return jumps;
    }
}
public class max {
    public static void main(String[] args) {
        Solution obj=new Solution();
        int[] a={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int x=obj.minJumps(a);
        System.out.println(x);

    }
}
