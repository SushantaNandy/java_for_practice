import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class NegativeException extends Exception{
    @Override
    public String toString() {
        return "radius can't be negative";
    }

    @Override
    public String getMessage() {
        return "radius can't be negative";
    }
}
public class throw_and_throws_exceptional_handling {
    public static double area(double r) throws NegativeException {
        if (r<0){
            throw new NegativeException();
        }
        return Math.PI*r*r;
    }
    public static int tc(int x, int y) throws ArithmeticException{
        return x/y;
    }
    public static void main(String[] args) {
        try {
//            int a=tc(7,0);
//            System.out.println(a);

            area(-3.45);  //if I have to use the above area method I have to surrounfd it under try catch.
        }
        catch (Exception e){
            System.out.println("Exception"+e.toString());
            System.out.println(e.getMessage());
        }

    }
}
