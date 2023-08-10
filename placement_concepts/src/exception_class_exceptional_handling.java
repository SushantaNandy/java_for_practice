import java.util.Scanner;

class Myexception extends Exception{
    @Override
    public String toString() { //method under Exception class which extends Throwable.java . //Returns a short
        // description of this throwable.
        //return super.toString(); // This is a message under Throwable.java .
        return "You have enter a number greater then 9";
    }

    @Override
    public String getMessage() {
        //return super.getMessage();  // This is a message under Throwable.java//the detail message string of this
        // Throwable instance (which may be null).
        return "Look carefully and then enter a number smaller then 9";
    }
}
public class exception_class_exceptional_handling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        if (a>9){
            try {
                //throw new Myexception();
                throw new ArithmeticException("This is an exception"); //throw keyword is used by the programmer
                // to throw an exception explicitely.
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace(); //print the stack trace
            }
        }System.out.println("succesfully executed the code");
    }
}
