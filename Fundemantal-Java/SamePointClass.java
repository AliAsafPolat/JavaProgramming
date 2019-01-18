package com.asaf;

public class Main {

    public static void main(String[] args) {
	box kutu=new box();
	box kutu2=kutu;  //Bu tanımlama kutu ile kutu 2 nesnelerinin aynı objeyi gösterdiklerini ifade eder.

	kutu.boy=15;
	kutu.en=5;
	kutu2.yuksek=10;

	int hacim=kutu.boy*kutu.yuksek*kutu.en;
	System.out.println("Hacim:  "+hacim);
    }

	public static class box {
		int yuksek;
		int boy;
		int en;
	}
}
