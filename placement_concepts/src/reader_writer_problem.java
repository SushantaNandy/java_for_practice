public class reader_writer_problem {

    public static void wait1(int S){

        while (S<=0){
            ;
            System.out.println("stuck in this loop");
            S--;
        }

    }

    public static void signal(int S){
        S++;
    }
    public static void main(String[] args) {
         int wrt=1;
         int i=0;
        //writer solution
        do {
           wait1(wrt);
           //critical section
            System.out.println("I am implementing critical section");
            signal(wrt);
            i++;
            //remainder section
            String str="onu";

        }while (i<=5);
    }


}
