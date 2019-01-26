package com.asaf;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Konbinasyonu istenilen sayiyi giriniz :");
        int sayi=scan.nextInt();
        System.out.println("Kaçlı kombinasyonu isteniyor :");
        int komb=scan.nextInt();

        int n=1;
        int r=1;
        int k=1;

        for (int i=0;i<sayi;i++){
            n=n*(i+1);
        }

        for(int i=0;i<komb;i++){
            r=r*(i+1);

        }

        for (int i=0;i<(sayi-komb);i++){
            k=k*(i+1);
        }

        int sonuc=n/(k*r);
        System.out.println("Konbinasyon sonucu :"+sonuc);
    }
}
