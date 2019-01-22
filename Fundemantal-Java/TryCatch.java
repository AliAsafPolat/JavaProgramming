package com.asaf;

public class Main {

    public static void main(String[] args) {
	int d,a;

	try {
	    d=0;
	    a=42/d;
        System.out.println("This will not be printed.");


    }catch(ArithmeticException e){
        System.out.println("Division by 0 :"+e);
    }
        System.out.println("After Catch block");
    }
}
