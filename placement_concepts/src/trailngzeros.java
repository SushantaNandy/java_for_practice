public class trailngzeros {
    static boolean check(int mid,int n){
        int res=0;
        for(int i=5;i<=mid;i=i*5){
            res=res+mid/i;
        }
        if(res==n){
            return true;
        } else if (res>=n) {
            return true;
        } else {
            return false;
        }
    }

       public static int findNum(int n)
        {
            // Complete this function
            if(n==1){
                return 5;
            }
            //Binary search
            int start=0; int end=n*5; int mid;
            while(start<end){
                mid=(start+end)/2;
                if(check(mid,n)){
                    end=mid;
                }else{
                    start=mid+1;
                }
            }
            return start;
        }
    public static void main(String[] args) {

            System.out.println(findNum(11));
    }
}
