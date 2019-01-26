package com.asaf;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Konbinasyonu istenilen sayiyi giriniz :");
        int sayi=scan.nextInt();
        System.out.println("Kaçlı kombinasyonu isteniyor :");
        int komb=scan.nextInt();

        int n=faktoriyel(sayi);
        int k=faktoriyel(komb);
        int r=faktoriyel(sayi-komb);

        int sonuc=n/(k*r);
        System.out.println("Konbinasyon sonucu :"+sonuc);
    }
    public static int faktoriyel(int a){
        int sonuc=1;
        for (int i=0;i<a;i++){
            sonuc=sonuc*(i+1);
        }
        return sonuc;
    }
}
