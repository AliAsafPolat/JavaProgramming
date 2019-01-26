package com.asaf;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Ucgenin bir kenar uzunlugunu giriniz:");
        int kenar=scan.nextInt();
        System.out.println("Verilen kenara ait yuklekligi giriniz:");
        int h=scan.nextInt();
        System.out.println("Ucgenin alani :"+((h*kenar)/2));

    }
}
