package FileIO;

import java.io.*;
import java.util.LinkedList;

/*Yazma işlemlerinde dikkat edeceğim bir husus şudur ki eğer yazacağım bir objenin içinde başka bir class a ait bir field var ise 
 * onun da serializable olması gereklidir.Serializeable yapmadıklarımı bastırmak zorundayım.
 * 
 * Okuma işlemlerinde ise hem input-output hem de typecasting için exception yazmam gerekir.
 * 
 * */

public class test {

	public static void main(String[] args) {
			
		String fileName="Asaf.txt";
		Person p=new Person("AsafReis","1390106");
		
		try {
			ObjectOutputStream writer=new ObjectOutputStream(new FileOutputStream(fileName,true));	//Obje yazmak için stream açtık 
			writer.writeObject(p);									//Yazma işlemini yaptık
			System.out.println("Operation successfully completed in "+fileName);
			writer.close();										//Açtığım streamı kapatmalıyım.
		}catch(IOException e) {
			System.out.println("An exception detected while writing an object!");
			e.printStackTrace();
		}
		Person kişi = null;
		try {
			ObjectInputStream reader=new ObjectInputStream(new FileInputStream(fileName));		//Dosyadan obje okuyacağımı bildiriyorum.
			kişi =(Person) reader.readObject();							//Okuma işlemini yapıyorum.
			reader.close();										//İşlem bittikten sonra streamı kapatmalıyım.				
		}catch(IOException e) {
			System.out.println("An exception detected while reading an object!");			//Okuma işleminde iki tane exception kontrol yapmalıyım.
			e.printStackTrace();									//Birincisi IO diğeri ise typecasting için olmalı.
		} catch (ClassNotFoundException e) {
			System.out.println("An exception detected while typecasting!");
			e.printStackTrace();
		}
		System.out.println(kişi.getName()+" "+kişi.getTc());						//Dosyadan aldığım bilgileri yazdırıyorum.
		
	  LinkedList<Person> kişiler=new LinkedList<Person>();
	  Person p1=new Person("ali","321321");
	  Person p2=new Person("alim","32d3t1");
	  Person p3=new Person("aliye","3s13e1");
	  Person p4=new Person("aliko","3a1f21");
	  kişiler.add(p4);
	  kişiler.add(p3);
	  kişiler.add(p2);
	  kişiler.add(p1);
	  
	  try {
		  ObjectOutputStream writer=new ObjectOutputStream(new FileOutputStream(fileName));
		  writer.writeObject(kişiler);
		  System.out.println("LinkedList is successfully written to file!");
		  writer.close();
	  }catch(IOException e) {
		  System.out.println("An exception detected while writing to file!");
		  e.printStackTrace();
	  }
	  LinkedList<Person> readPersons = null;
	  try {
		  ObjectInputStream reader=new ObjectInputStream(new FileInputStream (fileName));
		  readPersons=(LinkedList<Person>) reader.readObject();
		  System.out.println("LinkedList is successfully read from the file!");
		  reader.close();
	  }catch(IOException|ClassNotFoundException e) {
		  System.out.println("An exception detected while reading a LinkedList from the file!");
		  e.printStackTrace();
	  }
	  
	  for(Person x:readPersons) {
		  System.out.println(x.getName()+" - "+x.getTc());
	  }
	  
	}

}
