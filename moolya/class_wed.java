package moolya;

public class class_wed {
   public static int prod(int[] numbers){    // varchar   int[] numbers={2,4,5,4,5}


       int product=1;
       for (int j=0; j<numbers.length; j++){   // o,1,2,3,4
           product=product*numbers[j];
       }return product;
   }

    public static void main(String[] args) {

    class_wed cw=new class_wed();
       // I want product of any 3 three numbers. 23,34,45

        System.out.println(cw.prod(new int[]{1, 2, 4}));
       // System.out.println( cw.prod(1,2,3,4,5,6));   // aray and array list // statuc and other one is dynamic


    }
}
