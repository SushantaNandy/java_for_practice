public class var_args {
    static  int values(int x,int ...arr) {  // this method is created so to get free of the hussle of creating multiple argument
        int sum = 0;                  // u can make a bar, by atleast passing one sureshot parameter
//        for (int i=0;i<arr.length;i++){
//            sum=sum+arr[i];
//        }

        for (int a : arr) {
            sum =sum+ a;
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(values(1,2,3));   // you can pass n number of argument
    }
}
