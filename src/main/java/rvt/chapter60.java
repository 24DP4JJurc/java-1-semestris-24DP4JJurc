package rvt;

public class chapter60 {
    public static void main(String[] args) {
        ex4();
    }
    public static void ex1(){
        int[] val = {0, 1, 2, 3};
        int sum = 0;
        for (int i = 0; i < val.length; i = i +1) {
            sum = sum + i;
        }
        System.out.println("Sum of all numbers = " + sum);
    }
    public static void ex2(){
        int[] val = {13, -4, 82, 17};
        int[] twice = {13, -4, 82, 17};

        System.out.println("Original Array: "+val[0] +" "+val[1]+" "+val[2]+" "+val[3]);
        for (int i = 0; i < val.length; i = i + 1) {
            twice[i] *= 2;
        } 
        System.out.println( "New Array: " + twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3] );

    }
    public static void ex3(){
    int[] valA   = { 13, -22,  82,  17}; 
    int[] valB   = {-12,  24, -79, -13};
    int[] sum    = {  0,   0,   0,   0};

    for(int i = 0; i < valA.length; i = i + 1) {
        sum[i] = valA[i] + valB[i];
       }
    System.out.println( "sum: " + sum[0] + " " + sum[1] + " " + sum[2] + " " + sum[3] );
    }
    public static void ex4(){
        int[] valA   = { 13, -22,  82,  17}; 
        int[] valB   = {  0,   0,   0,   0};
        for(int i = 0; i < valA.length; i = i + 1) {
            valB[i] = 25 - valA[i];
        }

        System.out.println( "valA: " + valA[0] + " " + valA[1] + " " + valA[2] + " " + valA[3] );
 
        System.out.println( "valB: " + valB[0] + " " + valB[1] + " " + valB[2] + " " + valB[3] );

        System.out.println( "sum:  " + (valA[0]+valB[0]) + " " + (valA[1]+valB[1]) + " " + (valA[2]+valB[2]) + " " + (valA[3]+valB[3]) );
    }
}
