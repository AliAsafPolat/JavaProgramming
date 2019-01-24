package com.asaf;

public class Main {

    public static void main(String[] args) {

        Thread t=Thread.currentThread();

        System.out.println("Current thread :"+t);

        //Change channel name.

        t.setName("Asaf's Thread");
        System.out.println("After name change :"+t);

        try{

            for(int i=0;i<5;i++){
                System.out.println(i);
                Thread.sleep(1000);
            }

        }catch(InterruptedException e){
            System.out.println("Error to main interrupt");
        }
    }
}
