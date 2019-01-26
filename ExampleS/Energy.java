package com.asaf;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Cismin kutlesini giriniz :");
        int m=scan.nextInt();
        System.out.println("Cismin hızını giriniz :");
        int v=scan.nextInt();
        System.out.println("Cismin yerden yüksekliğini giriniz :");
        int h=scan.nextInt();

        Cisim cisim=new Cisim(m,v,h);

        System.out.println("Kinetik enerji = "+(cisim.kutle*cisim.hiz*cisim.hiz/2));
        System.out.println("Potansiyel enerji = "+(cisim.kutle*10*cisim.yukseklik));


    }
}
