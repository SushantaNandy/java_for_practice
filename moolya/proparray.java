package moolya;

public class proparray {
    public static void main(String[] args) {
        int[] i={2,3,4,3,5,6,78,8,5,3};   //length of the array 3   //// i[0]--> 2  i[1]--->3   i[2]----> 4
        int prod=1;
        for (int j=0; j<i.length; j++){  //j=0,1,2  ----> 3 itteration will be there
            prod=prod*i[j];
        }
        System.out.println(prod);
    }
}
// 1 st itteration
//prod=1    j=0   1*i[0]---> 1*2=2 =prod
//prod=2    j=1   2*i[1]---> 2*3=6 = prod
//prod=6    j=2   6*i[2]----> 6*4=24 =prod
