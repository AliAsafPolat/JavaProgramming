package com.asaf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> liste=new LinkedList<String>();
        liste.add("Armut");
        liste.add("Elma");
        liste.add("Yumurta");
        liste.add("Peynir");

        printList(liste);

        liste.add(1,"Kiraz");
        printList(liste);

    }
    public static void printList(LinkedList<String> linkedlist){
        Iterator<String> i=linkedlist.iterator();
        while(i.hasNext()){
            System.out.println("Now listing : "+i.next());

        }
        System.out.println("*********************************");


    }
}
