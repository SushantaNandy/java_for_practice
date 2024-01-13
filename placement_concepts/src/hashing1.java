import java.util.Hashtable;

public class hashing1 {
    public static void main(String[] args) {
        //creating a hashtable and storing value in form of key value pairs.
        //hash techique is used to make the search faster. And hashing internally use a hash function.
        //so in hashing technique we use f(x)=x%10; to store the element
        //for example:
        //if we have the element 11,18,23,54 and we have to store all this elements
        //then we have=x=11%10=1 so 11 will be stored in 1 st index, 18 will be stored in 8 index..... and so on
        //No there is a problem with it.What happens if we have one more element 21 whose last element is also 1.
        //So there is a problem and it is known as HASH COLLISION.
        //So to tackel with this what we do that 21 will get stored inthe next indexes which are havinf freee
        //space in it. And it is known as OPEAN ADRESSING.

        //Another techinique to handle HASH COLLISION is known as CHAINING.
        //So here if we have 92and 72 we dont store in 2nd index insted of it what we did is we point one link-list
        //pointing to index 2 having both element 92 and 72.

        //LOAD FACTOR --> How much more element is need to fill the hastable.
        //classes impleneting hashing techniques are 1. Hash set 2. hashmap 3.linked hashmap 4.hash table
        Hashtable<Integer,String> hm=new Hashtable<>();
        hm.put(1,"sus"); hm.put(5,"nandy"); hm.put(2, "elephant");
        System.out.println(hm);

        Hashtable<Integer,Integer> hm1=new Hashtable<>();
        hm1.put(1, 10);  hm1.put(2, 10); hm1.get(3);
        System.out.println(hm1);

    }
}
