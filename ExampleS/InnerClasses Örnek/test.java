package InnerClasses;
import InnerClasses.Kişi.Çalışan;
	
/* Burada da inner class public tanımlandı ve dışarıda bir classdaki main ile onu kullanmaya başladım.
 * Bu da inner class ın bulunduğu yeri import etmem ile mümkün oldu. 
 * */
public class test {

	public static void main(String[] args) {
		Çalışan []staff=new Çalışan[3];
		Kişi kisi=new Kişi("AsafKral");
		staff[0]=kisi.new Çalışan(1000);
		kisi=new Kişi("Aliye");
		staff[1]=kisi.new Çalışan(564);
		kisi=new Kişi("Alican");
		staff[2]=kisi.new Çalışan(5456);
		
		for(Çalışan c:staff) {
			System.out.println(c);
		}
	}

}
