import java.util.ArrayDeque;
import java.util.Deque;

public class deque_collectionframwork {
    public static void main(String[] args) {
        ArrayDeque<Integer> ele=new ArrayDeque<>();
        ele.add(34); ele.addFirst(56); ele.addLast(56);
        System.out.println(ele.getFirst());
    }
}
