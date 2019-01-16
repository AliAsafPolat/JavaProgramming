package com.asaf;

public class Main {

    public static void main(String[] args) {
	//Hayvan hayvan1=new Hayvan();
	Kedi kedi=new Kedi("Ketçap",5);
	Kopek kopek=new Kopek("Marul",4);

	//kedi.yas=5;
	kedi.seslen();

	//kopek.yas=4;
	kopek.seslen();

    }
}



public class Hayvan {
    int yas;
    String isim;
    public Hayvan(String isim,int yas){
        this.isim=isim;
        this.yas=yas;                   //Burada bu constructor olusturuldugu icin kedi ve kopekte de bunlar lazım.
    }

    public void yuru(){
        System.out.println("Yürüdüm ");

    }
    public void seslen(){
        System.out.println("Ses deneme");
    }

}


public class Kedi extends Hayvan{


        public Kedi(String isim,int yas){
            super(isim,yas);
        }

    @Override
    public void seslen() {
        System.out.println("Miyavvv");
    }
}



public class Kopek extends Hayvan {
    public Kopek(String isim,int yas){
        super(isim,yas);
    }

    @Override
    public void seslen() {
        System.out.println("Havv Havv!");
    }
}
