import java.util.ArrayDeque;
import java.util.Deque;

public class deque_collectionframwork {
    //In deque array insertion and deleation happens from both the end.
    //1. what is the size of array deque?
    //In array deque it internally form an array who takes care of all the stuff.
    //We don't need to specify in which element I need to specify element.You only need to specify from which
    //end we need to insert element.
    //2.Why it is known as deque ?
    //Becuase it is an double ended queue.
    //3. So what is queue?
    // Insertion is happens from end and delation happens from front.In double ended queuue insertion and deleation
    //from both the end.
    //array deque implements deque interface.
    public static void main(String[] args) {
        ArrayDeque<Integer> ele=new ArrayDeque<>();
        ele.add(34); ele.addFirst(56); ele.addLast(56);
        System.out.println(ele.getFirst()); // deplay the element added first
    }
}
