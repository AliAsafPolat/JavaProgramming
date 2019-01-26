package com.asaf;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Kaç sayi girilecek :");
        int n=scan.nextInt();
        int tekSayilar=0;
        int ciftSayilar=0;
        int genelToplam=0;

        for (int i=0;i<n;i++){
            System.out.print((i+1)+" inci sayiyi giriniz :");
            int sayi=scan.nextInt();
            System.out.println();
            genelToplam+=sayi;


            if (sayi%2==1){
            tekSayilar+=sayi;

            }else
                ciftSayilar+=sayi;

        }

        System.out.println("Genel Toplam :"+genelToplam);
        System.out.println("Tek Sayilar toplamı :"+tekSayilar);
        System.out.println("Cift Sayilar toplamı :"+ciftSayilar);

    }
}
