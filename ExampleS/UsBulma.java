package com.asaf;

import java.util.Scanner;
import java.math.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Sayiyi belirleyiniz :");
        int sayi=scan.nextInt();
        System.out.println("Alınacak üssü belirleyiniz :");
        int us=scan.nextInt();

        int k=1;
        for (int i=0;i<us;i++){
            k=k*sayi;

        }

        System.out.println("Sonuc :"+k);

    }
}
