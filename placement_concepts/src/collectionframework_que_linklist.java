import java.util.LinkedList;
import java.util.Queue;

public class collectionframework_que_linklist {
    public static void main(String[] args) {
        //first in first out
        Queue<Integer> ele=new LinkedList<>();
        ele.offer(23);
        ele.offer(32);
        ele.offer(50);
        ele.offer(21);
        ele.offer(46);
        System.out.println(ele);
        //remove first element
        ele.poll();
        System.out.println(ele);
        //will see what the next element to be removed
        System.out.println(ele.peek());
    }
}
