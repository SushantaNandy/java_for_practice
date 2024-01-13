import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashing_hasmap2 {
    public static void main(String[] args) {

        //unordered
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(1,100);
        //it will update the value of key 1.
        hm.put(1,200);
        hm.put(2,400); hm.put(3,220); hm.put(4,200);
        System.out.println(hm);
        System.out.println(hm.get(1));  // fething the value using key
        System.out.println(hm.containsKey(1));
        //ittrate over the hasmap
        for (Map.Entry<Integer,Integer> e:hm.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //to get all the keys
        Set<Integer> keys=hm.keySet();
        for (int allkey: keys) {
            System.out.println(allkey);
        }

        // removing the particular keys
        hm.remove(1);
        System.out.println(hm);


// fetching the frequency
        int[] arr={1,1,2,2,2,2,3,3,12}; // 1->2 2->4
        int[] arr1={1};
        HashMap<Integer,Integer> hash=new HashMap<>();
        for (int i=0;i<arr.length;i++){
            int freq=0;
            for (int j=0;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    ++freq;
                }
                hash.put(arr[i],freq);
            }

        }
        System.out.println(hash);

        Set<Integer> kez=hm.keySet();
        for (int it:arr1) {

            if (kez.contains(it)){
                System.out.println("yes");
            }else {
                System.out.println("no");
                break;
            }
        }
    }
}
//    int counter=0;
//        Arrays.sort(a1);  Arrays.sort(a2);  // sort
//                //remove duplicates
//                // LinkedHashSet<Integer> set_a1=new LinkedHashSet<>();
//                // LinkedHashSet<Integer> set_a2=new LinkedHashSet<>();
//                //converted to arraylist
//                List<Integer> obj_a1=new ArrayList<>();
//        List<Integer> obj_a2=new ArrayList<>();
//        for (long a: a1) {
//        obj_a1.add((int)a);
//        }
//        for (long a: a2) {
//        obj_a2.add((int)a);
//        }
//
//
//        for(int i=0;i<obj_a2.size();i++){
//        if(obj_a1.contains(obj_a2.get(i))){
//        int k=obj_a1.indexOf(obj_a2.get(i));
//        obj_a1.remove(k);
//        }else{
//        ++counter;
//        }
//        }
//
//        return (counter==0) ? "Yes": "No";