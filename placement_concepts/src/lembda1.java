import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class lembda1 {
    public static void main(String[] args) {
        int count=0;
        ArrayList<String> arr=new ArrayList<>();
        arr.add("Abhay"); arr.add("sushanta"); arr.add("suman"); arr.add("Luma");
        for (String i:
             arr) {
            if (i.startsWith("A")){
                count++;
            }
        }System.out.println(count);

        //second way to do this is to use java stream with lembda expresssion
        long j=arr.stream().filter(s -> s.startsWith("A")).count();
        System.out.println(j);

        Stream.of("Abhay","sushanta","suman","Luma").filter(s -> s.startsWith("A"));

        //terminal operation will only execute only when it return true for any given conditions.
       long count2= Stream.of("Abhay","sushanta","suman","Luma").filter(s ->
                {
                    return s.startsWith("A");

                }).count();
        System.out.println(count2);

        long count3= Stream.of("Abhay","sushanta","suman","Luma").filter(s ->
        {
             s.startsWith("A");
        return false; // terminal operations will always return 0 if conditions become false.
        }).count();
        System.out.println(count3);

        // we want the name greter then 4 printed in the console
        arr.stream().filter(s -> s.length()>4).forEach(s -> System.out.println(s));
        //now I want only the 1st string of name not all of them
        arr.stream().filter(s -> s.length()>4).limit(1).forEach(s -> System.out.println(s));

        // how to use map to manupulate the stream data 's'?
        //we can use a method known as map
        arr.stream().filter(s -> s.endsWith("a")).map(s -> s.toUpperCase()).
                forEach(s -> System.out.println(s));

        //one more terminal operations is .sorted()--> we will get all the name in lexegorial manner
        arr.stream().map(s -> s.toUpperCase()).sorted().
                forEach(s -> System.out.println(s));

        //anymatch method to check any string is resent inside the arraylist or not
        //the return type is boolean
        boolean bn=arr.stream().anyMatch(s -> s.equalsIgnoreCase("Adam"));
        System.out.println(bn);

        //collect method is used tgo convert the result back into list
        List<String> new_list=arr.stream().map(s -> s.toUpperCase()).sorted().
                collect(Collectors.toList());
        System.out.println(new_list.get(0));
    }
}
