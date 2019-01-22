package com.asaf;


import java.awt.*;
import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> listem=new ArrayList<Integer>();
        //((ArrayList) listem).add(0,1);
    listem.add(0,1);           //Listenin 0.indisine 1 elemanı ekle
    listem.add(1,5);           //Listenin 1.indisine 5 elamanı ekle
    listem.add(2,6);
    listem.add(3,4);
        System.out.println(listem);         //Tüm listeyi yazdırır.
    listem.remove(1);
        System.out.println(listem);         //Listenin 1. indisindeki elamanı kaldır.
    listem.clear();                         //Tüm listeyi temizler.
        System.out.println(listem);
        System.out.println(listem.subList(1,3));//Listede 1. indisten 3.indise kadar olanları yazdrır.
    
    }
}

