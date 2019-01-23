package com.asaf;

public class Main {

    public static void main(String[] args) {

        try{
            int a=args.length;
            System.out.println("a = "+a);
            int b=42/a;
            int c[]={5};
            c[44]=97;

        }catch(ArithmeticException e){
            System.out.println("Divide by zero "+e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index oob :"+e);
        }

        System.out.println("After Try-Catch blocks.");
    }
}
