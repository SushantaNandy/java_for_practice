import java.util.HashSet;

public class hashset3 {
    public static void main(String[] args) {
        //if we dont pass any constructor the initial capacity of the hash set is 16 and load factor is 0.75
        HashSet<Integer> hashSet=new HashSet<>();

        //if i want to specify the initialcapacity and load factor then
        HashSet<Integer> myhasset=new HashSet<>(6, 0.65f);
        myhasset.add(32); myhasset.add(100);
        myhasset.add(32);  //duplicates not allowed
        System.out.println(myhasset);

    }
}
