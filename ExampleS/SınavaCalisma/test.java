package SýnavaCalisma;

import java.util.EnumSet;
import java.util.Random;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String str="Asaf";
		String str2="Beyza";
		String str3="Ane";
		System.out.println(str.compareTo(str2));// Gelen kelime sözlükte önceyse negatif
		System.out.println(str.compareTo(str3));// Sözlükte önceyse pozitif 
		System.out.println(str.compareTo(str)); // Eþitlerse sýfýr döndürür.
		System.out.println(str.toUpperCase());	// toUpperCase methodu stringi deðiþtirmez.
		System.out.println(str);
		str=str.toUpperCase();					// Ancak böyle bir atama yaparsak string deðiþir.
		System.out.println(str);
		System.out.println(str.toLowerCase());
		
		System.out.println(str.contains(str));
		System.out.println(str.contains(str3));
		str=str.toLowerCase();					
		System.out.println(str.contains("saf"));// Ýçinde bu substring var ise true döndürür.
		
		*/
		/*
		double val=Math.random();				//random fonksiyonu double deðer üretiyormuþ.
		System.out.println("val is : "+val);
		//int value=Math.random(); ** Hatalý kod.
		Random rand=new Random();
		System.out.println(rand.nextInt());	
		System.out.println(rand.nextInt(3));	//3-1=2 ye kadar random deðer üretir.
		System.out.println(Math.abs(-50));		//Mutlak deðer
		System.out.println(Math.min(40, 5));
		System.out.println(Math.max(40, 4));
		*/
		/*
		Scanner scan=new Scanner(System.in);
		System.out.println("Adýný gir");
		String kisi=scan.nextLine();
		System.out.println(kisi);
		
		System.out.println("Numaraný gir : ");
		int num=scan.nextInt();					//nextInt ile okuma yaptýktan sonra nextLine kullanmak gerekiyor.
		scan.nextLine();
		System.out.println("Tc gir : ");
		String tc=scan.nextLine();
		System.out.println(tc);
		*/
		
		/*
		 * Car car=new Car();
		car.setName("bmw");
		System.out.println(car);
		degis(car);								//Methodlarýný kullanarak objelerin içeriðini deðiþtirebilirsin.
		System.out.println(car);
		
		Car koltuk=new Koltuk("asaf");
		System.out.println(koltuk);
	*/
		
		EnumÖrnek tarife=EnumÖrnek.BOSKONUSMA;	//Yeni bir tarife oluþturuldu.
	System.out.println(tarife+"\t"+tarife.getFiyat());
	//tarife.setFiyat(45);
	System.out.println(tarife);
	EnumSet <Günler> set1,set2,set3,set4;
	
	set2=EnumSet.of(Günler.PAZARTESÝ); 			//Set2'ye pazartesiyi ekler. 
	System.out.println(set2);				
	System.out.println(EnumSet.complementOf(set2));	//Set2 nin deðilini alýr.
	set1=EnumSet.complementOf(set2).range(Günler.ÇARÞAMBA, Günler.CUMARTESÝ);
	System.out.println(set1);
	set3=EnumSet.range(Günler.PERÞEMBE, Günler.PAZAR); //Perþembeden pazara kadar olan günleri alýr.
	System.out.println(set3);
	System.out.println(EnumSet.allOf(Günler.class));	//Bütün günleri yazdýrýr.
	set4=EnumSet.copyOf(set3);							//set4, set3ü kopyalar.
	System.out.println(set4);
	}
	public enum Günler{
		PAZARTESÝ,SALI,ÇARÞAMBA,PERÞEMBE,CUMA,CUMARTESÝ,PAZAR;
	}
	/*public static void degis(Car car) {
		car.setName("audi");
	}*/

	
}
