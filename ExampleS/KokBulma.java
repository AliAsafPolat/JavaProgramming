package com.asaf;

import java.util.Scanner;
import java.math.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

         int[]dizi= new int[4];
        for (int i=0;i<=2;i++){
            System.out.print("x üzeri "+i+" lı terimin katsayisini giriniz.");
             dizi[i]=scan.nextInt();
            System.out.println();
        }

        int B=dizi[1];
        int A=dizi[2];
        int C=dizi[0];
        int kok=B*B-4*A*C;

        if(kok>0){
            double x1=(Math.sqrt(kok)-B)/2*A;
            double x2=(-Math.sqrt(kok)-B)/2*A;
            System.out.println("Kökler :"+x1+" "+x2);

        }
        if(kok==0){
            double x=-B/2*A;
            System.out.println("Kökler :" +x);

        }
        if(kok<0){
            System.out.println("Sanal kokler vardır");
        }

    }
}
