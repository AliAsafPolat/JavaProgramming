package com.asaf;

public class Main {

    public static void main(String[] args) {
	Islem kare=new Islem(15);
        kare.yazdır();
    Islem ucgen=new Islem(kare);
        ucgen.yazdır();

   
    }
}


public class Islem {

    double deger;

    public  Islem(){
        this.deger= 0;

    }

    public Islem(Islem b1){
        this.deger=b1.deger;
    }

    public Islem(double a){
        this.deger=a;

    }

    public Islem (int b){
        this.deger=b;
    }

    public void yazdır (){
        System.out.println("Deger :"+deger);
    }

}
