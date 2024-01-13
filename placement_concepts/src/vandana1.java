import java.util.Scanner;

public class vandana1 {
    public static void main(String[] args) {
            System.out.println("Enter the number of co ordinate");
            Scanner sc=new Scanner(System.in);
            int N=sc.nextInt();
            int[][] coordinate=new int[N][2];
            for(int i=0;i<N;i++) {
                System.out.println("Enter the value of x and y");
                coordinate[i][0]=sc.nextInt();
                coordinate[i][1]=sc.nextInt();
            }
            for(int j=0;j<N;j++) {
                System.out.print(coordinate[j][0]+" "); System.out.println(coordinate[j][1]);
        }
         int max1=0,max2=0;
            for (int r=0; r<N;r++){
                if (coordinate[r][0]>0){
                    max1=coordinate[r][0];
                }
            }
            for (int r=0; r<N;r++){
            if (coordinate[r][1]>0){
                max2=coordinate[r][0];
            }
            }
        System.out.println(Math.abs(max1*max2));
    }
}
