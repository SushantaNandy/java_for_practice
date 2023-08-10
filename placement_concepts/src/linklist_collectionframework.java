import java.util.LinkedList;

public class linklist_collectionframework {
    public static void main(String[] args) {
        LinkedList<Integer> arr=new LinkedList<>();
        arr.add(0,9);
        arr.add(1,3);
        arr.add(2,2);
        arr.add(3,9);
        LinkedList<Integer> arr1=new LinkedList<>();
        arr1.add(12); arr1.add(23); arr1.add(62); arr1.add(52);
        //diffrent methods which are diffrent from arraylist
        arr1.addLast(345); arr1.addFirst(567);
        arr.addAll(arr1);
        System.out.println(arr.contains(12));
        System.out.println(arr.indexOf(8));
        System.out.println(arr.lastIndexOf(9));
        for (int i=0; i<arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
}
