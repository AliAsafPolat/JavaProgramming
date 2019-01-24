package com.asaf;

public class ThreadMy {
    public static void main(String[] args) {
        new NewThread();
        try{
            for(int i=0;i<10;i++){
                System.out.println("Main Thread "+i);
                Thread.sleep(1000);
            }

        }catch (InterruptedException e ){
            System.out.println("Main Thread interrupted "+e );

        }
        System.out.println("Exiting main thread");

    }
}

public class NewThread implements Runnable {

    Thread t;
    NewThread(){
        t=new Thread(this,"Asaf's Thread");
        System.out.println("Child Thread");
        t.start();
    }
    public void run(){
        try{
            for (int i=0;i<10;i++){
                System.out.println("Child Thread : "+i);
                Thread.sleep(500);
            }

        }catch (InterruptedException e){
            System.out.println("Child interrupted.");

        }
        System.out.println("Exiting child thread");

    }

}