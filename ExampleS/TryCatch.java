package com.asaf;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	int a=0,b=0,c=0;
        Random r=new Random();

        for(int i=0;i<15;i++){
	try {
	    a=r.nextInt();
	    b=r.nextInt();
	    c=r.nextInt();
	    int d=a/(b/c);

        System.out.println("This is result value : "+d);


    }catch(ArithmeticException e){
        System.out.println("Division by 0 detected!!:"+e);
    }
        }
        System.out.println("After Example");
    }
}
