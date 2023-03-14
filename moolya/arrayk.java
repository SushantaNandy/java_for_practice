package moolya;

public class arrayk {
    public static void main(String[] args) {
        // string // in the form of array
        //declaration of array int i=12;
//        int[] j=new int[10];  // datatypes of i, array integer values integer array type
//        j[0]=11;
//        j[1]=12; j[2]=14;
//        System.out.println(j.length);
//        for (int i=0; i<j.length-1; i++){
//            System.out.println(j[i]);
//        }
//        String[] str= new String[5];  // declaring an array and alloacating the space for it
//        str[0]="Ram";
//        System.out.println(str[4]);
//        System.out.println(str.length);
       // create a string array and store 5 values in it and ittrate using for loop where limit should be set using .length

//        int[] j=new int[10];   // declaration +memeory allocation  //2
//        int[] k;      // declaring   //3
//        k=new int[5];   // memory allocation
        int[] i= {4,2,3,4};   // declaring and initilating in the same line  // 1
        int pro=1;
        for (int j=0; j<i.length; j++){
            pro=pro*i[j];
        }System.out.println(pro);
    }
}

