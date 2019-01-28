package com.asaf;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> liste=new ArrayList<Integer>();
        liste.add(1);
        liste.add(2);
        liste.add(3);

   
            System.out.println(liste);
        liste.add(1,5);                     //ilk eleman index, ikincisi ise integer değer.
        System.out.println("After adding element");
        System.out.println(liste);                      //Doğrudan listeyi yazdırabiliriz.

        for(int i=0;i<liste.size();i++){
            System.out.println(i+" : "+liste.get(i));   //Liste elemanlarına ulaşmanın bir başka yolu.
        }

    }
}
