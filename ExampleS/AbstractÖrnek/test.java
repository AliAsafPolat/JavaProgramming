package DersÖrneði;

public class test {

	public enum size{SMALL,MEDIUM,LARGE,XLARGE;}
	
	
	public static void main(String[] args) {
			size s=size.LARGE;
			
		
		
		Toy toy=new Toy ("123","For Kids",5);
		Clothing giysi=new Clothing("123321", "5-12 yaþ",0,25);
		
		Child kid1=new Child("Asaf",12);
		Child kid2=new Child("Asým",16);
		Child kid3=new Child("Asya",27);
		Child kid4=new Child("Aslý",22);
		
		KinderGarten bahçe=new KinderGarten();
		bahçe.addChild(kid4);
		bahçe.addChild(kid3);
		bahçe.addChild(kid2);
		bahçe.addChild(kid1);
		
		System.out.println(giysi.isSuitable(kid3));
		System.out.println(giysi.isSuitable(kid2));
		System.out.println(giysi.isSuitable(kid1));
		System.out.println(giysi.isSuitable(kid4));
		System.out.println(bahçe.findOldestChild());
		
		

	}

}
