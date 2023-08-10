class Compute {

    public  void rotate(int arr[], int n)
    {
        int x=arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
            arr[0]=x;
        }
        for (int k: arr) {
            System.out.println(arr[k]);
        }

    }
}

public class right_shift_array {
    public static void main(String[] args){
        int[] ar = {1,2,3,4,5};
        Compute obj=new Compute();
        obj.rotate(ar,ar.length);
    }

}
