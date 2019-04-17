package InnerClasses;
import InnerClasses.Kiþi.Çalýþan;
	
/* Burada da ýnner class public tanýmlandý ve dýþarýda bir classdaki main ile onu kullanmaya baþladým.
 * Bu da inner class ýn bulunduðu yeri import etmem ile mümkün oldu. 
 * */
public class test {

	public static void main(String[] args) {
		Çalýþan []staff=new Çalýþan[3];
		Kiþi kisi=new Kiþi("AsafKral");
		staff[0]=kisi.new Çalýþan(1000);
		kisi=new Kiþi("Aliye");
		staff[1]=kisi.new Çalýþan(564);
		kisi=new Kiþi("Alican");
		staff[2]=kisi.new Çalýþan(5456);
		
		for(Çalýþan c:staff) {
			System.out.println(c);
		}
	}

}
