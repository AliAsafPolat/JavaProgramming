package com.asaf;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int [] dizi=new int [10];
        Scanner sc=new Scanner(System.in);

        for (int i=0;i<10;i++){
            System.out.println((i+1) +" inci elemanı giriniz.");
            dizi[i]=sc.nextInt();
        }
        int tmp;
        for(int i=0;i<9;i++){
            for (int j=0;j<9-i;j++){
                if (dizi[j]>dizi[j+1]){
                    tmp=dizi[j];
                    dizi[j]=dizi[j+1];
                    dizi[j+1]=tmp;
                }
            }
        }

        System.out.println("Sıralanmıs hali:");
        for(int i=0;i<10;i++){

            System.out.print(dizi[i]+"  ");

            }


        }
}
