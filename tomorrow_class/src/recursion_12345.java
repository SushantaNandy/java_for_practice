public class recursion_12345 {
    static int factorial(int n){
        if (n==0){
            return n;
        }else {
            return n+factorial(n-1);
        }
    }
    public static void main(String[] args) {

        System.out.println(factorial(5));
    }
}