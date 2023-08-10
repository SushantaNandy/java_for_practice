import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class exception_handling {
    public static void main(String[] args) throws IOException {
     String str="Sush anta";
     String str1="Cucumber -1kg";
     String[] str1split= str1.split("-");
     String newspl=str1split[0].trim();
        System.out.println(newspl);
        //System.out.println(str1split[0]);
        String[] vege= {"Cucumber","Beetroot"};
        List iteams = Arrays.asList(vege);
//        System.out.println(str1.contains(str));
        System.out.println(iteams.contains(str1));
}}
