package com.asaf;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {    

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Your name ");
        boolean name=scanner.hasNext("Asaf");
        if(name)
        System.out.println("This is your name :"+" Asaf !");
    }
}
