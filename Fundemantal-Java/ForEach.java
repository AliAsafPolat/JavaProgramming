package com.asaf;



public class Main {

    public static void main(String[] args)  {
int[] i={1,2,3,4,5,6,7};
int sum=0;
for (int x:i){
    System.out.println(x);
    sum+=x;
}
System.out.println("Sum is :"+sum);

int [][]mtr={{3,2,1,0},{4,5,6,7}};
for (int y[]:mtr){
    for(int k:y){
        System.out.println("Value is "+k);
    }
}

    }
}
