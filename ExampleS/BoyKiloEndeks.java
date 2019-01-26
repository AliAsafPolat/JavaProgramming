package com.asaf;

import java.util.Scanner;
import java.math.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
while(true) {
    System.out.println("Cinsiyet Seçiniz:");
    System.out.println("Erkek için 1'i Kadın için 2'yi tuşlayiniz.");
    int cins=scan.nextInt();

    System.out.println("Boyunuzu giriniz (Metre cinsinden 1,70 gibi) :");
    double boy = scan.nextDouble();
    System.out.println("Kilonuzu giriniz :");
    double kilo = scan.nextDouble();

    double sonuc = kilo / (boy * boy);

    if(cins==2){

    if (sonuc <= 17.5)
        System.out.println("Aşırı zayıf,Yüksek Risk! Ortalamanız: "+sonuc);
    if (sonuc > 17.5 && sonuc <= 19.1)
        System.out.println("Zayıf! Ortalamanız:" +sonuc);
    if (sonuc > 19.1 && sonuc <= 25.8)
        System.out.println("Normal! Ortalamanız: "+sonuc);
    if (sonuc > 25.8 && sonuc <= 27.3)
        System.out.println("Biraz fazla kilolu! Ortalamanız: "+sonuc);
    if (sonuc > 27.3 && sonuc <= 32.3)
        System.out.println("Fazla kilolu! Ortalamanız: "+sonuc);
    if (sonuc > 32.3 && sonuc <= 34.9)
        System.out.println("Çok fazla kilolu! Ortalamanız: "+sonuc);
    if (sonuc > 34.9 && sonuc <= 40)
        System.out.println("Sağlık açısından yüksek riskli kilolu! Ortalamanız: "+sonuc);
    if (sonuc > 40 && sonuc <= 50)
        System.out.println("Hastalıklı bir biçimde yüksek kilolu! Ortalamanız: "+sonuc);
    if (sonuc > 50)
        System.out.println("Ölmüşsün!Ortalamanız: "+sonuc);}
    else if(cins==1){
        if (sonuc <= 17.5)
            System.out.println("Aşırı zayıf,Yüksek Risk! Ortalamanız: "+sonuc);
        if (sonuc > 17.5 && sonuc <= 20.7)
            System.out.println("Zayıf! Ortalamanız:" +sonuc);
        if (sonuc > 20.7 && sonuc <= 26.4)
            System.out.println("Normal! Ortalamanız: "+sonuc);
        if (sonuc > 26.4 && sonuc <= 27.8)
            System.out.println("Biraz fazla kilolu! Ortalamanız: "+sonuc);
        if (sonuc > 27.8 && sonuc <= 31.1)
            System.out.println("Fazla kilolu! Ortalamanız: "+sonuc);
        if (sonuc > 31.1 && sonuc <=34.9 )
            System.out.println("Çok fazla kilolu! Ortalamanız: "+sonuc);
        if (sonuc > 34.9 && sonuc <= 40)
            System.out.println("Sağlık açısından yüksek riskli kilolu! Ortalamanız: "+sonuc);
        if (sonuc > 40 && sonuc <= 50)
            System.out.println("Hastalıklı bir biçimde yüksek kilolu! Ortalamanız: "+sonuc);
        if (sonuc > 50)
            System.out.println("Ölmüşsün!Ortalamanız: "+sonuc);


    }
}

    }
}
