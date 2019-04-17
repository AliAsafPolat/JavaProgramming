package FileIO;

import java.io.*;
import java.util.LinkedList;

/*Yazma iþlemlerinde dikkat edeceðim bir husus þudur ki eðer yazacaðým bir objenin içinde baþka bir class a ait bir field var ise 
 * onun da serializable olmasý gereklidir.Serializeable yapmadýklarýmý bastýrmak zorundayým.
 * 
 * Okuma iþlemlerinde ise hem input-output hem de typecasting için exception yazmam gerekir.
 * 
 * */

public class test {

	public static void main(String[] args) {
			
		String fileName="Asaf.txt";
		Person p=new Person("AsafReis","1390106");
		
		try {
			ObjectOutputStream writer=new ObjectOutputStream(new FileOutputStream(fileName,true));	//obje yazmak için stream açtýk 
			writer.writeObject(p);																	//yazma iþlemini yaptýk
			System.out.println("Operation successfully completed in "+fileName);
			writer.close();																			//açtýðým streamý kapatmalýyým.
		}catch(IOException e) {
			System.out.println("An exception detected while writing an object!");
			e.printStackTrace();
		}
		Person kiþi = null;
		try {
			ObjectInputStream reader=new ObjectInputStream(new FileInputStream(fileName));			//Dosyadan obje okuyacaðýmý bildiriyorum.
			kiþi =(Person) reader.readObject();														//Okuma iþlemini yapýyorum.
			reader.close();																			//Ýþlem bittikten sonra streamý kapatmalýyým.				
		}catch(IOException e) {
			System.out.println("An exception detected while reading an object!");					//Okuma iþleminde iki tane exception kontrol yapmalýyým.
			e.printStackTrace();																	//Birincisi IO diðeri ise typecasting için olmalý.
		} catch (ClassNotFoundException e) {
			System.out.println("An exception detected while typecasting!");
			e.printStackTrace();
		}
		System.out.println(kiþi.getName()+" "+kiþi.getTc());										//Dosyadan aldýðým bilgileri yazdýrýyorum.
		
	  LinkedList<Person> kiþiler=new LinkedList<Person>();
	  Person p1=new Person("ali","321321");
	  Person p2=new Person("alim","32d3t1");
	  Person p3=new Person("aliye","3s13e1");
	  Person p4=new Person("aliko","3a1f21");
	  kiþiler.add(p4);
	  kiþiler.add(p3);
	  kiþiler.add(p2);
	  kiþiler.add(p1);
	  
	  try {
		  ObjectOutputStream writer=new ObjectOutputStream(new FileOutputStream(fileName));
		  writer.writeObject(kiþiler);
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
