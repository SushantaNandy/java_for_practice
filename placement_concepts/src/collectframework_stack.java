import java.util.Stack;

public class collectframework_stack {
    public static void main(String[] args) {
        //last in last out
        Stack<String> companies=new Stack<>();
        companies.push("tcs");
        companies.push("infosys");
        companies.push("mindtree");
        companies.push("moolya");
        System.out.println(companies);
        //if you want to see the top element present
        System.out.println(companies.peek());
        //to deleate the last element we use pop
        companies.pop();
        System.out.println(companies.peek());
    }
}
