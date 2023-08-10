import java.util.ArrayList;

public class arraylist_collectionframework {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(0,9);
        arr.add(1,3);
        arr.add(2,2);
        arr.add(3,9);
        ArrayList<Integer> arr1=new ArrayList<>(200);
        arr1.add(12); arr1.add(23); arr1.add(62); arr1.add(52);
        arr.addAll(arr1);
        System.out.println(arr.contains(12));
        System.out.println(arr.indexOf(8));
        System.out.println(arr.lastIndexOf(9));
        for (int i=0; i<arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
}
